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

    // When
    val name = "Sun";
    when(name) {
        "Sun" -> print("Sun is a Star")
        "Moon" -> print("Moon is a Satellite")
        "Earth" -> print("Earth is a planet")
        else -> print("I don't know anything about it")
    }

    val num = 10;
    when(num) {
        in 1..3 -> print("Spring season")
        !in 1..12 -> print("Enter valid month of year")
    }
};
