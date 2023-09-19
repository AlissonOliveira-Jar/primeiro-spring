package com.primeirospring.userdept.repositories;

import com.primeirospring.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
