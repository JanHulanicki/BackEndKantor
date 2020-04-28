package com.kodilla.backendkantor.repository;

import com.kodilla.backendkantor.domain.ActionType;
import com.kodilla.backendkantor.domain.Product;
import com.kodilla.backendkantor.domain.UserActivity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserActivityRepository extends JpaRepository<UserActivity, Long> {
    @Override
    List<UserActivity> findAll();

    @Override
    Product save(UserActivity userActivity);

    @Override
    Optional<UserActivity> findById(Long activityId);

    @Override
    void deleteById(Long activityId);
}
