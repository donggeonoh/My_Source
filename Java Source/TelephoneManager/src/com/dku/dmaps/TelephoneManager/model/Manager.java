package com.dku.dmaps.TelephoneManager.model;

import java.util.ArrayList;

import com.dku.dmaps.TelephoneManager.VO.Humint;

public class Manager {
	
	private ArrayList<Humint> dataList = new ArrayList<Humint>();
	
	public Manager() {
		
	}

	public void dataInsert(Humint data) {
		dataList.add(data);
	}

	public ArrayList<Humint> printAllData() {
		return dataList;
	}

	public ArrayList<Humint> searchWithName(String string) {
		ArrayList<Humint> resultList = new ArrayList<Humint>();
		
		for (Humint humint : dataList) {
			if(humint.getName().contains(string)) {
				resultList.add(humint);
			}
		}
		
		return resultList;
	}
	
	
	
}
