package lab3.controller;

import lab3.dto.AddressDTO;
import lab3.entity.Address;
import lab3.service.impl.AddressServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/address")
public class AddressController {

    private final AddressServiceImpl service;

    private final ModelMapper mapper;

    @GetMapping
    public List<AddressDTO> getAll() {
        return service.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDTO> getById(@PathVariable int id) {
        return service.getById(id)
                .map(this::toDTO)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public AddressDTO save(@RequestBody Address address) {
        return this.toDTO(service.save(address));
    }

    @PutMapping("/{id}")
    public AddressDTO update(@PathVariable int id, @RequestBody Address address) {
        address.setId(id);
        return this.toDTO(service.save(address));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    private AddressDTO toDTO(Address address) {
        return mapper.map(address, AddressDTO.class);
    }

    private Address toEntity(AddressDTO address) {
        return mapper.map(address, Address.class);
    }
}
