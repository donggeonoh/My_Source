#pragma once
#include "Node.h"

class Stack {
private:
	ChainNode* top;
public:
	Stack() { top = 0; }; // ������ 
	void Push(const int&);        // ���� �Լ�
	void Pop();                     // ���� �Լ�
	void Print();
	int isEmpty();
};