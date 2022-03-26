import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
// 나머지: 10430번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val (A, B, C) = br.readLine().split(" ").map{it.toInt()}
//    println("${(A + B) % C}")
//    println("${((A % C) + (B % C)) % C}")
//    println("${(A * B) % C}")
//    println("${((A % C) * (B % C)) % C}")

// 최대공약수와 최소공배수: 2609번
//    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
//    println(gcd(a, b))
//    println(lcd(a, b))

// 소수 찾기: 1978번
//    val br = BufferedReader(InputStreamReader(System.`in`));
//    val rangeNumber = br.readLine().toInt()
//    val inputList = br.readLine()!!.split(" ").map { it.toInt() }
//    var cnt = 0
//    for (item in inputList) if (primeNumber(item)) cnt += 1
//    println(cnt)

// 소수 구하기: 1929번
//    val br = BufferedReader(InputStreamReader(System.`in`));
//    val (m, n) = br.readLine().split(" ").map { it.toInt() }
//    val prime = ArrayList<Int>()
//    var primeCursor = 0;
//    for (i in 0 until n) prime.add(-1)
//
//    for (i in 2..n) {
//        primeCursor += 1
//        if (prime[primeCursor] == -1) prime[primeCursor] = i
//        for (j in i * 2..n step(i)) prime[j - 1] = 0
//    }
//    for (item in prime) {
//        if (item >= m) println(item)
//    }

// 팩토리얼: 10872번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    var n = br.readLine().toInt()
//
//    when (n) {
//        0, 1 -> println(1)
//        in 2..12 -> {
//            var result = 1;
//            while (n != 1) {
//                result *= n
//                n -= 1
//            }
//            println(result)
//        }
//    }
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val n = br.readLine().toInt()
//    println(factorial(n))

//    val br = BufferedReader(InputStreamReader(System.`in`))
//    println(factorial_zero(br.readLine().toFloat(), 5F))

// 골든바흐의 추측: 6588번
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val prime = ArrayList<Int>()
//    val check = ArrayList<Boolean>()
//    val MAX = 1000000
//    var primeCursor = 0;
//    for (i in 0 until MAX) prime.add(0)
//    for (i in 0..MAX) check.add(false)
//
//    for (i in 2..MAX) {
//        if (!check[i]) {
//            primeCursor += 1
//            prime[primeCursor] = i
//            for (j in i*2..MAX step(i)) check[j] = true
//        }
//    }
//
//    while (true) {
//        val n = br.readLine().toInt()
//        if (n == 0) break
//        for (i in 0 until primeCursor) {
//            if (!check[n - prime[i]]) {
//                println("$n = ${prime[i]} + ${n - prime[i]}")
//                break
//            }
//        }
//    }
}

//fun gcd(a:Int, b:Int):Int {
//    return if (b == 0) a
//    else gcd(b, a % b)
//}
//
//fun lcd(a:Int, b:Int):Int {
//    return gcd(a, b) * (a / gcd(a, b)) * (b / gcd(a, b))
//}

//fun primeNumber(a:Int):Boolean {
//    if (a < 2) return false
//    for (i in 2..floor(sqrt(a.toFloat())).toInt()) if ((a % i) == 0) return false
//    return true
//}

//fun factorial(n:Int):Int {
//    if (n == 0) return 1
//    else if (n == 1) return n
//    return n * factorial(n - 1)
//}

// 팩토리얼 0의 개수: 1676번
//fun factorial_zero(n:Float, a:Float):Int {
//    val result = floor(n/a).toInt()
//    if (result == 0) return result
//    return result + factorial_zero(n, a * 5)
//}