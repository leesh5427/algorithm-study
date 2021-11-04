import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr2 = new int[m];
        for (int j = 0; j < m; j++) {
            arr2[j] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (p1 < n && p2 < m) {
            if (arr1[p1] <= arr2[p2]) {
                ans.add(arr1[p1++]);
            } else {
                ans.add(arr2[p2++]);
            }
        }
        while (p1 < n) {
            ans.add(arr1[p1++]);
        }
        while (p2 < m) {
            ans.add(arr2[p2++]);
        }

        ans.forEach(integer -> System.out.print(integer+" "));
    }
}
