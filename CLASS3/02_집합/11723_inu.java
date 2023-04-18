import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//BOJ 11723 집합 (S5)
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();

		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String operator = st.nextToken();
			int operand = 0;
			if (st.hasMoreTokens()) {
				operand = Integer.parseInt(st.nextToken());
			}

			switch (operator) {
				case "add":
					set.add(operand);
					break;
				case "remove":
					set.remove(operand);
					break;
				case "check":
					sb.append(set.contains(operand) ? 1 : 0).append("\n");
					break;
				case "toggle":
					if (set.contains(operand)) {
						set.remove(operand);
					} else {
						set.add(operand);
					}
					break;
				case "all":
					for (int j = 1; j <= 20; j++) {
						set.add(j);
					}
					break;
				case "empty":
					set.clear();
			}
		}
		System.out.println(sb);
	}
}
