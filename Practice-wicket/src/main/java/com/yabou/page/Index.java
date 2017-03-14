package com.yabou.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.AbstractReadOnlyModel;

public class Index extends WebPage {
	private static final long serialVersionUID = 1L;

	public Index() {
		add(new Label("hello", new AbstractReadOnlyModel<String>() {

			private static final long serialVersionUID = 1L;

			@Override
			public String getObject() {
				return "Nuncius Workflow System";
			}
		}));
	}
}
