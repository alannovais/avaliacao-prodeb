package br.com.pelada_project.peladaproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pelada_project.peladaproject.models.Users;
import br.com.pelada_project.peladaproject.repository.UserRepository;

@RestController
@RequestMapping(value="/api")
public class UserResource {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<Users> listUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/users")
	public Users SaveUser(@RequestBody Users user){
		return userRepository.save(user);
	}
}
