package com.yabou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;

import com.yabou.core.Preference;
import com.yabou.jpa.GenericDao;
import com.yabou.jpa.UserAction;

@ContextConfiguration(locations = { "classpath:beans.xml", "classpath:beans-jpa-h2.xml","classpath:beans-mocks.xml" })
public class DBTest extends AbstractTestNGSpringContextTests {
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
		// Note: remember to add codes to remove all data before a test method
		delete(Preference.class);
	}

	protected <T> void delete(Class<T> entityClass) {
		action.exec("delete from " + entityClass.getSimpleName());
	}
}
