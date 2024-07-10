fun main() {

    // Immutable lists
    val shoppingList = listOf<String>("lamborghini", "Rolex");
    // println(shoppingList);

    // Mutable lists
    val mutableItems = mutableListOf("Rolex");
    mutableItems.add("Ferrari");
    // println(mutableItems);


    // Loops
    var counter = 0;
    while(counter < shoppingList.size) {
//        println(shoppingList[counter]);
        ++counter;
    }

    for (item in shoppingList) {
//        println(item);
    }

    for (i in 0..<shoppingList.size) {
        println(shoppingList[i]);
    }
}