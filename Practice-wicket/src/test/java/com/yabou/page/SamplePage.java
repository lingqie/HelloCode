package com.yabou.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.yabou.core.PreferenceService;

public class SamplePage extends WebPage {

	private static final long serialVersionUID = 1L;

	@SpringBean
	private PreferenceService preferenceService;

	public SamplePage() {
		add(new Label("count", new AbstractReadOnlyModel<String>() {
			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return String.valueOf(preferenceService.getPreferences().size());
			}
		}));
	}
}
