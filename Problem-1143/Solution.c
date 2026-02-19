#include <stdio.h>
#include <string.h>

#define MAX_LEN 50

int lcs_algorithm(char *X, char *Y) {
    int m = strlen(X);
    int n = strlen(Y);

    int cost[m+1][n+1];

    for (int i = 0; i <= m; i++) {
        cost[i][0] = 0;
    }
    for (int j = 0; j <= n; j++) {
        cost[0][j] = 0;
    }

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (X[i - 1] == Y[j - 1]) {
                cost[i][j] = cost[i - 1][j - 1] + 1;
            } else {
                cost[i][j] = (cost[i - 1][j] > cost[i][j - 1]) ? cost[i - 1][j] : cost[i][j - 1];
            }
        }
    }

    return cost[m][n];
}

int longestCommonSubsequence(char *text1, char *text2) {
    return lcs_algorithm(text1, text2);
}
