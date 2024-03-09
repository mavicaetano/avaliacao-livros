package caetano.maria.avaliacaolivros.repository;

import caetano.maria.avaliacaolivros.models.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<User> findByEmail(String email);
}
