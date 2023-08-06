//use of Multiple inheritance using interfaces 
interface Interface1 {
    void i1();
}
interface Interface2
{
    void i2();
}
class Box implements Interface1,Interface2
{
  public void i1()
   {
    System.out.println("contents of I1");
   }
   public void i2()
   {
    System.out.println("contents of I2");
   }
}
class Sample2
{
    public static void main(String[] args) {
       Interface1 I=new Box();
       I.i1();
       Interface2 I1=new Box();
       I1.i2();
    }
}
