package com.gmail.shumilin2604.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.shumilin2604.backend.data.entity.Product;
import com.gmail.shumilin2604.ui.views.orderedit.OrderItemEditor;

public class ProductChangeEvent extends ComponentEvent<OrderItemEditor> {

	private final Product product;

	public ProductChangeEvent(OrderItemEditor component, Product product) {
		super(component, false);
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

}