package edu.miu.productreview.mapper;

import edu.miu.productreview.domain.User;
import edu.miu.productreview.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserMapper {
    private final ModelMapper modelMapper;
    public UserDto toDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }
    public User toEntity(UserDto user) {
        return modelMapper.map(user, User.class);
    }
    public List<UserDto> toDtos(List<User> users) {
        return users.stream().map(this::toDto).toList();
    }
    public List<User> toEntities(List<UserDto> users) {
        return users.stream().map(this::toEntity).toList();
    }
}
