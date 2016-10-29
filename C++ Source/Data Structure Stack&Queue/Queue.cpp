#include "Queue.h"

#include <iostream>
using namespace std;

void Queue::Push(const int& e) {
	if (front == 0) front = rear = new ChainNode(e, 0); //���� ť 
	else rear = rear->link = new ChainNode(e, 0); //��带 �����ϰ� rear�� ������ 
}

void Queue::Pop() {
	if (isEmpty()) return;	// ���� ť�� ��� return

	ChainNode* delNode = front;
	front = front->link;	//���� ��带 ���� 

	delete delNode;			//��� ��ȯ 
}

void Queue::Print() {
	ChainNode* p = front;

	if (isEmpty()) return;	// ���� ť�� ��� return

	cout << endl;
	cout << "FIFO �� : ";

	for (; p != NULL; p = p->link) {	//Queue�� ������ ���
		cout << p->data << " ";
	}

	cout << endl;
}

//��尡 ���� ��� 1�� ��ȯ�Ѵ�. �ִ°�� 0
int Queue::isEmpty() {
	if (!front) {
		cout << "\n\t��尡 �����ϴ�." << endl << endl;
		return 1;
	}

	return 0;
}