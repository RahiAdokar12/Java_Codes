// this Program
class Student6 {
    int rollno;
    String name;
    void getData(int rollno,String name)
    {
    this.rollno=rollno;
    this.name=name;
    }
}
class TestStudent5{
    public static void main(String[] args) {
        Student6 s6=new Student6();
        s6.getData(5,"khushi");
        System.out.println("Rollno :"+s6.rollno);
        System.out.println("Name :"+s6.name);
    }
}
