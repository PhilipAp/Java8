package com.infotech.myinterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.infotech.myinterface.MyInterface;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> integerList) {
		Integer max = Collections.max(integerList);
		return max;
	}

}
