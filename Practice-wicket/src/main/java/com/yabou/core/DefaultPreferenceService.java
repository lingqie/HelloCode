package com.yabou.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yabou.jpa.GenericDao;
import com.yabou.jpa.Order;

@Service
public class DefaultPreferenceService implements PreferenceService {
	@Autowired
	private GenericDao dao;

	@Transactional
	public List<Preference> getPreferences() {
		return dao.list(Preference.class, Order.asc("id"));
	}
}
