import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//BOJ 11399 ATM (S4)
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] p = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(p);

		int sum = 0, result = 0;
		for (int time : p) {
			sum += time;
			result += sum;
		}
		System.out.println(result);
	}
}
