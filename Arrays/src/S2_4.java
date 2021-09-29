import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_4 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] board = new int[n];
        board[0] = 1;
        board[1] = 1;

        for (int i = 2; i < n; i++) {
            board[i] = board[i - 1] + board[i - 2];
        }

        for (int a : board) {
            System.out.print(a+" ");
        }
    }
}
