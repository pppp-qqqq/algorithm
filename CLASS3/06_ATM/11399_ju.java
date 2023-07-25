import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] inputs = br.readLine().split(" ");
    int[] arr = new int[n];
    
    for(int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(inputs[i]);
    }
    Arrays.sort(arr);

    int prev = 0;
    int sum=0;
    for(int i=0; i<n; i++) {
      prev += arr[i];
      sum += prev;
    }
     System.out.println(sum);
  }
}
  