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
		Humint humint = new Humint("¿Àµ¿°Ç", Humint.MEN, "010-3327-0677", "°­¿øµµ ÀÎÁ¦±º");
		manager.dataInsert(humint);
		
		Humint humint2 = new Humint("±è¹ÎÁß", Humint.MEN, "010-2560-2772", "´Ü±¹´ëÇĞ±³ Á×Àüµ¿");
		manager.dataInsert(humint2);
		
		Humint humint3 = new Humint("½ÅÀºÃÑ", Humint.WOMEN, "010-2334-3986", "´Ü±¹´ëÇĞ±³ ¿õºñÈ¦ ±â¼÷»ç");
		manager.dataInsert(humint3);
		
		Humint humint4 = new Humint("¹ÚÀ±¾Æ", Humint.WOMEN, "010-2208-8229", "Ã»´öµ¿");
		manager.dataInsert(humint4);
		
		Humint humint5 = new Humint("ÃÖ°ÇÈñ", Humint.MEN, "010-8875-9746", "ºÎÃµ½Ã ¼Ò»ç±¸ ½É°îº»1µ¿");
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
