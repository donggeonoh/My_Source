#include "2048.h"

int score = 0;

int number[4][4] = {0, 0, 0, 0,
					0, 0, 0, 0,
					0, 0, 0, 0,
					0, 0, 0, 0};

void PrintBackground();
void RandomNumber();
void InputKeyboard();
int CheckedGameOver();
int CalculateNumber(int input, int number[][4]);

int main(void) {
	while (1) {
		RandomNumber();
		PrintBackground();
		if (CheckedGameOver()) break;
		InputKeyboard();
	}
}

void RandomNumber() {

	int randNum1, randNum2;
	int inputNum;
	int i;

	srand(time(NULL));

	if (rand() % 4 == 0) inputNum = 4;
	else inputNum = 2;

	while (1) {
		randNum1 = rand() % 4;
		randNum2 = rand() % 4;

		if (number[randNum1][randNum2] > 0) {
			continue;
		}
		else {
			number[randNum1][randNum2] = inputNum;
			break;
		}
	}

}

void PrintBackground() {
	int i, j;

	system("cls"); // 도스창 초기화

	printf("\n\n\t\tscore : %8d\n\n", score); // 점수 표시

	printf("\t┏━━━┳━━━┳━━━┳━━━┓\n");
	for (i = 0; i < 4; i++){
		printf("\t┃      ┃      ┃      ┃      ┃\n");
		printf("\t┃");
		for (j = 0; j < 4; j++) {
			if (number[i][j] == 0) printf("      ");
			else printf("%6d", number[i][j]);
			printf("┃");
		}

		printf("\n");
		if (i < 3) printf("\t┣━━━╋━━━╋━━━╋━━━┫\n");
	}

	printf("\t┗━━━┻━━━┻━━━┻━━━┛\n");

}

void InputKeyboard() {

	int input;
	
	while (1) {
		input = getch();
		if (input == 224) {
			input = getch();

			if (CalculateNumber(input, number))
				continue;

			break;
		}

		else
			continue;
	}
}

int CalculateNumber(int input, int number[][4]) {

	int i, j, k;
	int isMoved;

	isMoved = 0;

	switch (input) {
	case LEFT:
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				for (k = j + 1; k < 4; k++) {
					if (number[i][k] == 0)
						continue;

					else if (number[i][j] == number[i][k]) {
						number[i][j] += number[i][k];
						number[i][k] = 0;

						score += number[i][j];
						isMoved = 1;

						break;
					}

					else if (number[i][j] == 0) {
						number[i][j] = number[i][k];
						number[i][k] = 0;

						isMoved = 1;
					}

					else if (number[i][j] != number[i][k])
						break;
				}
			}
		}

		if (isMoved == 0) return 1;
		else return 0;

		break;

	case RIGHT:

		for (i = 0; i < 4; i++) {
			for (j = 3; j > 0; j--) {
				for (k = j - 1; k >= 0; k--) {
					if (number[i][k] == 0)
						continue;

					else if (number[i][j] == number[i][k]) {
						number[i][j] += number[i][k];
						number[i][k] = 0;

						score += number[i][j];
						isMoved = 1;

						break;
					}

					else if (number[i][j] == 0) {
						number[i][j] = number[i][k];
						number[i][k] = 0;

						isMoved = 1;
					}

					else if (number[i][j] != number[i][k])
						break;
				}
			}
		}

		if (isMoved == 0) return 1;
		else return 0;

		break;

	case UP:

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				for (k = j + 1; k < 4; k++) {
					if (number[k][i] == 0)
						continue;

					else if (number[j][i] == number[k][i]) {
						number[j][i] += number[k][i];
						number[k][i] = 0;

						score += number[j][i];
						isMoved = 1;

						break;
					}

					else if (number[j][i] == 0) {
						number[j][i] = number[k][i];
						number[k][i] = 0;

						isMoved = 1;
					}

					else if (number[j][i] != number[k][i])
						break;
				}
			}
		}

		if (isMoved == 0) return 1;
		else return 0;

		break;

	case DOWN:

		for (i = 0; i < 4; i++) {
			for (j = 3; j > 0; j--) {
				for (k = j - 1; k >= 0; k--) {
					if (number[k][i] == 0)
						continue;

					else if (number[j][i] == number[k][i]) {
						number[j][i] += number[k][i];
						number[k][i] = 0;

						score += number[j][i];
						isMoved = 1;

						break;
					}

					else if (number[j][i] == 0) {
						number[j][i] = number[k][i];
						number[k][i] = 0;

						isMoved = 1;
					}

					else if (number[j][i] != number[k][i])
						break;
				}
			}
		}

		if (isMoved == 0) return 1;
		else return 0;

		break;
	
	default:
		isMoved = 0;
		break;
	}

}

int CheckedGameOver() {
	int i, j;

	for (i = 0; i < 4; i++)
		for (j = 0; j < 4; j++) {
			if (number[i][j] == 0)
				return 0;
		}

	for (i = 0; i < 4; i++)
		for (j = 0; j < 3; j++) {
			if (number[i][j] == number[i][j + 1])
				return 0;
			else if (number[j][i] == number[j + 1][i])
				return 0;
		}

	printf("\n\n\n\t\t GAME OVER!!!\n\n\n\n\n");

	return 1;
}