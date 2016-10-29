#pragma once

class ChainNode {
	friend class Stack;
	friend class Queue;
private:
	int data;
	ChainNode *link;
public:
	ChainNode(int element = 0, ChainNode* next = 0)  // ������
	{
		data = element; link = next;
	}
};