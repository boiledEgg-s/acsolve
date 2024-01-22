package class3.problem_11659_section_sum4;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputStr = br.readLine().split(" ");
        int n = Integer.parseInt(inputStr[0]);
        int m = Integer.parseInt(inputStr[1]);

        inputStr = br.readLine().split(" ");

        int[] sum = new int[n+1];
        for(int i=1; i<=n; i++){
            sum[i] = sum[i-1] + Integer.parseInt(inputStr[i-1]);
        }

        while((m--) > 0) {
            inputStr = br.readLine().split(" ");
            int minRange = Integer.parseInt(inputStr[0]);
            int maxRange = Integer.parseInt(inputStr[1]);

            int result = sum[maxRange] - sum[minRange-1];

            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
