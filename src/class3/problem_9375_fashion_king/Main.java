package class3.problem_9375_fashion_king;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseNumber = Integer.parseInt(br.readLine());

        while((testCaseNumber--) > 0) {
            int numOfItems = Integer.parseInt(br.readLine());

            ArrayList<String> eachItemKeys = new ArrayList<>();
            ArrayList<Integer> eachItemNumber = new ArrayList<>();

            for(int i=0; i<numOfItems; i++){
                String key = br.readLine().split(" ")[1];
                if(eachItemKeys.contains(key)){
                    int index = eachItemKeys.indexOf(key);
                    eachItemNumber.set(index, eachItemNumber.get(index)+1);
                } else {
                    eachItemKeys.add(key);
                    eachItemNumber.add(1);
                }
            }


            int result = 1;
            for(int num:eachItemNumber) {
                result *= num + 1;
            }
            result -= 1;

            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}