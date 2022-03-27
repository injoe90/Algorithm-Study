public class BackupDynamic {
    public static void main(String[] args) {
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
}
