import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int curScore = 0;
        int sum = 0;

        while (st.hasMoreTokens()) {
            int cur = Integer.parseInt(st.nextToken());
            if (cur == 1) {
                curScore += cur;
                sum += curScore;
            } else {
                curScore = 0;
            }
        }
        System.out.println(sum);
    }
}
