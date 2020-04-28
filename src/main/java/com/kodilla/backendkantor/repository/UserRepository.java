package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends  JpaRepository<User, Long> {
    @Override
    List<User> findAll();
    @Override
    User save(User user);
    @Override
    Optional<User> findById(Long id);
}
