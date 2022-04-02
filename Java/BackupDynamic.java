import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BackupDynamic {
    public static void main(String[] args) {

// 1, 2, 3 더하기 5: 15990번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int rangeNumber = Integer.parseInt(br.readLine());
//        long[][] rCount = new long[100000][3];
//        rCount[0][0] = 1; rCount[0][1] = 0; rCount[0][2] = 0;
//        rCount[1][0] = 0; rCount[1][1] = 1; rCount[1][2] = 0;
//        rCount[2][0] = 1; rCount[2][1] = 1; rCount[2][2] = 1;
//
//        for (int i = 3; i < 100000; i++) {
//            rCount[i][0] = rCount[i - 1][1] % 1000000009 + rCount[i - 1][2] % 1000000009;
//            rCount[i][1] = rCount[i - 2][0] % 1000000009 + rCount[i - 2][2] % 1000000009;
//            rCount[i][2] = rCount[i - 3][0] % 1000000009 + rCount[i - 3][1] % 1000000009;
//        }
//
//        for (int i = 0; i < rangeNumber; i++) {
//            int indexNumber = Integer.parseInt(br.readLine());
//            long temp = (rCount[indexNumber - 1][0] + rCount[indexNumber - 1][1] + rCount[indexNumber - 1][2]) % 1000000009;
//            System.out.println(temp);
//        }

// 쉬운 계단 수: 10844번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long[][] stepCount = new long[100][10];
//        stepCount[0][0] = 0; stepCount[0][1] = 1; stepCount[0][2] = 1; stepCount[0][3] = 1; stepCount[0][4] = 1;
//        stepCount[0][5] = 1; stepCount[0][6] = 1; stepCount[0][7] = 1; stepCount[0][8] = 1; stepCount[0][9] = 1;
//
//        for (int i = 1; i < 100; i++) {
//            stepCount[i][0] = stepCount[i - 1][1] % 1000000000;
//            stepCount[i][1] = stepCount[i - 1][0] % 1000000000 + stepCount[i - 1][2] % 1000000000;
//            stepCount[i][2] = stepCount[i - 1][1] % 1000000000 + stepCount[i - 1][3] % 1000000000;
//            stepCount[i][3] = stepCount[i - 1][2] % 1000000000 + stepCount[i - 1][4] % 1000000000;
//            stepCount[i][4] = stepCount[i - 1][3] % 1000000000 + stepCount[i - 1][5] % 1000000000;
//            stepCount[i][5] = stepCount[i - 1][4] % 1000000000 + stepCount[i - 1][6] % 1000000000;
//            stepCount[i][6] = stepCount[i - 1][5] % 1000000000 + stepCount[i - 1][7] % 1000000000;
//            stepCount[i][7] = stepCount[i - 1][6] % 1000000000 + stepCount[i - 1][8] % 1000000000;
//            stepCount[i][8] = stepCount[i - 1][7] % 1000000000 + stepCount[i - 1][9] % 1000000000;
//            stepCount[i][9] = stepCount[i - 1][8] % 1000000000;
//        }
//
//        int indexNubmer = Integer.parseInt(br.readLine());
//        long temp =
//                stepCount[indexNubmer - 1][0] + stepCount[indexNubmer - 1][1] + stepCount[indexNubmer - 1][2] + stepCount[indexNubmer - 1][3] + stepCount[indexNubmer - 1][4] +
//                        stepCount[indexNubmer - 1][5] + stepCount[indexNubmer - 1][6] + stepCount[indexNubmer - 1][7] + stepCount[indexNubmer - 1][8] + stepCount[indexNubmer - 1][9];
//        System.out.println(temp % 1000000000);
    }
// 1로 만들기: 1463번
//    public  static  int makeOne(int n) {
//        int[] oneCount = new int[n + 1];
//        if (n == 1) return 0;
//        if (oneCount[n] > 0) return oneCount[n];
//        oneCount[n] = makeOne(n - 1) + 1;
//        if (n % 2 == 0) {
//            int temp = makeOne(n / 2) + 1;
//            if (oneCount[n] > temp) oneCount[n] = temp;
//        }
//        if (n % 3 == 0) {
//            int temp = makeOne(n / 3) + 1;
//            if (oneCount[n] > temp) oneCount[n] = temp;
//        }
//        return oneCount[n];
//    }
//    public static int makeOne(int n) {
//        int[] oneCount = new int[n + 1];
//        oneCount[1] = 0;
//        for (int i = 2; i <= n; i++) {
//            oneCount[i] = oneCount[i - 1] + 1;
//            if (i % 2 == 0 && oneCount[i] > oneCount[i / 2] + 1) oneCount[i] = oneCount[i / 2] + 1;
//            if (i % 3 == 0 && oneCount[i] > oneCount[i / 3] + 1) oneCount[i] = oneCount[i / 3] + 1;
//        }
//        return oneCount[n];
//    }

// 2 x n 타일링: 11726번
//    public static int twoByN(int n) {
//        int[] rCount = new int[n + 2];
//        rCount[1] = 1;
//        rCount[2] = 2;
//        for (int i = 3; i <= n; i++) rCount[i] = ((rCount[i - 2]) % 10007 + (rCount[i - 1]) % 10007) % 10007;
//        return rCount[n];
//    }

// 2 x n 타일링 2: 11727번
//    public static int twoByN2(int n) {
//        int[] nCount = new int[n + 2];
//        nCount[1] = 1;
//        nCount[2] = 3;
//        for (int i = 3; i <= n; i++) nCount[i] = ((nCount[i - 1]) % 10007 + (nCount[i - 2] * 2% 10007)) % 10007;
//        return nCount[n];
//    }

// 1, 2, 3 더하기: 9095번
//    public static int oneTwoThree(int n) {
//        int[] nCount = new int[n + 3];
//        nCount[1] = 1;
//        nCount[2] = 2;
//        nCount[3] = 4;
//        for (int i = 4; i <= n; i++) nCount[i] = nCount[i - 1] + nCount[i - 2] + nCount[i - 3];
//        return nCount[n];
//    }

// 카드 구매하기: 11052번
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int targetNumber = Integer.parseInt(br.readLine());
//    String[] inputList = br.readLine().split(" ");
//    int[] maxPay = new int[targetNumber + 1];
//        for (int i = 1; i <= targetNumber; i++) maxPay[i] = Integer.parseInt(inputList[i - 1]);
//        for (int i = 2; i <= targetNumber; i++) {
//        for (int j = 1; j <= i - 1; j++) {
//            int temp = maxPay[j] + maxPay[i - j];
//            if (temp > maxPay[i]) maxPay[i] = temp;
//        }
//    }
//        System.out.println(maxPay[targetNumber]);


}
