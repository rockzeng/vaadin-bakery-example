package com.gmail.shumilin2604.ui.utils.converters;

import com.vaadin.flow.templatemodel.ModelEncoder;
import com.gmail.shumilin2604.ui.dataproviders.DataProviderUtil;
import com.gmail.shumilin2604.ui.utils.FormattingUtils;

public class CurrencyFormatter implements ModelEncoder<Integer, String> {

	@Override
	public String encode(Integer modelValue) {
		return DataProviderUtil.convertIfNotNull(modelValue, FormattingUtils::formatAsCurrency);
	}

	@Override
	public Integer decode(String presentationValue) {
		throw new UnsupportedOperationException();
	}
}
