package com.dku.dmaps.personcontrolproject.control;

import java.util.ArrayList;

import com.dku.dmaps.personcontrolproject.model.Manager;
import com.dku.dmaps.personcontrolproject.view.MainBoard;
import com.dku.dmaps.personcontrolproject.vo.Person;

public class Controller {
	private Manager manager;
	private MainBoard mainBoard;
	
	public Controller(MainBoard mainBoard) {
		manager = new Manager();
		this.mainBoard = mainBoard;
		initInputData();
	}
	
	private void initInputData() {
		
		manager.dataInsert(new Person("�ְ���",
				Person.MEN,
				"01088759746",
				"��õ�üһ籸�ɰ1��"));
		manager.dataInsert(new Person("�����",
				Person.WOMEN,
				"01025602772",
				"�ܱ����б� ������"));
		manager.dataInsert(new Person("������",
				Person.WOMEN,
				"01023343986",
				"����Ȧ"));
		manager.dataInsert(new Person("������",
				Person.WOMEN,
				"01022088229",
				"û����"));
		manager.dataInsert(new Person("������",
				Person.MEN,
				"01033270677",
				"������"));
		manager.dataInsert(new Person("�ְ�",
				Person.MEN,
				"01088759746",
				"��õ�üһ籸�ɰ1��"));
		manager.dataInsert(new Person("�ְ����",
				Person.MEN,
				"01088759746",
				"��õ�üһ籸�ɰ1��"));
	}

	public void searchWithName(String string) {
		ArrayList<Person> resultList = new ArrayList<Person>();
		
		System.out.println("��Ʈ�ѷΰ� ���� �� : " + string);
		if(string.equals("")) {
			resultList = manager.printAllData();
			
		} else {
			resultList = manager.searchWithName(string);
		}
		
		mainBoard.printDataList(resultList);
	}
}
