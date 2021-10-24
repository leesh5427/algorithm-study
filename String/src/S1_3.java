import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(st.nextToken());
        while (st.hasMoreTokens()) {
            String nextStr = st.nextToken();
            if (sb.toString().length() < nextStr.length()) {
                sb = new StringBuilder(nextStr);
            }
        }
        System.out.println(sb);
    }
}
