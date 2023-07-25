import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int n = Integer.parseInt(inputs[0]);
    int money = Integer.parseInt(inputs[1]);

    int[] coin = new int[n];
    
    for(int i=0; i<n; i++) {
      coin[i] = Integer.parseInt(br.readLine());
    }
    int count = 0;
    while(n-- > 0){
      if(coin[n] <= money) {
        count += money / coin[n];
        money = money % coin[n];
        // System.out.println(money);
      }
    }
    System.out.println(count);
}
}
  