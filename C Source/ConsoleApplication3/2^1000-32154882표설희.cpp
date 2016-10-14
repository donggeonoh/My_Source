#include <stdio.h>

void main()
{
	char num[400];
	num[0] = 2;
	int i, j, result = 0;
	for (i = 0; i < 999; i++) {
		for (j = 0;; j++)
			if (num[j] == -52)
				break;
			else
				num[j] *= 2;
		for (;; j--) {
			if (j == -1)
				break;
			else if (num[j] >= 10) {
				if (num[j + 1] == -52)
					num[j + 1] = 1;
				else
					num[j + 1] += 1;
				num[j] -= 10;
			}
		}
	}

	printf("2^1000의 값 : ");
	for (i = 399; i != -1; i--){
		if (num[i] == -52)
			continue;
		else
			printf("%d", num[i]);
	}

	printf("\n\n\n2^1000의 각 자릿수 합 : ");
	for (i = 0;; i++) {
		if (num[i] == -52)
			break;
		result += num[i];
	}
	printf("%d", result);
}
