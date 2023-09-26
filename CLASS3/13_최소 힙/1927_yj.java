import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new PriorityQueue<>();

        for (int i=0;i<N;i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(q.size() == 0) {
                    System.out.println(0);
                }
                else {
                    System.out.println(q.poll());
                }
            }
            else {
                q.add(x);
            }
        }
    }
}
