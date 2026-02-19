int maximum69Number (int num) {
    int temp = num;
    int pos = -1, index = 0;

    while (temp > 0) {
        if (temp % 10 == 6) {
            pos = index;   
        }
        temp /= 10;
        index++;
    }

    if (pos != -1) {
        num += 3 * (int)pow(10, pos);
    }
    
    return num;
}
