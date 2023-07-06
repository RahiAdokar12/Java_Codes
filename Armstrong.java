// Armstrong no
class Armstrong
{
  public static void main(String args[])
  {
  int number=153,originalNumber,remainder,result=0;
  originalNumber=number;
  while(originalNumber !=0)
  {
    remainder=originalNumber %10;
	result +=result+Math.pow(remainder,3);
	originalNumber/=10;
	}
	if(result==number)
	{
	System.out.println(number +" Armstrong");
	}
	else{
	System.out.println(number +" not Armstrong");
	}
  }
}