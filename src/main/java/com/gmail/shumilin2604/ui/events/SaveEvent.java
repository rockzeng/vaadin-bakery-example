package com.gmail.shumilin2604.ui.events;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;

public class SaveEvent extends ComponentEvent<Component> {

	public SaveEvent(Component source, boolean fromClient) {
		super(source, fromClient);
	}

}