import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 6:45
public class 장난꾸러기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /**
         * 1000MS -> 10^8
         *
         * [Task Case]
         * 120 130 140 150 160
         *
         */

        int n = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>(n);
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        // 줄이 키 순서대로 올바르게 된 리스트
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.sort(Comparator.naturalOrder());

        for (int i = 0; i < list.size(); i++) {
            if (!Objects.equals(list.get(i), sortedList.get(i))) {
                System.out.print(i+1);
                System.out.print(" ");
            }
        }
    }
}
