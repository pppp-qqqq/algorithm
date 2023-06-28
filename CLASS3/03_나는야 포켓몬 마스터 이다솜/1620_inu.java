import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//BOJ 1620 나는야 포켓몬 마스터 이다솜 (S4)
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		Map<String, Integer> map = new HashMap<>();
		String[] names = new String[n+1];

		for(int i = 1; i <= n; i++) {
			String name = br.readLine();
			map.put(name, i);
			names[i] = name;
		}

		for(int i = 0; i < m; i++) {
			String keyword = br.readLine();
			try {
				int key = Integer.parseInt(keyword);
				sb.append(names[key]);
			} catch(NumberFormatException e) {
				sb.append(map.get(keyword));
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}
