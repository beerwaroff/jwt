package ru.beerwaroff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.beerwaroff.entities.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
