package lambdafunctions

// Extension function on list types
fun <T> List<T>.customCount(fn: (T) -> Boolean): Int {
    var count = 0;
    for (str in this) {
        if(fn(str)) {
            count++;
        }
    }
    return count;
}

fun main() {

    val items = listOf("It", "Item2");
    val count = items.customCount { currentItem -> currentItem.length > 2 }

    val numbers = listOf(1, 2, 3, 4, 6);
    val countTwo = numbers.customCount { currentNumber -> currentNumber%2==0 }

    println(countTwo);

};
