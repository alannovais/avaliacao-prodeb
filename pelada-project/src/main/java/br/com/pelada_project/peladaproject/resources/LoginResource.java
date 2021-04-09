package br.com.pelada_project.peladaproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pelada_project.peladaproject.models.Users;
import br.com.pelada_project.peladaproject.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping(value="/api")
public class LoginResource {
	
	@Autowired
	UserRepository logRepository;
	
	@GetMapping("/login/{username}/{password}")
	public boolean listUsers(@PathVariable(value="username") String username,
			@PathVariable(value="password") String password) {
		Users users = new Users();
		users.setAlias_name(username);
		users.setPassword(password);
		//return logRepository.findOne(users);
		return true;
	}
	
}
