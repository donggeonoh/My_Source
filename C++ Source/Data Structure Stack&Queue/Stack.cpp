#include "Stack.h"

#include <iostream>
using namespace std;

void Stack::Push(const int& e) {
	top = new ChainNode(e, top);
}

void Stack::Pop()	//스택에서 톱 노드를 삭제하고 값을 x에 저장한 후에 x의 주소를 반환
{
	if (isEmpty()) return; //빈 스택이면 return 

	ChainNode* delNode = top;
	top = top->link;   //top 위치를 다음 노드로 이동
	delete delNode;   //노드 삭제
}

void Stack::Print() {
	ChainNode* p = top;

	if (isEmpty()) return;	//빈 스택이면 return

	cout << endl;
	cout << "LIFO 순 : ";

	for (; p != NULL; p = p->link) {	//Stack을 LIFO순으로 출력
		cout << p->data << " ";
	}

	cout << endl;
}

//노드가 없을경우 1 반환 있을경우 0 반환
int Stack::isEmpty() {
	if (!top) {
		cout << "\n\t노드가 없습니다." << endl << endl;
		return 1;
	}

	return 0;
}