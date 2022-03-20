int main3() {
    // 큐 구현하기: 10845번
 /* int rangeNumber;

    cin >> rangeNumber;
    int queueList[10000];
    int top = 0; int bottom = 0;

    while (rangeNumber--) {
        string queueMethod;
        cin >> queueMethod;

        if (queueMethod == "push") {
            int inputNumber;
            cin >> inputNumber;
            queueList[bottom] = inputNumber;
            bottom += 1;
        }
        if (queueMethod == "front") {
            if (top == bottom) printf("%d\n", -1);
            else printf("%d\n", queueList[top]);
        }
        if (queueMethod == "back") {
            if (top == bottom) printf("%d\n", -1);
            else printf("%d\n", queueList[bottom - 1]);
        }
        if (queueMethod == "size") printf("%d\n", bottom - top);
        if (queueMethod == "empty") {
            if (top == bottom) printf("%d\n", 1);
            else printf("%d\n", 0);
        }
        if (queueMethod == "pop") {
            if (top == bottom) printf("%d\n", -1);
            else {
                printf("%d\n", queueList[top]);
                top += 1;
            }
        }*/
    
    // 조세퍼스 문제: 1158번
    //int n, m;

    //scanf_s("%d %d", &n, &m);

    //queue<int> queueNumber;

    //for (int i = 1; i < n + 1; i++) queueNumber.push(i);

    //int resultList[5000];
    //int cursor = 0;

    //while (!queueNumber.empty()) {
    //    int temp;
    //    for (int i = 0; i < m - 1; i++) {
    //        temp = queueNumber.front();
    //        queueNumber.pop();
    //        queueNumber.push(temp);
    //    }
    //    resultList[cursor] = queueNumber.front();
    //    queueNumber.pop();
    //    cursor += 1;
    //}

    //printf("<");
    //for (int i = 0; i < cursor - 1; i++) printf("%d, ", resultList[i]);
    //printf("%d", resultList[cursor - 1]);
    //printf(">");

	return 0;
}