package week1.day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstNum=0;
		int secondNum=1;
		System.out.println(firstNum);
		for (int i=1; i<=range; i++)
		{
			int sum = firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
					System.out.println(sum);
		}
		

	}

}
