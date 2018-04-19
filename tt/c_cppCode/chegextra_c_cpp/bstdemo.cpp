#include<stdio.h>

struct Node
{
	Node * left;
	Node* right;
	int data;
};
struct Node* newNode(int data)
{
	Node* temp=(Node*)malloc(sizeof(struct Node));
	temp->data=data;
	temp->left=NULL;
	temp->right=NULL:
	return temp;
}
Node* insert(Node* root,int data)
{
	if(root==NULL) return newNode(data);
	if(data<root->data)
		root->left=insert(root->left,data);
	else
		root->right=insert(root->right,data);
	return root;
}
void inorder(Node* root)
{
	if(root!=NULL)
	{
		inorder(root->left);
		printf("%d\n",root->data)
		inorder(root->right);
	}
}
