package com.yabou.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;

import com.yabou.jpa.GenericDao;
import com.yabou.jpa.UserAction;

@ContextConfiguration(locations = { "classpath:beans.xml", "classpath:beans-jpa-h2.xml" })
public class CoreTest extends AbstractTestNGSpringContextTests {
	@Autowired
	protected UserAction action;
	@Autowired
	protected GenericDao dao;

	@BeforeMethod
	public void setUp() {
		clearDB();
		createSampleData();
	}

	protected void createSampleData() {
	}

	protected void clearDB() {
		delete(User.class);
	}

	protected <T> void delete(Class<T> entityClass) {
		action.exec("delete from " + entityClass.getSimpleName());
	}
}
