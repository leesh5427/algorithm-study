import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // n * n * n * m = 20^3 * 10 =
        int[][] score = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int student = Integer.parseInt(st.nextToken())-1;
                score[i][j] = student;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) { // mentor
            for (int j = 0; j < n; j++) { // mentee
                if (i != j) {
                    boolean go = true;
                    for (int k = 0; k < m; k++) { // test number
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for (int l = 0; l < n; l++) { // place
                            if (score[k][l] == i) { //
                                mentorScore = l;
                            } else if (score[k][l] == j) {
                                menteeScore = l;
                            }
                        }
                        if (mentorScore > menteeScore) {
                            go = false;
                            break;
                        }
                    }
                    if (go) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
