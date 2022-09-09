package henry.waasep2022springdata.controller;

import henry.waasep2022springdata.dto.AddressDto;
import henry.waasep2022springdata.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/addresses")
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public void save(@RequestBody AddressDto addressDto) {
        addressService.save(addressDto);
    }

    @GetMapping
    public List<AddressDto> getAll() {
        return addressService.findAll();
    }

    @PutMapping("/{addressId}")
    public void update(@PathVariable int addressId, @RequestBody AddressDto addressDto) {
        addressService.update(addressId, addressDto);
    }

    @DeleteMapping("/{addressId}")
    public AddressDto delete(@PathVariable int addressId) {
        return addressService.delete(addressId);
    }
}
