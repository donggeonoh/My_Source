#pragma once

#include "Queue.h"
#include "Stack.h"

//���ð� ť �޴� class
class Menu {
private:
	Queue queue;
	Stack stack;
public:
	Menu(){ PrintMenu(); }; //Menu ���� �� PrintMenu() ����
	void PrintMenu();
};