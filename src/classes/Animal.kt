package classes;

open class Animal(
    private val name: String,
    private val age: Int
) {
    init {
        // This gets executed whenever an instance is created.
        println("Hello, my name is $name");
    }

    fun getName(): String {
        return this.name;
    }

    fun getAge(): Int {
        return this.age;
    }
};
