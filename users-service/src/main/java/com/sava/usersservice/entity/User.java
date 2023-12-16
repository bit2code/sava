package com.sava.usersservice.entity;

import com.sava.communicationprotocol.data.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String name;

    public static UserDTO toUserDTO(User user) {
        return UserDTO.builder()//
                .id(user.getId())//
                .name(user.getName())//
                .build();
    }
}
