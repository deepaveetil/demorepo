package ArithmeticOperations;
import java.util.Scanner;
public class divisibility {
public static void main(String[] args) {
// TODO Auto-generated method stub
int num;
Scanner scan=new Scanner(System.in);
num= scan.nextInt();

if((num%2==0)&&(num%3==0))


{
System.out.println("Number is divisible by 2 & 3");
}
else
{
System.out.println("Number is not divisible by 2 & 3");
}
}
}