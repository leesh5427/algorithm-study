import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (char c : br.readLine().toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
