import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int lt = 1;
        int sum = 0;
        int ans = 0;
        for (int rt = 1; rt <= n / 2 + 1; rt++) {
            sum += rt;
            if (sum == n) ans++;
            while (sum >= n) {
                sum -= lt++;
                if (sum == n) ans++;
            }
        }

        System.out.println(ans);
    }
}
