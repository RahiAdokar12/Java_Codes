// single inheritance by calculating area of rectangle
class Shape {
     int length;
     int breadth;
}
class Rectangle extends Shape
{
    int area;
    void findArea()
    {
        area=length*breadth;
    }
}
class inheritance
{
    public static void main(String[] args) {
       Rectangle r=new Rectangle();
       r.length=40;
       r.breadth=30;
       r.findArea();
       int area=r.length*r.breadth;
       System.out.println("Area of rectangle is::"+ area);
    }
}
