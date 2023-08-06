// Intialization through method
class Student3 {
    int id;
    String name;
void getData(int i,String n)
{
    id=i;
    name=n;
}
void display()
{
    System.out.println(id+" "+name);
}
public static class TestStudent2
{
    public static void main(String[] args) {
        Student3 s2=new Student3();
        Student3 s3=new Student3();
        s2.getData(30,"Rahi");
        s3.getData(40,"Raj");
        s2.display();
        s3.display();

    }
}
}
