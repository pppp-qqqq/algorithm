import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BOJ 1003 피보나치 함수 (S3)
public class Main {
	static int[] dp = new int[42];
	public static int fibonacci(int n) {
		if(n <= 1) {
			return dp[n];
		} else if(dp[n] == 0) {
			dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
			dp[n+1] = dp[n-1] + dp[n];
		}
		return dp[n];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dp[1] = 1;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				System.out.println("1 0");
			} else {
				System.out.println(fibonacci(n - 1) + " " + fibonacci(n));
			}
		}
	}
}
