#include <stdio.h>

typedef struct _Node
{
	int *link;
	int number;

}Node;

int main(void)
{
	Node *header = (Node*) malloc(sizeof(Node));
	Node *node1 = (Node*)malloc(sizeof(Node));
	Node *node2 = (Node*)malloc(sizeof(Node));

	header->link = &node1;

	printf("%d", header->link->number);

	return 0;
}