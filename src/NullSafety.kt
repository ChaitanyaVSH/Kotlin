// Null Safe
fun main() {

//    val number1 = readln();
//    val number2 = readln();
////  Both the inputs will be treated as strings. Kotlin does not do the addition here.
//    val sum = number1 + number2;
//    println(sum)
//
//    val actualSum = number1!!.toInt() + number2!!.toInt();
//
////  Instead of above we can actually do null safe when accepting the input as below.
//    val number3 = readln() ?: "0"
//    val number4 = readln() ?: "0"
//
//    val sum2 = number3.toInt() + number4.toInt();
//    println(sum2);

    var b: String? = "abc" // can be set to null
    b = null;
    print(b?.length)
    val a = "test"
    println(a?.length)
}