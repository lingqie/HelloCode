package com.yabou.jpa;

public interface UserAction {
	public void sync(Identifiable entity);

	public void delete(Identifiable entity);

	public void exec(String jpql);
}
