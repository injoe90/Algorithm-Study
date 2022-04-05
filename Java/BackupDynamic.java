import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

// 가장 긴 증가하는 부분 수열: 11053번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int rangeNumber = Integer.parseInt(br.readLine());
//        int length = 0;
//        String[] numberList = br.readLine().split(" ");
//        int[] result = new int[1000];
//        for (int i = 0; i < rangeNumber; i++) {
//            result[i] = 1;
//            for (int j = 0; j < i; j++) {
//                if (Integer.parseInt(numberList[i]) > Integer.parseInt(numberList[j]) && result[j] + 1 > result[i]) result[i] = result[j] + 1;
//            }
//        }
//        for (int item : result) if (item > length) length = item;
//        System.out.println(length);

// 가장 긴 증가하는 부분 수열 4: 14002번
//        static String[] numberList;
//        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            int rangeNumber = Integer.parseInt(br.readLine());
//            int length = 0; int indexNumber = 0;
//            numberList = br.readLine().split(" ");
//            int[] result = new int[1000]; ArrayList<Integer> index = new ArrayList<>();
//
//            for (int i = 0; i < 1000; i ++) index.add(-1);
//
//            for (int i = 0; i < rangeNumber; i++) {
//                result[i] = 1;
//                for (int j = 0; j < i; j++) {
//                    if (Integer.parseInt(numberList[i]) > Integer.parseInt(numberList[j]) && result[j] + 1 > result[i]) {
//                        result[i] = result[j] + 1;
//                        index.set(i, j);
//                    }
//                }
//            }
//            for (int i = 0; i < rangeNumber; i++) {
//                if (result[i] > length) {
//                    length = result[i];
//                    indexNumber = i;
//                }
//            }
//            for (int item : result) if (item > length) length = item;
//            System.out.println(length);
//            traceIndex(indexNumber, index);
//        }
//        public static void traceIndex(int n, ArrayList<Integer> index) {
//            if (n == -1) return;
//            traceIndex(index.get(n), index);
//            System.out.print(numberList[n] + " ");
//        }

// 연속합: 1912번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int maxValue = 0;
//        String[] inputList = br.readLine().split(" ");
//        int[] resultList = new int[n];
//        for (int i = 0; i < n; i++) {
//            resultList[i] = Integer.parseInt(inputList[i]);
//            if (i == 0) continue;
//            if (resultList[i - 1] + Integer.parseInt(inputList[i]) > resultList[i]) {
//                resultList[i] = resultList[i - 1] + Integer.parseInt(inputList[i]);
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (i == 0) maxValue = resultList[i];
//            if (resultList[i] > maxValue) maxValue = resultList[i];
//        }
//        System.out.println(maxValue);

// 제곱수의 합: 1699번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] result = new int[100001];
//        for (int i = 0; i <= n; i++) {
//            result[i] = i;
//            for (int j = 1; j * j <= i; j++) {
//                if (result[i] > result[i - j * j] + 1) result[i] = result[i - j * j] + 1;
//            }
//        }
//        System.out.println(result[n]);

// 합분해: 2225번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] rawInput = br.readLine().split(" ");
//        int n = Integer.parseInt(rawInput[0]); int k = Integer.parseInt(rawInput[1]);
//        long[][] result = new long[k + 1][n + 1]; result[0][0] = 1;
//        for (int i = 1; i <= k; i++) {
//            for (int j = 0; j <= n; j++) {
//                for (int l = 0; l <= j; l++) {
//                    result[i][j] += result[i - 1][j - l];
//                    result[i][j] %= 1000000000;
//                }
//            }
//        }
//        System.out.println(result[k][n]);

// 1, 2, 3 더하기 3: 15988번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long[] result = new long[1000001]; long mod = 1000000009;
//        result[1] = 1; result[2] = 2; result[3] = 4;
//        for (int i = 4; i <= 1000000; i++) {
//            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
//            result[i] %= mod;
//        }
//        int n = Integer.parseInt(br.readLine());
//        for (int i = 0; i < n; i++) {
//            int temp = Integer.parseInt(br.readLine());
//            System.out.println(result[temp]);
//        }
// 동물원: 1309번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] result = new int[n][3];
//        result[0][0] = 1; result[0][1] = 1; result[0][2] = 1;
//        for (int i = 1; i < n; i++) {
//            result[i][0] = result[i - 1][0] + result[i - 1][1] + result[i - 1][2];
//            result[i][1] = result[i - 1][0] + result[i - 1][2];
//            result[i][2] = result[i - 1][0] + result[i - 1][1];
//            for (int j = 0; j < 3; j++) result[i][j] %= 9901;
//        }
//        int temp = result[n - 1][0] + result[n - 1][1] + result[n - 1][2];
//        System.out.println(temp % 9901);

// 오르막 수: 11057번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int count = 0;
//        int[][] result = new int[n][10];
//        for (int i = 0; i < 10; i++) result[0][i] = 1;
//        for (int i = 1; i < n; i++) {
//            int temp = 0;
//            for (int j = 0; j < 10; j++) {
//                temp += result[i - 1][j];
//                result[i][j] = temp % 10007;
//            }
//        }
//        for (int i = 0; i < 10; i++) count += result[n - 1][i];
//        System.out.println(count % 10007);
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
