/*

#include<stdio.h>
#include<math.h>

struct point{
	int x, y;
};

int main()
{
	struct point arr[5];
	int i, j;
	double distance, min;
	int minindex1 = 0, minindex2 = 1;	//point ����ü arr�� index�� ����

	//5���� ���� �Է¹޴´�
	for (i = 0; i < 5; i++) {
		printf("��ǥ �� �Է� : ");
		scanf("%d %d", &arr[i].x, &arr[i].y);
	}

	//arr[0]�� ���� arr[1]�� ���� min�� �ִ´�
	min = sqrt(pow((double)arr[0].x - arr[1].x, 2) + pow((double)arr[0].y - arr[1].y, 2));

	for (i = 0; i < 5; i++)
	{
		for (j = i + 1; j < 5; j++)
		{
			distance = sqrt(pow((double) (arr[i].x - arr[j].x), 2) + pow((double) (arr[i].y - arr[j].y), 2));
			
			if (min > distance) {
				min = distance;

				minindex1 = i;
				minindex2 = j;
			}
		}
	}

	printf("\n�ּ� �Ÿ��� %f �̰�, �� ���� (%d, %d), (%d, %d) �Դϴ�\n\n", min, arr[minindex1].x, arr[minindex1].y, arr[minindex2].x, arr[minindex2].y);
}

*/

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int size, i, j;
	int *arr;

	printf("�迭�� ũ�⸦ �Է�: ");
	scanf("%d", &size);

	arr = (int*)malloc(sizeof(int)*size);

	for (i = 0; i < size; i++)
	{
		printf("���� �Է�: ");
		scanf("%d", &arr[i]);
	}

	printf("���ߺ� ���� : ");

	for (i = 0; i < size; i++)
	{
		for (j = 0; j < size; j++)
		{
			if (i == j)
				continue;

			else if (arr[i] == arr[j])
				break;
		}

		if (j == size)
			printf("%d ", arr[i]);
	}

	free(arr);
}