package com.yabou;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ttdev.wicketpagetest.Configuration;
import com.ttdev.wicketpagetest.WebPageTestContext;

public class TestFixture {

	@BeforeSuite
	public void setUp() throws Exception {
		Configuration cfg = new Configuration();
		cfg.setOverrideWebXml("web-page-test.xml");
		WebPageTestContext.beforePageTests(cfg);
	}

	@AfterSuite
	public void tearDown() throws Exception {
		WebPageTestContext.afterPageTests();
	}
}
