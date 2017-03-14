package com.yabou.page;

import java.io.Serializable;

import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.ttdev.wicketpagetest.MockableSpringBeanInjector;
import com.yabou.core.EntityManagerWrapper;
import com.yabou.jpa.Identifiable;

public class EntityModel<T extends Identifiable> extends
		LoadableDetachableModel<T> {

	private static final long serialVersionUID = 1L;
	@SpringBean
	private EntityManagerWrapper em;

	private Serializable id;
	private Class<? extends Identifiable> targetClass;

	public EntityModel(T identifiable) {
		MockableSpringBeanInjector.get().inject(this);
		this.id = identifiable.getId();
		this.targetClass = identifiable.getClass();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected T load() {
		return (T) em.find(targetClass, id);
	}
}
