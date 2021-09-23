import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        sb.append(arr.get(0)).append(" ");
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                sb.append(arr.get(i)).append(" ");
            }
        }

        System.out.println(sb);
    }
}
