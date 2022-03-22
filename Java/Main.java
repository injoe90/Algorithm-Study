import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }
    public static boolean primeNumber(int a) {
        if (a < 2) return false;
        for (int i = 2; i*i <= a; i++) if ((a % i) == 0) return false;
        return true;
    }
}
