package com.yabou.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.yabou.DBTest;
import com.yabou.core.Preference;
import com.yabou.core.PreferenceKey;
import com.yabou.core.PreferenceService;

public class PreferenceServiceTest extends DBTest {
	@Autowired
	private PreferenceService preferenceService;

	@Test
	public void testGerPreferences() {
		Preference p1 = new Preference();
		p1.setId(PreferenceKey.SMS_ACCOUNT_ID);
		p1.setValue("fdct001");
		Preference p2 = new Preference();
		p2.setId(PreferenceKey.FILE_TREE_ROOT);
		p2.setValue("./target");
		action.sync(p1);
		action.sync(p2);
		List<Preference> prefs = preferenceService.getPreferences();
		assert prefs.size() == 2;
		assert prefs.get(0).getId().equals(PreferenceKey.FILE_TREE_ROOT);
		assert prefs.get(1).getId().equals(PreferenceKey.SMS_ACCOUNT_ID);
	}
}
