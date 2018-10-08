package com.gmail.shumilin2604.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.shumilin2604.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}