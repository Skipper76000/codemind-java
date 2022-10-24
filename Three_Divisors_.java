import java.util.*;
class three_div {
	static void numbersWith3Divisors(int N)
	{
	    int cnt=0;
		for (int i = 2; i * i <= N; i++) {
			if (isPrime(i)) {
				if (i * i <= N) {
				    cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	public static boolean isPrime(int N)
	{
		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
	    Scanner in=new Scanner(System.in);
		int N = in.nextInt();
		numbersWith3Divisors(N);
	}
}