package pl.ardas.taskapp.user;

import pl.ardas.taskapp.user.dto.UserDto;

import java.util.Optional;

public interface UserQueryRepository {

    Optional<UserDto> findDtoByUsername(String username);
}
