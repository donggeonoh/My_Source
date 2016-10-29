#include "Menu.h"

#include <iostream>
using namespace std;

void Menu::PrintMenu() {

	int inputMenu;	// 메뉴 숫자를 입력받는다
	int inputNode;	// Node의 데이터를 입력받는다

	while (true) {
		inputMenu = 0;
		inputNode = 0;

		cout << "\n\t메뉴를 선택하세요" << endl << endl;
		cout << "1.스택에 삽입	2.큐에 삽입" << endl;
		cout << "3.스택에서 삭제	4.큐에서 삭제" << endl;
		cout << "5.스택 내용보기	6.큐 내용 보기" << endl;
		cout << "7.끝내기" << endl << endl;
		cout << "입력 : ";

		cin >> inputMenu;
		if (inputMenu > 0 && inputMenu < 3) {// 삽입 할 때만 inputNode를 입력받는다
			cin >> inputNode;	// 그 외 inputNode 입력을 받지 않는다
		}

		switch (inputMenu)
		{
		case 1:
			stack.Push(inputNode);
			break;
		case 2:
			queue.Push(inputNode);
			break;
		case 3:
			stack.Pop();
			break;
		case 4:
			queue.Pop();
			break;
		case 5:
			stack.Print();
			break;
		case 6:
			queue.Print();
			break;
		case 7:
			cout << "\n\t안녕히 가십시오!" << endl << endl;
			return;
		default:
			cout << "\n잘못 입력하셨습니다." << endl;
		}
	}
}
