import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

// 6:21
public class 괄호문자제거 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();

        Stack<Character> stack = new Stack<>();

        /**
         * A(BC)D -> AD
         * (A(BC)D -> AD
         * ABC) -> ABC
         * A((BCD)E -> AE
         */
        for (char c : input.toCharArray()) {
            if (c == ')') {
                if (stack.contains('(')) {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        for (char c : new ArrayList<>(stack)) {
            System.out.print(c);
        }
    }
}
