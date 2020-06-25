package com.info.impl;

import java.util.Collections;
import java.util.List;

import com.info.MyInterface;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public Integer getMinNum(List<Integer> intList) {
		Integer min = Collections.min(intList);
		return min;
	}
}
