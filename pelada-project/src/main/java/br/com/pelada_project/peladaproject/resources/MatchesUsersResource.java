package br.com.pelada_project.peladaproject.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pelada_project.peladaproject.models.Matches;
import br.com.pelada_project.peladaproject.models.MatchesUsers;
import br.com.pelada_project.peladaproject.models.Users;
import br.com.pelada_project.peladaproject.repository.MatchesRepository;
import br.com.pelada_project.peladaproject.repository.MatchesUsersRepository;
import br.com.pelada_project.peladaproject.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value = "/api")
public class MatchesUsersResource {

	@Autowired
	MatchesUsersRepository matchesUsersRepository;

	@PostMapping("/matches_users")
	public boolean listUsers(@RequestBody MatchesUsers matcheUsers) {
		Boolean result = false;
		try {
			matchesUsersRepository.save(matcheUsers);
			result = true;
		} catch (Exception exception) {
			result = false;
		}
		return result;
	}

}
