package classes

class Dog(name: String, age: Int): Animal(name, age) {

    init {
        // This gets executed after the init of super class.
        println("I'm a dog");
    };

    fun bark() {
        println("Bow bow bow");
    };
};
