#include "Queue.h"

#include <iostream>
using namespace std;

void Queue::Push(const int& e) {
	if (front == 0) front = rear = new ChainNode(e, 0); //공백 큐 
	else rear = rear->link = new ChainNode(e, 0); //노드를 삽입하고 rear를 수정함 
}

void Queue::Pop() {
	if (isEmpty()) return;	// 공백 큐인 경우 return

	ChainNode* delNode = front;
	front = front->link;	//앞의 노드를 제거 

	delete delNode;			//노드 반환 
}

void Queue::Print() {
	ChainNode* p = front;

	if (isEmpty()) return;	// 공백 큐인 경우 return

	cout << endl;
	cout << "FIFO 순 : ";

	for (; p != NULL; p = p->link) {	//Queue의 데이터 출력
		cout << p->data << " ";
	}

	cout << endl;
}

//노드가 없을 경우 1을 반환한다. 있는경우 0
int Queue::isEmpty() {
	if (!front) {
		cout << "\n\t노드가 없습니다." << endl << endl;
		return 1;
	}

	return 0;
}