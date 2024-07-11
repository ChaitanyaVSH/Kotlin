package classes;

fun main() {
    val dog = Dog("Tommy", 10);
    println("Dog name is ${dog.getName()} and age is ${dog.getAge()}");
    println(dog.bark());

    val cat = Cat("Mickey", 5);
    println("Cat name is ${cat.getName()} and age is ${cat.getAge()}");
    println(cat.shout());
};
