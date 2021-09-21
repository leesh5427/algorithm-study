import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int count = 1;
        char prevChar = ' ';

        for (char c : st.nextToken().toCharArray()) {
            if (prevChar == c) {
                count += 1;
            } else {
                if (count != 1) {
                    sb.append(count);
                }
                count = 1;
                prevChar = c;
                sb.append(c);
            }
        }

        if (count != 1) {
            sb.append(count);
        }

        System.out.println(sb);
    }
}