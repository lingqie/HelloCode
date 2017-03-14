package com.yabou.core;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.apache.wicket.util.io.IClusterable;

import com.yabou.jpa.Identifiable;

@Entity
public class Preference implements IClusterable, Identifiable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Enumerated(EnumType.STRING)
	private PreferenceKey id;
	private String value;

	public PreferenceKey getId() {
		return id;
	}

	public void setId(PreferenceKey id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
