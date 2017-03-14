package com.yabou.page;

import com.ttdev.wicketpagetest.WebAppJettyConfiguration;
import com.ttdev.wicketpagetest.WicketAppJettyLauncher;

public class ManualTest {
	public static void main(String[] args) {
		WicketAppJettyLauncher launcher = new WicketAppJettyLauncher();
		WebAppJettyConfiguration cfg = new WebAppJettyConfiguration();
		cfg.setOverrideWebXml("web-manual-test.xml");
		launcher.startAppInJetty(cfg);
	}
	// 1. Jumbotron:
	//		http://localhost:8888/app/wicket/bookmarkable/io.pisoft.nuncius.page.Jumbotron
}