//loacl ,instance & static variable
class Student5 {
    int rollno;
    String name;
    static String branch;
void getData(int r,String n,String b)
{
    rollno=r;
    name=n;
    branch=b;
}
}
class TestStudent4
{
    public static void main(String[] args) {
        Student5 s5=new Student5();
        s5.getData(2, "disha", "cse");
        System.out.println("roll no:"+ s5.rollno);
        System.out.println("Name:"+ s5.name);
        System.out.println("branch:"+ Student5.branch);
    }
}
