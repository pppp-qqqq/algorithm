import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//BOJ 17219 비밀번호 찾기 (S4)
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, String> map = new HashMap<>();

		while(n-- > 0) {
			String[] site = br.readLine().split(" ");
			map.put(site[0], site[1]);
		}

		while(m-- > 0){
			sb.append(map.get(br.readLine())).append('\n');
		}
		System.out.print(sb);
	}
}
