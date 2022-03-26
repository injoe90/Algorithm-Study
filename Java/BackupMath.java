import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BackupMath {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] numberList = br.readLine().split(" ");
//        int A = Integer.parseInt(numberList[0]);
//        int B = Integer.parseInt(numberList[1]);
//        int C = Integer.parseInt(numberList[2]);
//
//        System.out.println(((A + B) % C));
//        System.out.println(((A % C) + (B % C)) % C);
//        System.out.println((A * B) % C);
//        System.out.println(((A % C) * (B % C)) % C);

//  최대공약수와 최소공배수: 2609번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] numberList = br.readLine().split(" ");
//        System.out.println(gcd(Integer.parseInt(numberList[0]), Integer.parseInt(numberList[1])));
//        System.out.println(lcd(Integer.parseInt(numberList[0]), Integer.parseInt(numberList[1])));

// 소수 찾기: 1978번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int rangeNumber = Integer.parseInt(br.readLine());
//        String[] inputList = br.readLine().split(" ");
//        int cnt = 0;
//        for (String item : inputList) if (primeNumber(Integer.parseInt(item))) cnt += 1;
//        System.out.println(cnt);

// 소수 구하기: 1929번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] inputNumber = br.readLine().split(" ");
//        int m = Integer.parseInt(inputNumber[0]);
//        int n = Integer.parseInt(inputNumber[1]);
//        int primeCursor = 0;
//        int[] prime = new int[1000001];
//
//        for (int i = 0; i <= 1000000; i++) prime[i] = -1;
//
//        for (int i =2; i <= n; i++) {
//            primeCursor += 1;
//            if (prime[primeCursor] == -1) {
//                prime[primeCursor] = i;
//                for (int j = i * 2; j <= n; j += i) prime[j - 1] = 0;
//            }
//        }
//        for (int item : prime) {
//            if (item >= m) System.out.println(item);
//        }

// 팩토리얼: 10872번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        System.out.println(factorial(n));

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(factorial_zero(Float.parseFloat(br.readLine()), 5));
// 골드바흐의 추측: 6588번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int MAX = 1000000;
//        int primeCursor = 0;
//        int[] prime = new int[MAX];
//        boolean[] check = new boolean[MAX + 1];
//
//        for (int i = 2; i <= MAX; i++) {
//            if (!check[i]) {
//                primeCursor += 1;
//                prime[primeCursor] = i;
//                for (int j = i * 2; j <= MAX; j += i) check[j] = true;
//            }
//        }
//
//        while (true) {
//            int n = Integer.parseInt(br.readLine());
//            if (n == 0) break;
//
//            for (int i = 0; i < primeCursor; i++) {
//                if (!(check[n - prime[i]])) {
//                    System.out.println(n + " = " + prime[i] + " + " + (n - prime[i]));
//                    break;
//                }
//            }
//        }

// GCD 합: 9613번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int rangeNumber = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < rangeNumber; i++) {
//            String[] inputList = br.readLine().split(" ");
//            Stack<Integer> numberList = new Stack<>();
//            long result = 0;
//            for (int j = 1; j < inputList.length; j++) numberList.push(Integer.parseInt(inputList[j]));
//            while (!numberList.isEmpty()) {
//                int temp = numberList.pop();
//                for (Integer integer : numberList) {
//                    result += gcd(temp, integer);
//                }
//            }
//            System.out.println(result);
//        }
    }

//    public static int gcd(int a, int b) {
//        if (b == 0) return a;
//        else return gcd(b, a % b);
//    }
//
//    public static int lcd(int a, int b) {
//        return gcd(a, b) * (a / gcd(a, b)) * (b / gcd(a, b));
//    }

//    public static boolean primeNumber(int a) {
//        if (a < 2) return false;
//        for (int i = 2; i*i <= a; i++) if ((a % i) == 0) return false;
//        return true;
//    }

//    public static int factorial(int n) {
//        if (n == 0) return 1;
//        else if (n == 1) return n;
//        return n * factorial(n - 1);
//    }

// 팩토리얼 0의 개수: 1676번
//    public static int factorial_zero(float n, float a) {
//        int zero_number = (int) Math.floor(n/a);
//        if (zero_number == 0) return zero_number;
//        return zero_number + factorial_zero(n, a * 5);
//    }

//    public static long gcd(int a, int b) {
//        if (b == 0) return a;
//        else return gcd(b, a % b);
//    }
}
