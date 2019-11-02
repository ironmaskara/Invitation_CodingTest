import kotlin.collections.ArrayList

fun main(args: Array<String>) {

    fun solution(A: ArrayList<Int>, K: Int): IntArray{
        if (A.size ==0){
            return A.toIntArray()
        }
        else if ((K%A.size==0) )
            return A.toIntArray()

        else {
            val n=K%A.size
            val arraya = A.slice(0 until A.size-n)
            val arrayb = A.slice(A.size-n until A.size)
            val result = arrayb + arraya
            return result.toIntArray()
        }
    }


    val A = arrayListOf<Int>()
    val K = 13
    println(solution(A,K).toList())


}
/* fun solution(A: IntArray, K: Int): IntArray{
        if ((K%A.size==0) or (A.size==0))
            return A
        else if (K%(A.size)>A.size-(K%A.size)){
            val n=K%A.size
            val arraya = A.slice(A.size-n until  A.size)
            val arrayb = A.slice(0 until  A.size-n)
            val result = arraya + arrayb
            return result.toIntArray()
        }
        else {
            val n=K%A.size
            val arraya = A.slice(0 until A.size-n)
            val arrayb = A.slice(A.size-n until A.size)
            val result = arrayb + arraya
            return result.toIntArray()
        }
    }*/
