class Rectangle {
    int length;
    int width;
void getData(int l,int w)
{
    length=l;
    width=w;
}
void calculateArea()
{
    System.out.println(length*width);
}}
class TestRectangle1
{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        r1.getData(2, 3);
        r2.getData(3, 4);
       r1.calculateArea();
       r2.calculateArea();
    }
}