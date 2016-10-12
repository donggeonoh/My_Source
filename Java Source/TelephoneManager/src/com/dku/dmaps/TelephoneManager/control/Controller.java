package com.dku.dmaps.TelephoneManager.control;

import java.util.ArrayList;

import com.dku.dmaps.TelephoneManager.VO.Humint;
import com.dku.dmaps.TelephoneManager.model.Manager;
import com.dku.dmaps.TelephoneManager.view.MenuBoard;

public class Controller {
	private Manager manager;
	private MenuBoard mainBoard;
	
	public Controller(MenuBoard mainBoard) {
		manager = new Manager();
		this.mainBoard = mainBoard;
		
		initInputData();
	}
	
	private void initInputData() {
		Humint humint = new Humint("������", Humint.MEN, "010-3327-0677", "������ ������");
		manager.dataInsert(humint);
		
		Humint humint2 = new Humint("�����", Humint.MEN, "010-2560-2772", "�ܱ����б� ������");
		manager.dataInsert(humint2);
		
		Humint humint3 = new Humint("������", Humint.WOMEN, "010-2334-3986", "�ܱ����б� ����Ȧ �����");
		manager.dataInsert(humint3);
		
		Humint humint4 = new Humint("������", Humint.WOMEN, "010-2208-8229", "û����");
		manager.dataInsert(humint4);
		
		Humint humint5 = new Humint("�ְ���", Humint.MEN, "010-8875-9746", "��õ�� �һ籸 �ɰ1��");
		manager.dataInsert(humint5);
	}

	public void searchWithName(String string) {
		ArrayList<Humint> resultList = new ArrayList<Humint>();
		
		if(string.equals("")) {
			resultList = manager.printAllData();
		} else {
			resultList = manager.searchWithName(string);
		}
		
		mainBoard.printDataList(resultList);
	}
	
}
