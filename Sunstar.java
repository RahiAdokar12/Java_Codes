// abtsract class program
abstract class Sunstar {
    abstract void printInfo();
}
class Employee extends Sunstar
{
    String name="Avinash";
    int age=27;
    float Salary=292.50f;
    void printInfo()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(Salary);
    }
}
class Base{
   public static void main(String[] args) {
    Sunstar s=new Employee();
    s.printInfo();
   }
}
