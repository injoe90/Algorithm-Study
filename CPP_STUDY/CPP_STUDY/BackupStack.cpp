// 스택 구현 문제: 10828번
//int stack[100000];
//int stack_size = 0;
//
//void push(int data) {
//    stack[stack_size] = data;
//    stack_size += 1;
//}
//
//int pop() {
//    if (stack_size == 0) return -1;
//    else {
//        stack_size -= 1;
//        return stack[stack_size];
//    }
//}
//
//int top() {
//    if (stack_size == 0) return -1;
//    else return stack[stack_size - 1];
//}
//
//int empty() {
//    if (stack_size == 0) return 1;
//    else return 0;
//}

//string ResultBracket(string inputString) {
//    int critical = 0;
//
//    for (int i = 0; i < inputString.size(); i++) {
//        if (inputString[i] == '(') critical += 1;
//        if (inputString[i] == ')') {
//            if (critical == 0) return "NO";
//            else critical -= 1;
//        }
//    }
//
//    return (critical == 0) ? "YES" : "NO";
//}

int main2() {
    // 스택 구현 문제: 10828번
    //int repeatNumber, inputNubmer;
    //string stack_method;

    //cin >> repeatNumber;

    //while (repeatNumber--) {
    //    cin >> stack_method;
    //    if (stack_method == "push")
    //    {
    //        cin >> inputNubmer;
    //        push(inputNubmer);
    //    }
    //    else if (stack_method == "size") {
    //        cout << stack_size;
    //        cout << "\n";
    //    }
    //    else if (stack_method == "pop") {
    //        cout << pop();
    //        cout << "\n";
    //    }
    //    else if (stack_method == "top") {
    //        cout << top();
    //        cout << "\n";
    //    }
    //    else if (stack_method == "empty") {
    //        cout << empty();
    //        cout << "\n";
    //    }
    //}

    // 단어 뒤집기: 9093번
    //ios_base::sync_with_stdio(false);
    //cin.tie(nullptr);

    //int rangeNumber;
    //cin >> rangeNumber;
    //cin.ignore();

    //while (rangeNumber--) {
    //    string inputItem;
    //    getline(cin, inputItem);
    //    inputItem += '\n';

    //    stack<char> s;
    //    for (char ch : inputItem) {
    //        if (ch == ' ' || ch == '\n') {
    //            while (!s.empty()) {
    //                cout << s.top();
    //                s.pop();
    //            }
    //            cout << ch;
    //        }
    //        else {
    //            s.push(ch);
    //        }
    //    }
    //}

    // 스택 수열: 1874번
    //int rangeNumber;

    //scanf_s("%d", &rangeNumber);

    //while (rangeNumber--) {
    //    string inputString;
    //    scanf_s("%s", &inputString);

    //    printf("%s\n", ResultBracket(inputString));
    //}

    /*int stackNumber, inputNumber;
    int checkNumber = 0;
    stack<int> stackBucket;
    string resultBucket;
    cin >> stackNumber;

    while (stackNumber--) {
        cin >> inputNumber;
        if (inputNumber > checkNumber) {
            while (inputNumber > checkNumber) {
                checkNumber += 1;
                stackBucket.push(checkNumber);
                resultBucket += "+";
            }
            stackBucket.pop();
            resultBucket += "-";
        }
        else {
            bool isFound = false;
            if (!stackBucket.empty()) {
                int topNumber = stackBucket.top();
                stackBucket.pop();
                resultBucket += "-";

                if (inputNumber == topNumber) isFound = true;
            }
            if (!isFound) {
                cout << "NO" << '\n';
                return 0;
            }
        }
    }
    for (char ch : resultBucket) {
        cout << ch << "\n";
    }*/


    // 에디터: 1406번
    /*scanf("%s", &inputString);
    stack<char> leftStack, rightStack;

    int rangeNumber = strlen(inputString);
    for (int i = 0; i < rangeNumber; i++) leftStack.push(inputString[i]);

    int countNumber;
    scanf("%d", countNumber);

    while (countNumber--) {
        char stackMethod;
        scanf(" %c", &stackMethod);

        if (stackMethod == 'P') {
            char insertC;
            scanf(" %c", &insertC);
            leftStack.push(insertC);
        }
        if (stackMethod == 'L') {
            if (!leftStack.empty()) {
                rightStack.push(leftStack.top());
                leftStack.pop();
            }
        }
        if (stackMethod == 'D') {
            if (!rightStack.empty()) {
                leftStack.push(rightStack.top());
                rightStack.pop();
            }
        }
        if (stackMethod == 'B') {
            if (!leftStack.empty()) {
                leftStack.pop();
            }
        }
    }

        while (!leftStack.empty()) {
            rightStack.push(leftStack.top());
            leftStack.pop();
        }

        while (!rightStack.empty()) {
            printf("%c", rightStack.top());
            rightStack.pop();
        }
        printf("\n");*/

    // 단어뒤집기 2: 17413번
    //string inputString;
    //getline(cin, inputString);
    //stack<char> wordStack;
    //bool checkTag = false;

    //for (char item : inputString) {
    //    if (!checkTag) {
    //        if (item == '<') {
    //            while (!wordStack.empty()) {
    //                printf("%c", wordStack.top());
    //                wordStack.pop();
    //            }
    //            checkTag = true;
    //        }
    //        else if (item == ' ') {
    //            while (!wordStack.empty()) {
    //                printf("%c", wordStack.top());
    //                wordStack.pop();
    //            }
    //            printf("%c", item);
    //        }
    //        else {
    //            wordStack.push(item);
    //        }
    //    }

    //    if (checkTag) {
    //        printf("%c", item);
    //        if (item == '>') checkTag = false;
    //    }
    //}
    //while (!wordStack.empty()) {
    //    printf("%c", wordStack.top());
    //    wordStack.pop();
    //}

    //printf("\n");
    
    // 쇠막대기: 10799번
    //string bracketString;
    //getline(cin, bracketString);
    //int rodCount = 0;
    //stack<int> leftIndex;

    //for (int i = 0; i < bracketString.size(); i++) {
    //    if (bracketString[i] == '(') leftIndex.push(i);
    //    else if (bracketString[i] == ')') {
    //        int isRod = leftIndex.top();
    //        leftIndex.pop();

    //        if (i == isRod + 1) rodCount += leftIndex.size();
    //        else rodCount += 1;
    //    }
    //}
    //printf("%d", rodCount);

	return 0;
}