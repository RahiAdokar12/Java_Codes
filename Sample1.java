//Try catch program
public class Sample1 {
    public static void main(String[] args) {
        try{
            int a[]={10,30,40,60};
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
            System.out.println(a[3]);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Program Terminated");
    }
}
