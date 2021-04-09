package br.com.pelada_project.peladaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pelada_project.peladaproject.models.Matches;
import br.com.pelada_project.peladaproject.models.Users;

public interface Matches_UsersRepository extends JpaRepository<Matches, Users> { }
