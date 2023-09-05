import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int m=0;

    for(int i=0; i<n; i++){
      m = Integer.parseInt(br.readLine());

      if(m<2) {
        if(m==0) System.out.println("1 0");
        else System.out.println("0 1");
      }
      else {
        int[] arr = new int[41];
        arr[0] = 1;
        arr[1] = 1;
        for (int j = 2; j <= m; j++) {
  				arr[j] = arr[j-1]+ arr[j-2];
  			}
        System.out.println(arr[m-2]+" "+arr[m-1]);
      }
    }
  }
}

