package week1.day2;

public class FibbinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fibbinocci series :");
		int firstNum=0,secNum=1,sum=0;
		System.out.print(firstNum+" ");//to print 0
		System.out.print(secNum+" ");//to print 1
		for(int i=2;i<11;i++)//for starts from 1 to 55 as already 0&1 printed
		{
			sum=firstNum+secNum;
			System.out.print(sum+" ");
			firstNum =secNum;
			secNum=sum;
		}
		
	}

}
