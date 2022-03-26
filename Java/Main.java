import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputList = br.readLine().split(" ");
        Stack<Long> numberList = new Stack<>();

        if (Integer.parseInt(inputList[0]) == 1) System.out.println(
                Math.abs(Integer.parseInt(br.readLine()) - Integer.parseInt(inputList[1]))
        );
        else {
            String[] locationList = br.readLine().split(" ");
            for (String item : locationList) numberList.push(Math.abs(Long.parseLong(item) - Long.parseLong(inputList[1])));

            while (numberList.size() != 1) {
                Collections.sort(numberList);
                long temp1 = numberList.pop();
                long temp2 = numberList.pop();
                numberList.push(gcd(temp1, temp2));
            }
            System.out.println(numberList.pop());
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

}
