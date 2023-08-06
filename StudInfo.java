//Super class program
public class StudInfo {
    int rollno=4;
    String name="Oju";
}
class StudentClass extends StudInfo
{
    int rollno=8;
    String name="Rahi";
    void display()
    {
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
        System.out.println("rollno:"+super.rollno);
        System.out.println("name:"+super.name);
    }
}
class Result{
public static void main(String[] args) {
    StudentClass sc=new StudentClass();
    sc.display();
}
}

