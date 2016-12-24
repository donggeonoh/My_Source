#include <iostream>
using namespace std;

class Bst; // 전방선언
class BstNode {
	friend class Bst; // 프렌드 지정
private:
	int data;
	BstNode *LeftChild;
	BstNode *RightChild;
public:
	BstNode(int element = 0) {
		data = element; LeftChild = 0; RightChild = 0;
	} // 생성자
};

class Bst {
private:
	BstNode *root;
	void Inorder(BstNode *CurrentNode); // 중위순회
public:
	Bst() { root = 0; } // 생성자
	bool IterSearch(const int x); // 탐색
	bool Insert(const int x); // 삽입
	bool Delete(int x); // 삭제
	void Inorder() { Inorder(root); } // 중위순회 호출 함수
};

// 탐색
bool Bst::IterSearch(const int x) {
	for (BstNode *t = root; t;) {
		if (x == t->data) return true; // t가 x랑 같은 경우 - 탐색 성공 - return true
		if (x < t->data) t = t->LeftChild; // x가 t보다 작은 경우 - 왼쪽 자식으로 이동
		else t = t->RightChild; // x가 t보다 큰 경우 - 오른쪽 자식으로 이동
	}
	return false; // 끝까지 간 경우 – 찾는 값 없음 - return false
}


// 삽입
bool Bst::Insert(const int x) {
	BstNode *p = root, *q;
	while (p) {
		q = p;
		if (x == p->data) return false; // x가 이미 존재하는 경우 return
		if (x < p->data) p = p->LeftChild; // x가 p보다 작은 경우 - 왼쪽자식으로 이동
		else p = p->RightChild; // x가 p보다 큰 경우 - 오른쪽 자식으로 이동
	}

	p = new BstNode(x); // p 재활용
	if (!root) root = p;
	else if (x < q->data) q->LeftChild = p;
	else q->RightChild = p;
	return true;
}

// 삭제
bool Bst::Delete(int x) {
	if (!root) return false; // empty인 경우
	BstNode *q = 0, *p = root;

	while (p) {
		if (x == p->data) break; // 찾음
		q = p; // q가 p의 부모 노드를 기억
		if (x < p->data) p = p->LeftChild;
		else p = p->RightChild;
	} // 삭제할 값 없으면 p는 0

	if (p) { // p가 존재할 때
		if (p->LeftChild && p->RightChild) { // 왼쪽, 오른쪽 자식 둘 다 있는 경우
			// p의 오른쪽 자식에서 가장 작은 값(가장 왼쪽 노드)을 찾는다
			// p가 root인 경우에도 동일
			BstNode *t = p; // t에 p를 저장
			p = p->RightChild; // p는 오른쪽 자식으로 이동

			if (p->LeftChild) { // 왼쪽 자식이 있는 경우
				while (p->LeftChild) { // 가장 작은 값을 찾는다
					q = p;
					p = p->LeftChild;
				}
				q->LeftChild = p->RightChild; // 오른쪽 자식이 있거나 null인 경우
			}
			else // 왼쪽 자식이 없는 경우
				t->RightChild = p->RightChild;

			t->data = p->data; // p의 data값을 t의 data에 넣어준다
		}
		else if (p->LeftChild) { // 왼쪽 자식만 있는 경우
			if (p == root) root = p->LeftChild;
			else
				if (p->data < q->data) q->LeftChild = p->LeftChild;
				else q->RightChild = p->LeftChild;
		}
		else if (p->RightChild) { // 오른쪽 자식만 있는 경우
			if (p == root) root = p->RightChild;
			else
				if (p->data < q->data) q->LeftChild = p->RightChild;
				else q->RightChild = p->RightChild;
		}
		else { // 자식이 없는 경우
			if (p == root) root = 0;
			else
				if (p->data < q->data) q->LeftChild = 0;
				else q->RightChild = 0;
		}
		/*
		else {
		BstNode *t;
		if (p->LeftChild) t = p->LeftChild; // 왼쪽 자식만 있는 경우 t에 저장
		else t = p->RightChild; // 오른쪽 자식만 있거나 자식이 없는 경우

		if (p == root) root = t; // p가 root인 경우
		else // root가 아닌 경우
		if (p->data < q->data) q->LeftChild = t; // q의 왼쪽에 t를 연결
		else q->RightChild = t; // q의 오른쪽에 t를 연결
		} */

		delete p; // p를 삭제
		return true;
	}
	return false;
}

// 중위순회
void Bst::Inorder(BstNode *CurrentNode) {
	if (CurrentNode) { // null 아닌 경우
		Inorder(CurrentNode->LeftChild); // 순환호출 - 왼쪽 자식부터
		cout << CurrentNode->data << " "; // 중간에 출력 
		Inorder(CurrentNode->RightChild); // 순환호출 - 오른쪽 자식
	}
}