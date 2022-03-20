import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun main() {
// 큐 구현하기: 10845번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val queueList = ArrayList<String>()
//    for (i in 1..br.readLine().toInt()) {
//        val methodList = br.readLine().split(" ")
//        if (methodList[0] == "push") queueList.add(methodList[1])
//        if (methodList[0] == "front") {
//            if (queueList.size == 0) println("-1")
//            else println(queueList[0])
//        }
//        if (methodList[0] == "back") {
//            if (queueList.size == 0) println("-1")
//            else println(queueList[queueList.size - 1])
//        }
//        if (methodList[0] == "size") println(queueList.size.toString())
//        if (methodList[0] == "empty") {
//            if (queueList.size == 0) println("1")
//            else println("0")
//        }
//        if (methodList[0] == "pop") {
//            if (queueList.size == 0) println("-1")
//            else {
//                println(queueList[0])
//                queueList.removeAt(0)
//            }
//        }
//    }

//    조세퍼스 문제: 1158번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val numberList = br.readLine().split(" ")
//    val queueNumber = LinkedList<Int>()
//    val resultList = ArrayList<Int>()
//
//    for (i in 1..numberList[0].toInt()) queueNumber.add(i)
//
//    while (queueNumber.isNotEmpty()) {
//        for (i in 1 until numberList[1].toInt()) queueNumber.add(queueNumber.pop())
//        resultList.add(queueNumber.pop())
//    }
//
//    print("<")
//    for (i in 0 until resultList.size - 1) print("${resultList[i]}, ")
//    print(resultList[resultList.size - 1])
//    print(">")
}