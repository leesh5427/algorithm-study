import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S1_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String input = st.nextToken();
        Stack<Character> reverse = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetterOrDigit(input.charAt(i))) {
                reverse.push(input.charAt(i));
            }
        }

        char[] ans = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetterOrDigit(input.charAt(i))) {
                ans[i] = input.charAt(i);
            } else {
                ans[i] = reverse.pop();
            }
        }

        System.out.println(String.valueOf(ans));
    }
}
