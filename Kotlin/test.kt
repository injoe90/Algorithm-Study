import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.floor
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val prime = ArrayList<Int>()
    val check = ArrayList<Boolean>()
    val MAX = 1000000
    var primeCursor = 0;
    for (i in 0 until MAX) prime.add(0)
    for (i in 0..MAX) check.add(false)

    for (i in 2..MAX) {
        if (!check[i]) {
            primeCursor += 1
            prime[primeCursor] = i
            for (j in i*2..MAX step(i)) check[j] = true
        }
    }

    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) break
        for (i in 0 until primeCursor) {
            if (!check[n - prime[i]]) {
                println("$n = ${prime[i]} + ${n - prime[i]}")
                break
            }
        }
    }
}


