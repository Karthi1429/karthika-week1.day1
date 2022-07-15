package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0;
int n2=3;
int n=12, n4;
System.out.println(n1+" "+n2);
for (int i=0; i<=n; i++)
{
	n4=n1+n2;
	n1=n2;
	n2=n4;
	System.out.println(" "+n4);
}
	}

}
