package com.yabou.page;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ttdev.wicketpagetest.WebPageTestContext;
import com.ttdev.wicketpagetest.WicketSeleniumDriver;
import com.yabou.core.Preference;
import com.yabou.core.PreferenceKey;
import com.yabou.core.PreferenceService;

//Note:
//	This is a Unit Test by using a real implementation of a Service
//
//	Advantage:
//		Less code is needed
//		This kind of tests are always use to test displaying a list Entities
//		as the EntityModel is used on each row. Using this test can greatly
//		simplify our code.
//
//	Disadvantage:
//		1. We need to wait for the implementation of Service Methods;
//		2. We duplicate the Unit Tests of a Service Method which they are tested before.
//

public class SamplePageTest2 extends PageTest {
	private static final long serialVersionUID = 1L;

	@Test
	public void testDisplayPreferenceCount() {
		WicketSeleniumDriver ws = WebPageTestContext.getWicketSelenium();
		ws.openBookmarkablePage(SamplePage.class);
		assert ws.getText("//count").equals("0");

		Preference p1 = new Preference();
		p1.setId(PreferenceKey.SMS_ACCOUNT_ID);
		p1.setValue("fdct001");
		Preference p2 = new Preference();
		p2.setId(PreferenceKey.FILE_TREE_ROOT);
		p2.setValue("./target");
		action.sync(p1);
		action.sync(p2);
		ws.openBookmarkablePage(SamplePage.class);
		assert ws.getText("//count").equals("2");
	}

	abstract class MockPreferenceService implements PreferenceService {
		public List<Preference> getPreferences() {
			Preference p1 = new Preference();
			return Arrays.asList(p1);
		}
	}
}
