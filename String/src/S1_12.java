import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S1_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        ArrayList<String> strArr = new ArrayList<>();

        int lengthCount = 0;
        for (int i = 0; i < input.length(); i++) {
            lengthCount++;
            sb.append(input.charAt(i));
            if (lengthCount == 7) {
                strArr.add(sb.toString());
                sb.delete(0, sb.length());
                lengthCount = 0;
            }
        }

        for (String s : strArr) {
            StringBuilder encryptStr = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '#') {
                    encryptStr.append(1);
                } else {
                    encryptStr.append(0);
                }
            }

            int decryptNumber = Integer.parseInt(encryptStr.toString(), 2);
            char decryptChar = (char) decryptNumber;
            sb.append(decryptChar);
        }

        System.out.println(sb);
    }
}
