import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BackupQueue {
    public static void main(String[] args) {
// 큐 구현하기: 10845번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> queueList = new ArrayList<>();
//        int rangeNumber = Integer.parseInt(br.readLine());
//        for (int i = 0; i < rangeNumber; i++) {
//            String[] methodList = br.readLine().split(" ");
//            if (methodList[0].equals("push")) queueList.add(methodList[1]);
//            if (methodList[0].equals("front")) {
//                if (queueList.size() == 0) System.out.println("-1");
//                else System.out.println(queueList.get(0));
//            }
//            if (methodList[0].equals("back")) {
//                if (queueList.size() == 0) System.out.println("-1");
//                else System.out.println(queueList.get(queueList.size() - 1));
//            }
//            if (methodList[0].equals("size")) System.out.println(queueList.size());
//            if (methodList[0].equals("empty")) {
//                if (queueList.size() == 0) System.out.println("1");
//                else System.out.println("0");
//            }
//            if (methodList[0].equals("pop")) {
//                if (queueList.size() == 0) System.out.println("-1");
//                else {
//                    System.out.println(queueList.get(0));
//                    queueList.remove(0);
//                }
//            }
//        }

// 조세퍼스 문제: 1158번
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] numberList = br.readLine().split(" ");
//        ArrayList<Integer> resultList = new ArrayList<Integer>();
//        Queue<Integer> queueNumber = new LinkedList<>();
//
//        for (int i = 1; i < Integer.parseInt(numberList[0]) + 1; i++) queueNumber.offer(i);
//
//        while (!queueNumber.isEmpty()) {
//            for (int i = 0; i < Integer.parseInt(numberList[1]) - 1; i++) queueNumber.offer(queueNumber.poll());
//            resultList.add(queueNumber.poll());
//        }
//
//        System.out.print("<");
//        for (int i = 0; i < resultList.size() - 1; i++) System.out.print(resultList.get(i) + ", ");
//        System.out.print(resultList.get(resultList.size() - 1));
//        System.out.print(">");
    }
}
