import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;


public class Main {
  public static void main(String[] args) throws IOException  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");
    int n = Integer.parseInt(inputs[0]);
    int m = Integer.parseInt(inputs[1]);
    
    HashMap<String,String> map = new HashMap<String,String>();//HashMap생성
    for(int i=0; i<n; i++){
      inputs = br.readLine().split(" ");
      map.put(inputs[0], inputs[1]);
    }
    ArrayList<String> list = new ArrayList<>();
        
    for(int i=0; i<m; i++){
      inputs = br.readLine().split(" ");
      list.add(map.get(inputs[0]));      
    }
    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i));
    }
   
  }
}
