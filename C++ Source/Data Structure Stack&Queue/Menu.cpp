#include "Menu.h"

#include <iostream>
using namespace std;

void Menu::PrintMenu() {

	int inputMenu;	// �޴� ���ڸ� �Է¹޴´�
	int inputNode;	// Node�� �����͸� �Է¹޴´�

	while (true) {
		inputMenu = 0;
		inputNode = 0;

		cout << "\n\t�޴��� �����ϼ���" << endl << endl;
		cout << "1.���ÿ� ����	2.ť�� ����" << endl;
		cout << "3.���ÿ��� ����	4.ť���� ����" << endl;
		cout << "5.���� ���뺸��	6.ť ���� ����" << endl;
		cout << "7.������" << endl << endl;
		cout << "�Է� : ";

		cin >> inputMenu;
		if (inputMenu > 0 && inputMenu < 3) {// ���� �� ���� inputNode�� �Է¹޴´�
			cin >> inputNode;	// �� �� inputNode �Է��� ���� �ʴ´�
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
			cout << "\n\t�ȳ��� ���ʽÿ�!" << endl << endl;
			return;
		default:
			cout << "\n�߸� �Է��ϼ̽��ϴ�." << endl;
		}
	}
}
