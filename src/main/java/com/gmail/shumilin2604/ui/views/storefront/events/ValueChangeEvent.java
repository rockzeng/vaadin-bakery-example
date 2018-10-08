package com.gmail.shumilin2604.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.shumilin2604.ui.views.orderedit.OrderItemsEditor;

public class ValueChangeEvent extends ComponentEvent<OrderItemsEditor> {

	public ValueChangeEvent(OrderItemsEditor component) {
		super(component, false);
	}
}