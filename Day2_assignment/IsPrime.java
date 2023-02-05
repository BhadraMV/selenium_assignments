package week1.day2;

public class IsPrime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
        IsPrime ip = new IsPrime();
        int flag=ip.isPrimeNumber(n);
        if(flag==0)System.out.println(n+" is prime number");
        else System.out.println(n+" is not a prime number");
	}
	public int isPrimeNumber(int n)
	{
		int flag=0;
		if(n==0||n==1)
		{
			flag= 1;
		}
		else
		{
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				flag = 1;
				break;
			}
			else
			{
				flag =0;
			}
			
		}
		}
		return flag;
		
	}

}


