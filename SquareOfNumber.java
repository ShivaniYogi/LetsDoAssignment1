public class SquareOfNumber{
	public static void main(string [] args)
	{
		int num, sq;
		System.out.println("Enter an Integer Number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sq = num*num;
		System.out.println("Square Of a Number is : " +sq);
	}
}