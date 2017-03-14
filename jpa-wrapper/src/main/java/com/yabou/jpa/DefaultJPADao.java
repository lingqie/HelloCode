package com.yabou.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class DefaultJPADao extends AbstractDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public EntityManager getEm() {
		return em;
	}
}
