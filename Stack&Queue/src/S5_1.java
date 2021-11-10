import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                if (stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.add(input.charAt(i));
                    break;
                }
            } else {
                stack.push(input.charAt(i));
            }
        }

        if (stack.size() != 0) {
            sb.append("NO");
        } else {
            sb.append("YES");
        }

        System.out.println(sb);
    }
}
