package com.yabou.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.yabou.jpa.Identifiable;

@Entity
public class User implements Identifiable {
	@Id
	@GeneratedValue
	private Long id;

	private String login;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
