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
		
		manager.dataInsert(new Person("최건희",
				Person.MEN,
				"01088759746",
				"부천시소사구심곡본1동"));
		manager.dataInsert(new Person("김민중",
				Person.WOMEN,
				"01025602772",
				"단국대학교 죽전동"));
		manager.dataInsert(new Person("신은총",
				Person.WOMEN,
				"01023343986",
				"웅비홀"));
		manager.dataInsert(new Person("박윤아",
				Person.WOMEN,
				"01022088229",
				"청덕동"));
		manager.dataInsert(new Person("오동건",
				Person.MEN,
				"01033270677",
				"진리관"));
		manager.dataInsert(new Person("최건",
				Person.MEN,
				"01088759746",
				"부천시소사구심곡본1동"));
		manager.dataInsert(new Person("최건희당",
				Person.MEN,
				"01088759746",
				"부천시소사구심곡본1동"));
	}

	public void searchWithName(String string) {
		ArrayList<Person> resultList = new ArrayList<Person>();
		
		System.out.println("컨트롤로가 받은 값 : " + string);
		if(string.equals("")) {
			resultList = manager.printAllData();
			
		} else {
			resultList = manager.searchWithName(string);
		}
		
		mainBoard.printDataList(resultList);
	}
}
