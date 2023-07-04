import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int S = 0; //공집합 s
    int M = Integer.parseInt(br.readLine());
    StringTokenizer st;
    for(int i=0; i<M; i++){
      st = new StringTokenizer(br.readLine());
      String str = st.nextToken();
      int num = 0;
      switch(str){
        case "all":
          S = (1<<21) -1; //20자리 이진수, 각 비트의 자리수는 0~19이므로 -1해준다
          break;
        case "empty":
          S = 0;
          break;
        case "add":
          num = Integer.parseInt(st.nextToken());
          S |= (1 << num);
          break;
        case "remove":
          num = Integer.parseInt(st.nextToken());
          S &= ~(1 << num);
          break;
        case "check":
          num = Integer.parseInt(st.nextToken());
          sb.append((S & (1 << num)) == 0 ? 0 : 1).append("\n");
          break;
        case "toggle":
          num = Integer.parseInt(st.nextToken());
          S ^= (1 << num);
          break;
      }
    }
    System.out.println(sb);
  
  }
}