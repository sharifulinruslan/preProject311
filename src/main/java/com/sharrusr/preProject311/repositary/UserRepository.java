package com.sharrusr.preProject311.repositary;

import com.sharrusr.preProject311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
