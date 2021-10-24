import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import static java.lang.Boolean.*;

public class S1_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Character, Boolean> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String input = st.nextToken();
        for (char c : input.toCharArray()) {
            if (!hashMap.getOrDefault(c, FALSE)) {
                hashMap.put(c, TRUE);
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
