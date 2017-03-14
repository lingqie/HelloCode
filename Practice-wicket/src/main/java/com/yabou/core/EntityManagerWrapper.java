package com.yabou.core;

import java.io.Serializable;

public interface EntityManagerWrapper {
	public <T> T find(Class<T> entityClass, Serializable id);
}
