//Method overriding

class Banker {
    void p1()
    {
        System.out.println("parent class");
    }
    class ICICI extends Banker
    {
        void p1()
        {
            System.out.println("child class");
        }
    }
}
class Main{
    public static void main(String[] args) {
        Banker b=new Banker();
         b.p1();
        ICICI i=new ICICI();
        i.p1();
    }
}
