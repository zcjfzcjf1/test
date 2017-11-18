package com.neo.repository;

import com.neo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users findById(long id);

    Long deleteById(Long id);
}