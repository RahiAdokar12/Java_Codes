// Interface program
interface Bank {
    float rateOfInterest();
}
class CBOI implements Bank{
   public float rateOfInterest()
    {
        return 9.8f;
    }
}
class SBI implements Bank{
  public float rateOfInterest()
    {
        return 5.7f;
    }

public void p1() {
}
}
class Interface
{
    public static void main(String[] args) {
        Bank b=new CBOI();
        Bank b1=new SBI();
        System.out.println("ROI:"+b.rateOfInterest());
        System.out.println("ROI:"+b1.rateOfInterest());
    }
}