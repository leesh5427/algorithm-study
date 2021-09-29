import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);

        for (int i = 2; i < (n / 2); i++) {
            if (!arr[i]) {
                continue;
            }
            for (int j = i * 2; j < n + 1; j += i) {
                arr[j] = false;
            }
        }

        int ans = 0;
        for (int i = 2; i < n + 1; i++) {
            if (arr[i]) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
