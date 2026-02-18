#include <stdlib.h>

int cmp(const void *a, const void *b) {
    int *boxA = *(int **)a;
    int *boxB = *(int **)b;
    return boxB[1] - boxA[1];  
}

int maximumUnits(int** boxTypes, int boxTypesSize, int* boxTypesColSize, int truckSize) {
    qsort(boxTypes, boxTypesSize, sizeof(int*), cmp);

    int totalUnits = 0;

    for (int i = 0; i < boxTypesSize && truckSize > 0; i++) {
        int numBoxes = boxTypes[i][0];
        int unitsPerBox = boxTypes[i][1];

        int take = (numBoxes < truckSize) ? numBoxes : truckSize;

        totalUnits += take * unitsPerBox;
        truckSize -= take;
    }

    return totalUnits;
}
