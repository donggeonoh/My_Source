#include "BinarySearchTree.h"
#include <iostream>
using namespace std;

//탐색 메서드
BstNode* BinarySearchTree::IterSearch(const int &x)
// 이진 탐색 트리에서 키 x의 원소를 탐색
{
	for (BstNode* t = root; t;) {
		if (x == t->key) {
			cout << x << "의 위치는 0x" << t << "입니다." << endl;
			return t;
		}
		if (x < t->key) t = t->left;
		else t = t->right;
	}
	
	cout << "입력한 값의 위치를 찾을 수 없습니다." << endl;

	return 0;     // 없을 경우 null을 반환
}

//삽입 메서드
bool BinarySearchTree::Insert(const int &x)
{	// 이진 탐색 트리에 x를 삽입
	// x.key를 탐색, q는 p의 부모
	BstNode *p = root; BstNode *q = 0;
	
	while (p) {
		q = p;
		if (x == p->key) {
			cout << "트리에 입력한 값이 있습니다." << endl;
			return false;
		}
		if (x < p->key) p = p->left;
		else p = p->right;
	}

	p = new BstNode;
	p->left = p->right = 0; p->key = x;
	if (!root) root = p;
	else if (x < q->key) q->left = p;
	else q->right = p;
	return true;
}

bool BinarySearchTree::Remove(const int &x) {
	BstNode *child, *parent;

	child = parent = root;

	/*
	deleteNode = parentNode = root;
	
	while (true) {
		//입력한 key를 찾는다
		if (deleteNode) {
			if (deleteNode->key == x) break;

			parentNode = deleteNode; //parentNode는 deleteNode의 부모를 가리킨다

			if (deleteNode->key > x) //값보다 작으면 왼쪽으로 이동
				deleteNode = deleteNode->left;

			else //값보다 크면 오른쪽으로 이동
				deleteNode = deleteNode->right;
		}

		else {	//값이 존재하지 않을 경우
			cout << "노드가 존재하지 않습니다" << endl;
			return false;
		}
	}

	if (deleteNode) {
		//삭제할 노드의 자식이 없는 경우
		if (deleteNode->left == nullptr && deleteNode->right == nullptr) {
			if (parentNode->left == deleteNode) //삭제할 노드의 부모의 왼쪽 자식인 경우
				delete parentNode->left;
			else //삭제할 노드의 부모의 오른쪽 자식인 경우
				delete parentNode->right;
		}

		//삭제할 노드의 자식이 양쪽 다 있는 경우
		else if (deleteNode->left != nullptr && deleteNode->right != nullptr) {
			//왼쪽트리 중 가장 큰 key의 노드와 노드의 부모
			BstNode *leftTree, *leftParentTree;

			leftTree = leftParentTree = deleteNode->left;
			
			while (leftTree->right != nullptr) {
				leftParentTree = leftTree;
				leftTree = leftTree->right;
			}

			deleteNode->key = leftTree->key;

			if (leftTree->left != nullptr) {
				leftTree->key = leftTree->left->key;
				leftTree->left = nullptr;
			}

			if (leftTree == leftParentTree)
				deleteNode->left = leftTree->left;
			else
				leftParentTree->right = leftParentTree->left;
			
			delete leftTree;
		}

		else if (deleteNode->left != nullptr) {
			deleteNode->right = deleteNode->left;
			delete deleteNode;
		}

		else if (deleteNode->right != nullptr) {
			if (deleteNode == *root) {
				*root = deleteNode->right;
			}
		}

	}
	*/

	// 삭제할 노드를 찾을 때까지 트리 순회
	while (child != nullptr && child->key != x) {
		parent = child; // parent는 Node의 부모를 참조한다

		if (child->key > x) {
			child = child->left;
		}
		else {
			child = child->right;
		}
	}

	if (child == nullptr) {
		cout << "노드가 존재하지 않습니다." << endl; // 트리에 삭제할 노드가 존재하지 않음

		return false;
	}

	else {
		// 제거할 노드가 root이며 child가 왼쪽 노드를 가지지 않는 경우
		if (child == root && child->left == nullptr) {
			root = root->right;
		}

		// root노드가 아닌 제거할 노드가 왼쪽 노드를 가지지 않는 경우
		else if (child != root && child->left == nullptr) {

			if (child == parent->left) {
				// 제거할 노드가 parent 노드의 왼쪽에 위치한 경우
				parent->left = child->right;
			}
			else {
				// 제거할 노드가 parent 노드의 오른쪽에 위치한 경우
				parent->right = child->right;
			}
		}

		//제거할 노드가 2개의 child 노드를 가지고 있는 경우
		else {
			BstNode* rightNode = child;

			// 가장 오른쪽 노드로 이동
			while (rightNode->right != nullptr) {
				rightNode = rightNode->right;
			}

			child->key = rightNode->key; // 제거할 노드의 key를 가장 오른쪽 노드의 key로 바꾼다
			rightNode = nullptr; // 오른쪽 노드를 null로 만듦
		}
	}

	return true;
}

void BinarySearchTree::Inorder() {
	Inorder(root);
}

// 중위순회
void BinarySearchTree::Inorder(BstNode *node) {
	
	//재귀함수 호출

	if (node) {
		Inorder(node->left); // 왼쪽 자식 노드로 이동
		
		cout << node->key << " "; //노드 값 출력
		
		Inorder(node->right); //오른쪽 자식 노드로 이동
	}
}

void BinarySearchTree::PrintMenu()
{
	int selectMenu;
	int value;

	cout << "\n\t\t   2진 탐색 트리" << endl << endl;

	while (true) {
		cout << "\n1. 탐색 2. 삽입 3. 삭제 4. 중위 순회 5. 종료" << endl;
		
		cout << "입력 : ";
		cin >> selectMenu;
		
		switch (selectMenu)
		{
		case 1:
			cout << "값을 입력하세요 : ";
			cin >> value;
			IterSearch(value);
			break;

		case 2:
			cout << "값을 입력하세요 : ";
			cin >> value;
			Insert(value);

			break;
		case 3:
			cout << "값을 입력하세요 : ";
			cin >> value;
			Remove(value);
			break;
		case 4:
			Inorder();
			break;
		case 5:
			cout << "\n\n\t안녕히 가십시오...\n\n\n";
			exit(1);
			break;
		default:
			cout << "잘못 입력 하셨습니다" << endl;
			break;
		}
	}
}

int main(void) {
	BinarySearchTree t;

	return 0;
}