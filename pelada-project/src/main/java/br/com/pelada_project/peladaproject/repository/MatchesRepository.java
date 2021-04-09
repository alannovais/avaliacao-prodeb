package br.com.pelada_project.peladaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pelada_project.peladaproject.models.Matches;

public interface MatchesRepository extends JpaRepository<Matches, Long> { 
	Matches findById (long id);
}