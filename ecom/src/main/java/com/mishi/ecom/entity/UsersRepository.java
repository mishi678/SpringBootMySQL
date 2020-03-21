package com.mishi.ecom.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	Users findByUsername(String username);
}
