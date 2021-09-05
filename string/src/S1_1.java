import java.io.IOException;
import java.io.*;
import java.util.*;

public class S1_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken().toLowerCase();

        st = new StringTokenizer(br.readLine());
        char target = Character.toLowerCase(st.nextToken().charAt(0));

        int ans = 0;

        for (char c : input.toCharArray()) {
            if (target == c) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
