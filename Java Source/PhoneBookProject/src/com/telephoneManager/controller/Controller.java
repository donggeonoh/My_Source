package com.telephoneManager.controller;

import java.util.ArrayList;

import com.telephoneManager.VO.Data;
import com.telephoneManager.model.Manager;
import com.telephoneManager.view.Board;
import com.telephoneManager.view.MainBoard;

public class Controller {
	private Manager manager;
	private ArrayList<Data> resultList;
	
	public Controller() {
		manager = new Manager();
	}

	public void searchData(String str) {
		
		resultList = new ArrayList<Data>();
		
		if(str.equals("")) {
			resultList = manager.searchAllData();
			
		} else if (str.contains(str)) {
			resultList = manager.searchData(str);
		}
	}
		
	public void saveData(Data data) {
		manager.insertData(data);
		
	}

	public ArrayList<Data> getResultList() {
		return resultList;
	}

}
