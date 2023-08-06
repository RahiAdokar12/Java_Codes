class ThisExample 
{
    int num=10;
    public ThisExample()
    {
        System.out.println("Inside constructor");
    }
    public ThisExample(int num)
    {
        this();
        this.num=num;
    }
    void display()
    {
        this.show();
        System.out.println("num:"+this.num);
    }
    void show()
    {
        System.out.println("Inside the show method");
    }
    public static void main(String[] args) {
        ThisExample obj=new ThisExample(100);
        obj.display();
    }
}
