 //Garbage collector & finalize(by nulling an reference)
 class Test {
    int Marks=50;
    String sub="Math";
protected void finalize()
{
    System.out.println("finalize method executed");
}
 }
 class StudentTest
 {
public static void main(String[] args) {
    Test t1=new Test();
    System.out.println("Marks:"+t1.Marks);
    System.out.println("sub:"+t1.sub);
    t1=null;
    System.gc();
}
 }