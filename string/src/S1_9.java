import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (char c : st.nextToken().toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        Integer ans = Integer.parseInt(sb.toString());
        System.out.println(ans);
    }
}
