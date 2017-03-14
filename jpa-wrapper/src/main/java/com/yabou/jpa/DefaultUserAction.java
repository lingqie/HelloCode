package com.yabou.jpa;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DefaultUserAction implements UserAction {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void sync(Identifiable entity) {
		boolean autoId = isAutoID(entity);
		boolean freshAutoIdEntity = autoId && entity.getId() == null;
		boolean freshAssignIdEntity = !autoId && !em.contains(entity);
		if (freshAutoIdEntity || freshAssignIdEntity) {
			em.persist(entity);
			return;
		}
		em.merge(entity);
	}

	@SuppressWarnings("unchecked")
	private boolean isAutoID(Identifiable entity) {
		Class<? extends Identifiable> entityClass = entity.getClass();
		List<Field> fields = new ArrayList<Field>();
		while (entityClass != null) {
			fields.addAll(Arrays.asList(entityClass.getDeclaredFields()));
			entityClass = (Class<? extends Identifiable>) entityClass.getSuperclass();
		}
		for (Field field : fields) {
			if (field.isAnnotationPresent(GeneratedValue.class)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void delete(Identifiable entity) {
		em.remove(em.merge(entity));
	}

	@Override
	public void exec(String jpql) {
		em.createQuery(jpql).executeUpdate();
	}
}
