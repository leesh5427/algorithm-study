import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : str1.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        st = new StringTokenizer(br.readLine());
        String ans = "YES";
        for (Character key : st.nextToken().toLowerCase().toCharArray()) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) - 1);
            } else {
                ans = "NO";
            }
        }

        if (!ans.equals("NO")) {
            if (map.values().stream().anyMatch(v -> v > 0)) {
                ans = "NO";
            }
        }

        System.out.println(ans);
    }
}