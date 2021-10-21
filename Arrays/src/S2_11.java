import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 10^6*5 = 5M
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][5];
        int[][] table = new int[n][5];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int captain = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) { // current student number
            int count = 0;
            for (int j = 0; j < n; j++) { // student number
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < 5; k++) { // grade number
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (max < count) {
                captain = i;
                max = count;
            }
        }

        System.out.println(captain+1);
    }
}
