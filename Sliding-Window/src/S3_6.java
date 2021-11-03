import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int lt = 0;
        int ans = 0;
        int cnt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt]==0) cnt++;
            while (cnt > k) {
                if (arr[lt++]==0) cnt--;
            }
            ans = Math.max(ans, rt - lt + 1);
        }
        System.out.println(ans);
    }
}
