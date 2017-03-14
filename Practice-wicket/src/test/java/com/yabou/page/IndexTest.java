package com.yabou.page;

import org.testng.annotations.Test;

import com.ttdev.wicketpagetest.WebPageTestContext;
import com.ttdev.wicketpagetest.WicketSeleniumDriver;
import com.yabou.page.Index;

public class IndexTest extends PageTest {
	private static final long serialVersionUID = 1L;

	@Test
	public void testDisplayHelloMessage() {
		WicketSeleniumDriver ws = WebPageTestContext.getWicketSelenium();
		ws.openBookmarkablePage(Index.class);
		assert ws.getText("//hello").equals("Nuncius Workflow System");
	}
}
