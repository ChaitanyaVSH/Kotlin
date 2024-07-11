package classes

class Cat(name: String, age: Int): Animal(name, age) {

    init {
        // This gets executed after the init of super class.
        println("I'm a cat");
    };

    fun shout() {
        println("meow meow");
    };
};
