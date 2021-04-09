package br.com.pelada_project.peladaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pelada_project.peladaproject.models.Users;

public interface LoginRepository extends JpaRepository<Users, Object> { }
