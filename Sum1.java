// method Overloading
class Sum1 {
    int add(int a,int b){
        return (a+b);
    }
int add(int a,int b,int c)
{
    return (a+b+c);
}
 double add(double a,double b)
 {
    return (a+b);
 }
}
 class TestOverloading
{
    public static void main(String[] args) {
        Sum1 s1=new Sum1();
        System.out.println(s1.add(2,6));
        Sum1 s2=new Sum1();
        System.out.println(s2.add(5,9));
        Sum1 s3=new Sum1();
        System.out.println(s3.add(4.4,1.2));
    }
}