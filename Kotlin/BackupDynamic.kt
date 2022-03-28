import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
// 카드 구매하기: 11052번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val n = br.readLine().toInt()
//    val inputList = br.readLine().split(" ").map { it.toInt() }
//    val maxPay = IntArray(n + 1)
//    for (i in 1..n) maxPay[i] = inputList[i - 1]
//    for (i in 2..n) {
//        for (j in 1 until i) {
//            val temp = maxPay[j] + maxPay[i - j]
//            if (temp > maxPay[i]) maxPay[i] = temp
//        }
//    }
//    println(maxPay[n])
}

// 1로 만들기: 1463번
//fun oneMake(n:Int):Int {
//    val oneCount = IntArray(n + 1)
//    oneCount[1] = 0
//    for (i in 2..n) {
//        oneCount[i] = oneCount[i - 1] + 1
//        if (i % 2 == 0 && (oneCount[i] > oneCount[i / 2] + 1)) oneCount[i] = oneCount[i / 2] + 1
//        if (i % 3 == 0 && (oneCount[i] > oneCount[i / 3] + 1)) oneCount[i] = oneCount[i / 3] + 1
//    }
//    return oneCount[n]
//}

// 2 x n 타일링: 11726번
//fun twoByN(n:Int):Int {
//    val rCount = IntArray(n + 2)
//    rCount[1] = 1
//    rCount[2] = 2
//    for (i in 3..n) rCount[i] = ((rCount[i - 2] % 10007) + (rCount[i -1] % 10007)) % 10007
//    return rCount[n]
//}

// 2 x n 타일링 2: 11727번
//fun twoByN2(n:Int):Int {
//    val nCount = IntArray(n + 2)
//    nCount[1] = 1
//    nCount[2] = 3
//    for (i in 3..n) nCount[i] = ((nCount[i - 1]) % 10007 + (nCount[i - 2] * 2 % 10007)) % 10007
//    return nCount[n]
//}

// 1, 2, 3 더하기: 9095번
//fun oneTwoThree(n:Int):Int {
//    val nCount = IntArray(n + 3)
//    nCount[1] = 1
//    nCount[2] = 2
//    nCount[3] = 4
//    for (i in 4..n) nCount[i] = nCount[i - 1] + nCount[i - 2] + nCount[i - 3]
//    return nCount[n]
//}