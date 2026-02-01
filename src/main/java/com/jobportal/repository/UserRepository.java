
//This interface is responsible for database operations related to the User entity.
package com.jobportal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
	
	
	
//	Optional is a wrapper class (introduced in Java 8) that:
//		May contain a value
//		Or may be empty
//	Optional<User> is used to safely handle the case where a User may or may not exist in the database.
//	In simple words  to avoid NullPointerException and write safer code.

}
