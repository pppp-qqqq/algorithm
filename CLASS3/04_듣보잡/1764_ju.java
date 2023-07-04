import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int n = Integer.parseInt(inputs[0]);
    int m = Integer.parseInt(inputs[1]);
    
    HashSet<String> set = new HashSet<>();
    while (n-- > 0)
        set.add(br.readLine());
    ArrayList<String> result = new ArrayList<>();
    while (m-- >0){
      String tmp = br.readLine();
      if(set.contains(tmp)){ //듣도 & 보도 못한이름이면 추가
        result.add(tmp);
      }
    }
  Collections.sort(result);

    System.out.println(result.size());
    for(String s :result){
      System.out.println(s);
    }
  }  
}
  