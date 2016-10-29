#pragma once
#include "Node.h"

class Queue {
private:
	ChainNode* front;
	ChainNode* rear;
public:
	Queue() { front = rear = 0; };
	void Push(const int&);        // 삽입 함수
	void Pop();                     // 삭제 함수
	void Print();
	int isEmpty();
};