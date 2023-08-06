//single inheritance
class StudentInfo 
{
    int rollno=8;
    String name="aarti";
    void displayInfo()
    {
        System.out.println("Rollno:"+ rollno);
        System.out.println("Name:"+ name);
    }
}
class StudentMarks extends StudentInfo
{
    int Math=80;
    int OOP=69;
    void displayMarks()
    {
        System.out.println("MathMarks:"+ Math);
        System.out.println("OOPMark:"+OOP);
    }
}
class Sample1
{
    public static void main(String[] args) {
        StudentMarks s1=new StudentMarks();
        s1.displayInfo();
        s1.displayMarks();
    }
}
