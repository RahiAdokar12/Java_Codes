//Fabonacii
class Fibonacii  
{
public static void main(String args[])
{
  int num1=0;
  int num2=1;

  int result;
  int n=4;
  for(int i=1;i<=n;i++){

  result=num1+num2;
  System.out.println(result);
  num1=num2;
  num2=result;
}
}
}