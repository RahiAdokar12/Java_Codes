// consturctor overloading
public class School {
    String scName;
    int estYear;
School()
{
    scName="Shivaji High School";
   estYear=2018;
}
School(String name)
{
    scName=name;
}
School(String name,int year)
{
    scName=name;
     estYear=year;
}
void display()
{
  System.out.println("scName:"+scName);
  System.out.println("estYear:"+estYear);
}
}
class TestConstructor
{
    public static void main(String[] args) {
        School sc=new School();
        School sc1=new School("Shivaji High School");
        sc.display();
        sc1.display();
        School sc2=new School("Shivaji High School",2018);
        sc2.display();
    }
}