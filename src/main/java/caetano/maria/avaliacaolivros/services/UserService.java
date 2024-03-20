package caetano.maria.avaliacaolivros.services;

import caetano.maria.avaliacaolivros.dto.UserDTO;
import caetano.maria.avaliacaolivros.models.User;
import caetano.maria.avaliacaolivros.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public void createUser(UserDTO userDTO) {
        User user = new User(userDTO);
        userRepository.save(user);
    }
}
