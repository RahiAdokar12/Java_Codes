//through constructor
class Student4
  {
        int id;
        String name;
    Student4(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println("id :"+ id);
        System.out.println("name :"+ name);
    }
}
     class TestStudent3
    {
        public  static void main(String[] args) {
            Student4 s2=new Student4(1,"riya");
            Student4  s3=new Student4(2,"shree");
            s2.display();
            s3.display();
    
        }
    }
    
