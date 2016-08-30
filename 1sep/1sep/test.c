#include <stdio.h> 

#define SIZE 10

int main(void) {
    int a[SIZE][SIZE];

    int i, j;
    int tmp = 0;
    for (i = 0; i < SIZE; ++i) {
        for (j = 0; j < SIZE; ++j) {
            /*a[i][j] = tmp;*/
            a[i][j] = 0;
            tmp++;
            printf("%4d", a[i][j]);
        }
        puts("");
    }

    puts("");

    int col_num = 3;
    for (i = 0; i < SIZE; ++i) {
        for (j = 0; j < SIZE; ++j) {
            if (j == col_num) {
                /*a[i][j] *= 2;*/
                a[i][j] = 1;
            }
            printf("%4lld", a[i][j]);
        }
        puts("");
    }

    return 0;
}

