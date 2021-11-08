import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S4_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] sStr = st.nextToken().toCharArray();
        st = new StringTokenizer(br.readLine());
        char[] tStr = st.nextToken().toCharArray();

        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : tStr) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int size = tStr.length;
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < size - 1; i++) {
            sMap.put(sStr[i], sMap.getOrDefault(sStr[i], 0) + 1);
        }

        int lt = 0;
        int ans = 0;
        for (int rt = size - 1; rt < sStr.length; rt++) {
            sMap.put(sStr[rt], sMap.getOrDefault(sStr[rt], 0) + 1);
            if (sMap.equals(tMap)) {
                ans++;
            }
            sMap.put(sStr[lt], sMap.get(sStr[lt]) - 1);
            if (sMap.get(sStr[lt]) == 0) {
                sMap.remove(sStr[lt]);
            }
            lt++;
        }

        System.out.println(ans);
    }
}