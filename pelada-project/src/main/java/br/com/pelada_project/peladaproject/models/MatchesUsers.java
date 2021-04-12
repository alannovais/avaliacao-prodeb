package br.com.pelada_project.peladaproject.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "users_matches")
public class MatchesUsers implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private Long users_id;

	private Long matches_id;

	public Long getusers_id() {
		return users_id;
	}

	public void setusers_id(Long users_id) {
		this.users_id = users_id;
	}

	public Long getmatches_id() {
		return matches_id;
	}

	public void setmatches_id(Long matches_id) {
		this.matches_id = matches_id;
	}
}
