import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class S1_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String input = st.nextToken();
        char target = st.nextToken().charAt(0);
        Integer[] distance = new Integer[input.length()];

        int curDis = 1000;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                curDis = 0;
            } else {
                curDis++;
            }
            distance[i] = curDis;
        }

        curDis = 1000;
        for (int i = input.length()-1; i > -1; i--) {
            if (input.charAt(i) == target) {
                curDis = 0;
            } else {
                curDis++;
            }
            distance[i] = Math.min(distance[i], curDis);
        }

        for (Integer i : distance) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}