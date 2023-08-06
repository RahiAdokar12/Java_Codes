//Garbage collector & finalize(by assining a reference to another)
class Test1 {
    int Marks=50;
    String sub="Math";
protected void finalize()
{
    System.out.println("finalize method executed");
}
 }
 class StudentTest1
 {
public static void main(String[] args) {
    Test t1=new Test();
    Test t2=new Test();
    System.out.println("Marks:"+t1.Marks);
    System.out.println("sub:"+t1.sub);
    t1=t2;
System.gc();
}
}
