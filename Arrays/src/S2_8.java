import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 100 92 92 84 84
 * 1   2  2  4  5
 *
 * 100 100 100 92 92
 *  1   1   1  4  4
 */
public class S2_8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        List<Integer> arr = new ArrayList<>();;

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        arr
            .forEach(i -> {
                int cnt = 1;
                cnt += arr.stream()
                        .filter(j -> (i < j))
                        .count();
                sb.append(cnt).append(" ");
            });

        System.out.println(sb);

//        System.out.println(
//                arr
//                    .stream()
//                    .map(i -> {
//                        int cnt = 1;
//                        cnt += arr.stream()
//                                .filter(j -> (i < j))
//                                .count();
//                        return cnt;
//                    })
//                    .collect(Collectors.toList()));
    }
}
