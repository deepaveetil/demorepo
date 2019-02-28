package ArithmeticOperations;

public class ReverseOfaNum {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		
		int num=12345,temp,revNum=0;
		
		while (num>0)
		{
			temp=num%10;
			revNum=revNum*10+temp;
			num=num/10;
		}
System.out.print(revNum);
	}

}
