// classes & object
class Student
  {
    int rollno=20;
    String name="Rahi";
    void display()
    {
       System.out.println("Rollno:"+rollno);
       System.out.println("Name:"+name);
    }
    public static void main(String args[])
     {
        Student s1;
        s1=new Student();
        s1.display();
     }
}