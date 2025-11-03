package com.nhnacademy.springbootjpa.repository;

import com.nhnacademy.springbootjpa.entity.User;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    @NotNull Integer age(Integer age);
}
