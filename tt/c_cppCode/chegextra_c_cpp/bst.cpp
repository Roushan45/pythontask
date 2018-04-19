#include<iostream>

struct BinaryTree
{
	struct BinaryTree *leftNode;
	struct BinaryTree *RightNode;
	int data;
}*treeNode;

class BinarySearchTree
{
	public:
		void addData(int data);
		void print();
		BinarySearchTree();
};

int main()
{
	//int i = getData();
}
BinarySearchTree::BinarySearchTree()
{
	treeNode = NULL;
}
void BinarySearchTree::addData(int data)
{
	
}
void BinarySearchTree::print()
{
	
}
int getData()
{
	return 5;
}
