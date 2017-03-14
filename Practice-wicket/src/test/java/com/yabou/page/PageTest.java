package com.yabou.page;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.io.IClusterable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;

import com.google.gson.Gson;
import com.ttdev.wicketpagetest.ChangeResistantMockFactory;
import com.ttdev.wicketpagetest.MockableSpringBeanInjector;
import com.ttdev.wicketpagetest.WebPageTestContext;
import com.ttdev.wicketpagetest.WicketSeleniumDriver;
import com.yabou.DBTest;

public class PageTest extends DBTest implements IClusterable {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PageTest.class);
	protected ChangeResistantMockFactory factory;

	@BeforeMethod
	public void clearMockedBeans() {
		LOGGER.debug("clearing ever mocked beans");
		MockableSpringBeanInjector.clearMockBeans();
		factory = new ChangeResistantMockFactory(this);
	}

	public void pause(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void waitServer() {
		
	}
}
