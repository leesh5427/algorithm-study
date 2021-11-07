import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        for (int i = k - 1; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            sb.append(hm.keySet().size()).append(" ");
            hm.put(arr[i - k + 1], hm.get(arr[i - k + 1]) - 1);
            if (hm.get(arr[i - k + 1]) == 0) {
                hm.remove(arr[i - k + 1]);
            }
        }

        System.out.println(sb);
    }
}
