import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*
//
//// Complete the kangaroo function below.
//fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
//
//
//}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()
    val v1 = x1V1X2V2[1].trim().toInt()
    val x2 = x1V1X2V2[2].trim().toInt()
    val v2 = x1V1X2V2[3].trim().toInt()
    var checker = "NO"
    val div = ((x2-x1).toDouble()/(v1-v2).toDouble())
    val div_int = div.toInt()
    if(v1 == v2 && x2 == x1) checker = "YES"
    else if(div - div_int.toDouble() == 0.0  && div > 0)
    {
        checker = "YES"
    }

    println(checker)
}
