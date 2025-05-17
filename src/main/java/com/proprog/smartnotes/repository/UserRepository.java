package com.proprog.smartnotes.repository;

import com.proprog.smartnotes.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
