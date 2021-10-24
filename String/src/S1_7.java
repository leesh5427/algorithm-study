import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String input = st.nextToken().toLowerCase();
        String reverse = new StringBuilder(input).reverse().toString().toLowerCase();

        if (input.equals(reverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
