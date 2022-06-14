package pl.ardas.taskapp.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.ardas.taskapp.user.UserQueryRepository;
import pl.ardas.taskapp.user.dto.UserDto;

import java.util.ArrayList;
import java.util.Optional;

@Service
class UserDetailsServiceImpl implements UserDetailsService {

    private final UserQueryRepository userQueryRepository;

    UserDetailsServiceImpl(UserQueryRepository repository) {
        this.userQueryRepository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        Optional<UserDto> userDtoOptional = userQueryRepository.findDtoByUsername(username);

        if(userDtoOptional.isEmpty())
            throw new UsernameNotFoundException(String.format("User with username %s not found", username));

        UserDto userDto = userDtoOptional.get();

        return new User(userDto.getUsername(), userDto.getPassword(), new ArrayList<>());
    }
}
