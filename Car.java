//hierarchichal inheritance
class Car {
    String name="Skoda";
    void vehicleType()
    {
        System.out.println("name:"+ name);
    }
}
class Maruti extends Car{
 void speed()
 {
    System.out.println("speed:40kmph");
 }
}
class Suzuki extends Car{
     void Model()
     {
        System.out.println("Model:Suzuki");
     }
}
class inheritance2
{
    public static void main(String[] args) {
        Suzuki s=new Suzuki();
        Maruti m=new Maruti();
        m.vehicleType();
        m.speed();
        s.Model();
    }
}