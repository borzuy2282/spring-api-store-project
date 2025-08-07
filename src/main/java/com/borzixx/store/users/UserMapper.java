package com.borzixx.store.users;

import com.borzixx.store.users.dtos.RegisterUserRequest;
import com.borzixx.store.users.dtos.UpdateUserRequest;
import com.borzixx.store.users.dtos.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest userRequest);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
