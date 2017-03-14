package com.yabou.core;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class DefaultEntityManagerWrapper implements EntityManagerWrapper {
	@PersistenceContext
	private EntityManager em;

	public <T> T find(Class<T> entityClass, Serializable id) {
		return em.find(entityClass, id);
	}
}
