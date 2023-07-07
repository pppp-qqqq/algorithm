import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    
    HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
    String[] nameArr = new String[n+1];

    for(int i=0; i<n; i++){
      String name = br.readLine();
      nameMap.put(name, i+1);
      nameArr[i+1] = name;
    }

    while(m-- > 0){
      String InputStr = br.readLine();
      if(isNumeric(InputStr)){ //숫자 입력 경우
        int idx = Integer.parseInt(InputStr);
        sb.append(nameArr[idx]);
      }
      else {
        sb.append(nameMap.get(InputStr));
      }
      sb.append("\n");
    }
    System.out.println(sb.toString());
  

  }
  public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
  