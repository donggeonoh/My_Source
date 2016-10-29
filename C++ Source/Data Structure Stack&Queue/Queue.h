#pragma once
#include "Node.h"

class Queue {
private:
	ChainNode* front;
	ChainNode* rear;
public:
	Queue() { front = rear = 0; };
	void Push(const int&);        // ���� �Լ�
	void Pop();                     // ���� �Լ�
	void Print();
	int isEmpty();
};