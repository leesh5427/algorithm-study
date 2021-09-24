import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int ans = 1;
        int maxHeight = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (maxHeight < arr.get(i)) {
                ans++;
                maxHeight = arr.get(i);
            }
        }
        System.out.println(ans);
    }
}
