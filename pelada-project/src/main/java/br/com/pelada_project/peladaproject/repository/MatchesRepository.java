package br.com.pelada_project.peladaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.pelada_project.peladaproject.models.Matches;
import br.com.pelada_project.peladaproject.models.MatchesUsers;

public interface MatchesRepository extends JpaRepository<Matches, Long> {
	Matches findById (long id);
}