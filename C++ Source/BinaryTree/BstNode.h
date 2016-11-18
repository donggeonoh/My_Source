class BstNode {
private:
	BstNode* left;
	BstNode* right;

	int key;
public:
	friend class BinarySearchTree;
	
	BstNode() {
		left = nullptr;
		right = nullptr;
	}
};