package com.telephoneManager.model;

import java.util.ArrayList;

import com.telephoneManager.VO.Data;

public class Manager {
	
	private ArrayList<Data> dataList = new ArrayList<Data>();
	
	public Manager() {
		Data data = new Data("������", Data.MEN, "01033270677", "������ ������");
		insertData(data);
		
		data = new Data("�����", Data.MEN, "01025602772", "�ܱ����б� ������");
		insertData(data);
		
		data = new Data("������", Data.WOMEN, "01023343986", "�ܱ����б� ����Ȧ �����");
		insertData(data);
		
		data = new Data("������", Data.WOMEN, "01022088229", "û����");
		insertData(data);
		
		data = new Data("�ְ���", Data.MEN, "01088759746", "��õ�� �һ籸 �ɰ 1��");
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
