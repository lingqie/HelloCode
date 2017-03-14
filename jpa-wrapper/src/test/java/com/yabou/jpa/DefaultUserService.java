package com.yabou.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yabou.jpa.GenericDao;
import com.yabou.jpa.Restrictions;

@Service
public class DefaultUserService implements UserService {
	@Autowired
	private GenericDao dao;

	@Override
	@Transactional
	public User findUser(String login) {
		List<User> users = dao.list(User.class, Arrays.asList(Restrictions.eq("login", login)));
		if (users.isEmpty()) {
			throw new UserNotFoundException();
		}
		return users.get(0);
	}
}
