#pragma once
#include "Node.h"

class Stack {
private:
	ChainNode* top;
public:
	Stack() { top = 0; }; // 생성자 
	void Push(const int&);        // 삽입 함수
	void Pop();                     // 삭제 함수
	void Print();
	int isEmpty();
};