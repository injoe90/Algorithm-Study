import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rangeNumber = Integer.parseInt(br.readLine());
        Stack<Integer> numberStack = new Stack<>();
        numberStack.push(0);
        ArrayList<String> resultList = new ArrayList<>();
        String[] inputList = br.readLine().split(" ");

        for (int i = 1; i < inputList.length; i++) {
            while (!numberStack.isEmpty() &&  Integer.parseInt(inputList[i]) > Integer.parseInt(inputList[numberStack.peek()])) {
                resultList.add(inputList[i]);
            }
            numberStack.push(i);
        }

        while (!numberStack.isEmpty()) resultList.set(numberStack.pop(), "-1");

        StringBuilder resultString = new StringBuilder();

        for (String item : resultList) resultString.append(item);
        System.out.println(resultString);
    }
}
