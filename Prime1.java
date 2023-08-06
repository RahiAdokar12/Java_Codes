class Prime1
 {
    public static void main(String args[])
     {
        int num=4;boolean flag=true;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                flag=false;break;
            }}
            if(flag==true)
            {
                System.out.println("No. is prime");
}
else{
    System.out.println("No. is not prime");
}
        }
    }

