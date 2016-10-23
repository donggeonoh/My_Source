#pragma once;

#include <stdio.h>
#include<stdio.h>
#include<conio.h>
#include<Windows.h>
#include<stdlib.h>
#include<time.h>

#define LEFT 75
#define RIGHT 77
#define UP 72
#define DOWN 80

void drawBoard();
int action(int arr_row[4]);
void getNewNumber();
void checkGameOver();