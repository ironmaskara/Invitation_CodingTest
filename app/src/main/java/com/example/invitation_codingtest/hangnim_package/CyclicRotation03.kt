
import android.text.BoringLayout
import java.lang.StringBuilder
import java.util.*
import kotlin.collections.HashMap

// 태스크 스코어 50% 올바름 50% 성능 : 평가안됨
fun main(args : Array<String>){

    fun solution(A: IntArray, K: Int): IntArray {

        val list = A.toList()
        Collections.rotate(list, K)
        return list.toIntArray()
    }

    var A = intArrayOf(3, 8, 9, 7, 6)
    var K = 3

    val B = solution(A,K)
    println(B)

}