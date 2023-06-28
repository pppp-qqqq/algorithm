import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//BOJ 1764 듣보잡 (S4)
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		Set<String> set = new HashSet<>();
		List<String> result = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		for(int i = 0; i < m; i++) {
			String name = br.readLine();
			if (set.contains(name)) {
				result.add(name);
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		result.forEach(System.out::println);
	}
}
