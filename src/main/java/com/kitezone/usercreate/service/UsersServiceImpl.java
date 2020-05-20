package com.kitezone.usercreate.service;

import com.kitezone.usercreate.shared.UserDto;

import java.util.UUID;

public class UsersServiceImpl implements UsersService {

    @Override
    public UserDto createUser(UserDto useDetails) {

        useDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }
}
