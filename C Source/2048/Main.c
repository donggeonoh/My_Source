#include<stdio.h>
#include<conio.h> // getch()
#include<Windows.h> // system("cls")
#include<stdlib.h> // random()
#include<time.h> // srand()

// ����Ű ������
#define LEFT 75
#define RIGHT 77
#define UP 72
#define DOWN 80

int score = 0; // ����
int nums[4][4] = {
	{ 0, 0, 0, 0 },
	{ 0, 0, 0, 0 },
	{ 0, 0, 0, 0 },
	{ 0, 0, 0, 0 },
}; // ������

void drawBoard(); // ������ �׸��� �Լ�
int action(int arr_row[4]); // �迭 �����̴� �Լ�
void getNewNumber(); // ���ο� ���� ���� �Լ�
void checkGameOver(); // ���ӿ������� üũ�ϴ� �Լ�

/* main �Լ� */
int main(void){
	int input; // key�� ����
	int i, j, k; // ���� ����
	int *arr_row[4]; // ���� �� �پ� ����

	getNewNumber();
	getNewNumber(); // ���� 2�� ����
	drawBoard(); // ������ �׸���

	while (1){
		input = getch(); // Ű���� �Է�

		if (input == 224){ // ����Ű�� ������ ��
			int cnt = 0;

			input = getch(); // ������ �޾ƿ���

			switch (input){
			case LEFT: // ���� ����Ű ���� ���
				for (i = 0; i < 4; i++){
					for (j = 0; j < 4; j++){
						arr_row[j] = &nums[i][j];
					} // 1~4�� ����->���������� �迭�� ����
					cnt += action(arr_row);
				}
				break;
			case RIGHT: // ������ ����Ű ���� ���
				for (i = 0; i < 4; i++){
					for (j = 3; j >= 0; j--){
						arr_row[3 - j] = &nums[i][j];
					} // 1~4�� ������->�������� �迭�� ����
					cnt += action(arr_row);
				}
				break;
			case UP: // ���� ����Ű ���� ���
				for (i = 0; i < 4; i++){
					for (j = 0; j < 4; j++){
						arr_row[j] = &nums[j][i];
					} // 1~4�� ��->�Ʒ������� �迭�� ����
					cnt += action(arr_row);
				}
				break;
			case DOWN: // �Ʒ��� ����Ű ���� ���
				for (i = 0; i < 4; i++){
					for (j = 3; j >= 0; j--){
						arr_row[3 - j] = &nums[j][i];
					} // 1~4�� �Ʒ�->�������� �迭�� ����
					cnt += action(arr_row);
				}
				break;
			}
			if (cnt == 4) continue; // ���ڰ� �������� �ʾ��� ���

			getNewNumber(); // ���ο� ���� ����
			drawBoard(); // ������ �ٽ� �׸���
			checkGameOver(); // ���ӿ������� Ȯ��

		}
	}

	return 0;
}

/* ������ �׸��� */
void drawBoard(){
	int i, j;

	system("cls"); // ����â �ʱ�ȭ

	printf("\n\n\t\tscore : %8d\n\n", score); // ���� ǥ��

	printf("\t����������������������������������\n");
	for (i = 0; i < 4; i++){
		printf("\t��      ��      ��      ��      ��\n");
		printf("\t��");
		for (j = 0; j < 4; j++){
			if (nums[i][j] == 0) printf("      ");
			else printf("%6d", nums[i][j]);
			printf("��");
		}
		printf("\n");
		if (i < 3) printf("\t����������������������������������\n");
	}
	printf("\t����������������������������������\n");
}

/* �迭 �����̱� */
int action(int *arr_row[4]){
	int i, j, cnt = 0;
	int temp[4]; // �迭 �ӽ� ����

	for (i = 0; i < 4; i++) temp[i] = *arr_row[i]; // ������ �迭 ����

	for (i = 0; i < 3; i++){
		if (*arr_row[i] == 0) continue; // 0�̸� �ǳʶٱ�
		for (j = i + 1; j < 4; j++){
			if (*arr_row[i] == *arr_row[j]){ // ���ڰ� ������ ��ġ��
				*arr_row[i] *= 2;
				*arr_row[j] = 0;
				score += *arr_row[i]; // ���� +
				break;
			}
			else
				if (*arr_row[j] != 0) break;
		}
	}

	for (i = 0; i < 3; i++){
		if (*arr_row[i] != 0) continue; // 0�� �ƴϸ� �ǳʶٱ�
		for (j = i + 1; j < 4; j++){
			if (*arr_row[j] != 0){
				*arr_row[i] = *arr_row[j];
				*arr_row[j] = 0;
				break;
			} // ������ �����
		}
	}

	// ���� �迭�� ��
	for (i = 0; i < 4; i++){
		if (*arr_row[i] == temp[i]) cnt++;
	}
	if (cnt == 4) return 1; // �ٲ���� ������ 1��ȯ

	return 0; // �ٲ���� ������ 0��ȯ, ��������
}

/* ���ο� ���� ���� */
void getNewNumber(){
	int *pZero[16]; // 0�� ���� �ּ� ����
	int i, j, cnt = 0;

	srand(time(NULL)); // rand�Լ� ��������

	for (i = 0; i < 4; i++){
		for (j = 0; j < 4; j++){
			if (nums[i][j] == 0){ // ���ڰ� 0���� �Ǻ�
				pZero[cnt] = &nums[i][j]; // �ּ� ����
				cnt++;
			}
		}
	}

	if (cnt == 0) return; // 0�� ������ ����

	*pZero[rand() % cnt] = (rand() % 5 < 4) ? 2 : 4; // 2 �Ǵ� 4 ���� (4:1Ȯ��)
}

/* ���ӿ������� üũ */
void checkGameOver(){
	int i, j;

	for (i = 0; i < 4; i++){
		for (j = 0; j < 4; j++)
			if (nums[i][j] == 0) return;
		for (j = 0; j < 3; j++){
			if (nums[i][j] == nums[i][j + 1]) return;
			if (nums[j][i] == nums[j + 1][i]) return;
		}
	}

	printf("\tGameOver...");
	exit(0);
}