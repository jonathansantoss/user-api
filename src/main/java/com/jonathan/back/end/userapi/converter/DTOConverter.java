package com.jonathan.back.end.userapi.converter;

import com.jonathan.back.end.userapi.model.User;
import dto.UserDTO;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class DTOConverter {

    public static UserDTO convert(User user) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserDTO.class);
    }

    public static List<UserDTO> convertUsersForUsersDTO(List<User> users) {
        return users.stream().map(DTOConverter::convert).collect(Collectors.toList());
    }

    public static User convert(UserDTO userDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(userDTO, User.class);
    }
}
