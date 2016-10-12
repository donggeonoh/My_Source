package com.telephoneManager.model;

import java.util.ArrayList;

import com.telephoneManager.VO.Data;

public class Manager {
	
	private ArrayList<Data> dataList = new ArrayList<Data>();
	
	public Manager() {
		Data data = new Data("오동건", Data.MEN, "01033270677", "강원도 인제군");
		insertData(data);
		
		data = new Data("김민중", Data.MEN, "01025602772", "단국대학교 죽전동");
		insertData(data);
		
		data = new Data("신은총", Data.WOMEN, "01023343986", "단국대학교 웅비홀 기숙사");
		insertData(data);
		
		data = new Data("박윤아", Data.WOMEN, "01022088229", "청덕동");
		insertData(data);
		
		data = new Data("최건희", Data.MEN, "01088759746", "부천시 소사구 심곡본 1동");
		insertData(data);
	}
	
	public void insertData(Data data) {
		dataList.add(data);
	}
	
	public ArrayList<Data> searchAllData() {
		return dataList;
	}
	
	public ArrayList<Data> searchData(String str) {
		
		ArrayList<Data> resultData = new ArrayList<Data>();
		
		for(Data data : dataList) {
			if(data.getName().contains(str)) {
				resultData.add(data);
			}
		}
		
		return resultData;
	}
	
}
