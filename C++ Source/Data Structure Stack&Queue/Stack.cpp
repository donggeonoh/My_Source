#include "Stack.h"

#include <iostream>
using namespace std;

void Stack::Push(const int& e) {
	top = new ChainNode(e, top);
}

void Stack::Pop()	//���ÿ��� �� ��带 �����ϰ� ���� x�� ������ �Ŀ� x�� �ּҸ� ��ȯ
{
	if (isEmpty()) return; //�� �����̸� return 

	ChainNode* delNode = top;
	top = top->link;   //top ��ġ�� ���� ���� �̵�
	delete delNode;   //��� ����
}

void Stack::Print() {
	ChainNode* p = top;

	if (isEmpty()) return;	//�� �����̸� return

	cout << endl;
	cout << "LIFO �� : ";

	for (; p != NULL; p = p->link) {	//Stack�� LIFO������ ���
		cout << p->data << " ";
	}

	cout << endl;
}

//��尡 ������� 1 ��ȯ ������� 0 ��ȯ
int Stack::isEmpty() {
	if (!top) {
		cout << "\n\t��尡 �����ϴ�." << endl << endl;
		return 1;
	}

	return 0;
}