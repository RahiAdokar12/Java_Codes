// program for Swapping 
class Swapping 
{
    public static void main(String args[]) 
    {
        int a=10;
        int b=20;
        System.out.println("The value of a="+a+" & the value of b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
        System.out.println("The value of a="+a+" & the value of b="+b);
    }

}
