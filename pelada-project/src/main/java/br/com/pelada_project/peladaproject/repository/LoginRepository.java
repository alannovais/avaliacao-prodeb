package br.com.pelada_project.peladaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.pelada_project.peladaproject.models.Users;

public interface LoginRepository extends JpaRepository<Users, Long> {
	
	@Query(value = "SELECT * FROM USERS WHERE ALIAS_NAME=?1 AND PASSWORD=?2", nativeQuery = true)
	Users findByLogin (String userName, String passwoard);
}
