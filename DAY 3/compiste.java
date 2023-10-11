import java.util.Arrays;
import java.util.Scanner;
public class compiste
 {
public static void main(String[] args) 
{
Scanner input=new Scanner(System.in);
int size = input.nextInt();
int []arr = new int	[size];
int len=arr.length;
int count=0;
for(int i=0;i<len;i++)
{
 int c=0;
 for(int j=1;j<100;j++)
 {
 if(arr[i]%j==0)
 {
 c++;
 }
 }
 if(c>2)
 count++;
}
System.out.println(count);
}
}

