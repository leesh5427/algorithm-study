import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_9 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 각 행의 합
        int rowColMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            int tempMax = Math.max(rowSum, colSum);
            rowColMax = Math.max(rowColMax, tempMax);
        }

        int leftDiaSum = 0;
        int rightDiaSum = 0;
        for (int i = 0; i < n; i++) {
            leftDiaSum += arr[i][i];
            rightDiaSum += arr[i][n - 1 - i];
        }
        int diaMax = Math.max(leftDiaSum, rightDiaSum);
        System.out.println(Math.max(rowColMax, diaMax));
    }
}
