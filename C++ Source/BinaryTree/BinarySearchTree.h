#pragma once
#include "BstNode.h"

class BinarySearchTree {

private:
	BstNode* root;

public:
	BinarySearchTree() { root = nullptr; PrintMenu(); };
	BstNode* IterSearch(const int &x);
	bool Insert(const int &x);
	bool Remove(const int &x);
	void Inorder(BstNode *node);
	void Inorder();
	void PrintMenu();
};