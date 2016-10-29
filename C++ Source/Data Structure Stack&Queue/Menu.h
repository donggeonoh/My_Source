#pragma once

#include "Queue.h"
#include "Stack.h"

//스택과 큐 메뉴 class
class Menu {
private:
	Queue queue;
	Stack stack;
public:
	Menu(){ PrintMenu(); }; //Menu 생성 시 PrintMenu() 실행
	void PrintMenu();
};