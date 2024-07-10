fun main() {
    val x = 1 + 3;

    if(x == 2) {
        println("x is 2");
    } else if (x > 2) {
        println("x is greater than 2");
    } else {
        println("x is not found");
    }

//  Another KOTLIN specific feature
    var y = if(x ==2) 2 else 3;
};
