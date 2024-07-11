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

fun main() {
//    val x = readln().toInt();
//    println("Entered number is $x and is ${if (isEven(x)) "Even" else "Odd"}");
    printNumbersInRange(y=100);
}
