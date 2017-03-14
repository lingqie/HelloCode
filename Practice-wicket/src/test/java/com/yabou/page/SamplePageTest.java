package com.yabou.page;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.ttdev.wicketpagetest.MockableSpringBeanInjector;
import com.ttdev.wicketpagetest.WebPageTestContext;
import com.ttdev.wicketpagetest.WicketSeleniumDriver;
import com.yabou.core.Preference;
import com.yabou.core.PreferenceService;

// Note:
//	This is a Unit Test by using a mock bean to simulate the Domain Logic Layer
//
//	Advantage:
//		We don't need the real implementation of a Service and can simulate different branches easily.
//
// 	Disadvantage:
//		We need more codes for simulate the mocking behaviors of a Service Method
public class SamplePageTest extends PageTest {
	private static final long serialVersionUID = 1L;

	abstract class MockPreferenceService implements PreferenceService {
		public List<Preference> getPreferences() {
			Preference p1 = new Preference();
			return Arrays.asList(p1);
		}
	}

	@Test
	public void testDisplayPreferenceCount() {
		MockPreferenceService preferenceService = factory.implementAbstractMethods(MockPreferenceService.class);
		MockableSpringBeanInjector.mockBean("preferenceService", preferenceService);
		WicketSeleniumDriver ws = WebPageTestContext.getWicketSelenium();
		ws.openBookmarkablePage(SamplePage.class);
		assert ws.getText("//count").equals("1");
	}

}
