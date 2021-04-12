package br.com.pelada_project.peladaproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.pelada_project.peladaproject.models.Matches;
import br.com.pelada_project.peladaproject.models.Users;
import br.com.pelada_project.peladaproject.repository.MatchesRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value="/api")
public class MatchesResouce {
	
	@Autowired
	MatchesRepository matchesRepository;
	
	@GetMapping("/matches")
	public List<Matches> listMatches(){
		return matchesRepository.findAll();
	}
	
	@GetMapping("/matches/{id}")
	public Matches listMatche(@PathVariable(value="id") long id){
		return matchesRepository.findById(id);
	}
	
	@PostMapping("/matches")
	public Matches SaveMatches(@RequestBody Matches matche){
		return matchesRepository.save(matche);
	}
}
