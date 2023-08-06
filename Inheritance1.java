//Multilevel Inheritance
class Animal
{
    void eat()
    {
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("barking");
    }
}
class LittleDog extends Dog
{
    void weep()
    {
        System.out.println("weeping");
    }
}
class inheritance1
{
public static void main(String[] args) {
    LittleDog d=new LittleDog();
    d.bark();
    d.eat();
    d.weep();
}
}
