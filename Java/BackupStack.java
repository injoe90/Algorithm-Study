import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class BackupStack {
    public static void main(String[] args) {
// 스택 구현하기: 10828번
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    int rangeNumber = Integer.parseInt(br.readLine());
//    ArrayList<String> stackList = new ArrayList();
//
//        for (int i = 0; i < rangeNumber; i++) {
//        String[] inputList = br.readLine().split(" ");
//
//        switch (inputList[0]) {
//            case "push": stackList.add(inputList[1]); break;
//            case "size": bw.write(String.valueOf(stackList.size()) + "\n"); break;
//            case "pop": if (stackList.size() == 0) {bw.write("-1\n");}
//            else {
//                bw.write(stackList.remove(stackList.size() - 1) + "\n");}
//                break;
//            case "top": if (stackList.size() == 0) {bw.write("-1\n");}
//            else {bw.write(stackList.get(stackList.size() - 1) + "\n");}
//                break;
//            case "empty": if (stackList.size() == 0) {bw.write("1\n");}
//            else {bw.write("0\n");}
//                break;
//        }
//        bw.flush();
//    }
//        bw.close();

// 단어 뒤집기: 9093번
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    int rangeNumber = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < rangeNumber; i++) {
//        String[] item_list = br.readLine().split(" ");
//
//        for (String item : item_list) {
//            if (item.length() == 1) bw.write(item);
//            else {
//                for (int j = item.length() - 1; j>=0; j--) {
//                    bw.write(item.charAt(j));
//                }
//            }
//            bw.flush();
//            System.out.print(" ");
//        }
//        System.out.println("");
//    }
//        bw.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int rangeNumber = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < rangeNumber; i++) {
//            String inputList = br.readLine();
//            bw.write(BracketResult(inputList)+"\n");
//            bw.flush();
//        }
//        bw.close();

// 스택 수열: 1874번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int stackNumber = Integer.parseInt(br.readLine());
//        int checkNumber = 0;
//        ArrayList<String> resultBucket = new ArrayList<>();
//        Stack<Integer> stackBucket = new Stack<>();
//        for (int i = 0; i < stackNumber; i++) {
//            int inputNumber = Integer.parseInt(br.readLine());
//            if (checkNumber < inputNumber) {
//                while (checkNumber < inputNumber) {
//                    checkNumber += 1;
//                    stackBucket.push(checkNumber);
//                    resultBucket.add("+");
//                }
//                stackBucket.pop();
//                resultBucket.add("-");
//            } else {
//                boolean found = false;
//                if (!stackBucket.isEmpty()) {
//                    int numberTop = stackBucket.peek();
//                    stackBucket.pop();
//                    resultBucket.add("-");
//
//                    if (inputNumber == numberTop) found = true;
//                }
//                if (!found) {
//                    bw.write("NO");
//                    bw.flush();
//                    bw.close();
//                    return;
//                }
//            }
//        }
//        for (String item : resultBucket) {
//            bw.write(item + "\n");
//            bw.flush();
//        }
//        bw.close();

// 에디터: 1406번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        Stack<Character> rightStack = new Stack<>();
//        Stack<Character> leftStack = new Stack<>();
//
//        String inputString = br.readLine();
//
//        for (int i = 0; i < inputString.length(); i++) leftStack.push(inputString.charAt(i));
//
//        int rangeNumber = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < rangeNumber; i++) {
//            String[] stackMethod = br.readLine().split(" ");
//
//            switch (stackMethod[0].charAt(0)) {
//                case 'P':
//                    leftStack.push(stackMethod[1].charAt(0));
//                    break;
//                case 'L':
//                    if (!leftStack.isEmpty()) {
//                        rightStack.push(leftStack.peek());
//                        leftStack.pop();
//                    }
//                    break;
//                case 'D':
//                    if (!rightStack.isEmpty()) {
//                        leftStack.push(rightStack.peek());
//                        rightStack.pop();
//                    }
//                    break;
//                case 'B':
//                    if (!leftStack.isEmpty()) leftStack.pop();
//                    break;
//            }
//
//        }
//
//        while (!leftStack.isEmpty()) {
//            rightStack.push(leftStack.pop());
//        }
//        while (!rightStack.isEmpty()) {
//            bw.write(rightStack.pop());
//        }
//        bw.flush();
//        bw.close();

// 단어 뒤집기2: 17413번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String inputString = br.readLine();
//        Stack<Character> wordStack = new Stack<Character>();
//        boolean checkTag = false;
//
//        for (int i = 0 ; i < inputString.length(); i++) {
//            if (!checkTag) {
//                if (inputString.charAt(i) == '<') {
//                    while (!wordStack.isEmpty()) System.out.print(wordStack.pop());
//                    checkTag = true;
//                }
//                else if (inputString.charAt(i) == ' ') {
//                    while (!wordStack.isEmpty()) System.out.print(wordStack.pop());
//                    System.out.print(inputString.charAt(i));
//                }
//                else wordStack.push(inputString.charAt(i));
//            }
//
//            if (checkTag) {
//                System.out.print(inputString.charAt(i));
//                if (inputString.charAt(i) == '>') checkTag = false;
//            }
//        }
//
//        while (!wordStack.isEmpty()) System.out.print(wordStack.pop());

// 쇠막대기: 10799번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String bracketString = br.readLine();
//        int rodCount = 0;
//        Stack<Integer> leftIndex = new Stack<>();
//
//        for (int i = 0; i < bracketString.length(); i++) {
//            if (bracketString.charAt(i) == '(') {
//                leftIndex.push(i);
//            }
//            else if (bracketString.charAt(i) == ')') {
//                int isRodIndex = leftIndex.pop();
//                if (i == isRodIndex + 1) rodCount += leftIndex.size();
//                else rodCount += 1;
//            }
//        }
//        System.out.println(rodCount);
// 오큰수: 17298번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int rangeNumber = Integer.parseInt(br.readLine());
//        Stack<Integer> numberStack = new Stack<>();
//        numberStack.push(0);
//        String[] resultList = new String[rangeNumber];
//        String[] inputList = br.readLine().split(" ");
//        for (int i = 1; i < inputList.length; i++) {
//            while (!numberStack.isEmpty() &&  Integer.parseInt(inputList[i]) > Integer.parseInt(inputList[numberStack.peek()])) {
//                resultList[numberStack.pop()] = inputList[i];
//            }
//            numberStack.push(i);
//        }
//        while (!numberStack.isEmpty()) resultList[numberStack.pop()] = "-1";
//
//        StringBuilder resultString = new StringBuilder();
//
//        for (String item : resultList) resultString.append(item).append(" ");
//        System.out.println(resultString);
    }
//    public static String BracketResult(String inputList) {
//        Stack<Character> stackBracket = new Stack<>();
//        for (int i = 0; i < inputList.length(); i++) {
//            if (inputList.charAt(i) == '(') stackBracket.push(inputList.charAt(i));
//            if (inputList.charAt(i) == ')') {
//                if (stackBracket.isEmpty()) {
//                    return "NO";
//                }
//                stackBracket.pop();
//            }
//        }
//        if (stackBracket.size() == 0) return "YES";
//        else return "NO";
//    }

}
