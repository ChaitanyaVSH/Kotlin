fun isEven(x: Int): Boolean {
    return (x%2)==0;
}

fun isEvenDefault(x: Int = 10): Boolean {
    return (x%2)==0;
}

fun printNumbersInRange(x: Int = 10, y: Int) {
    for (i in x..y) {
        println("$i is ${if (isEven(i)) "Even" else "Odd"}");
    }
}

// Extension functions on data types and Classes
fun Int.isOdd(): Boolean {
    return this%2 == 1;
}

fun main() {
//    val x = readln().toInt();
//    println("Entered number is $x and is ${if (isEven(x)) "Even" else "Odd"}");
    val y= 5;
    println("Y is Odd: " + y.isOdd())
    //printNumbersInRange(y=100);
}
