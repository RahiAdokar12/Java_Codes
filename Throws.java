public class Throws {
    public static int div(int x,int y)throws Exception{
        return(x/y);
    }
    public static void main(String[] args) {
        try{
            int d;
            d=div(10,0);
            System.out.println("division is"+ d);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
