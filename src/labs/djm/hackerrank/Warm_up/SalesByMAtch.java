package labs.djm.hackerrank.Warm_up;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int size=0;
        while (ar.size()!=0) {
            int temp=ar.remove(0),post;
            if((post=ar.indexOf(temp))!=-1){
                size++;
                ar.remove(post);
            }
        }
        return size;
    }

}

class SalesByMAtch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine()
                                               .trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine()
                                                   .replaceAll("\\s+$", "")
                                                   .split(" "))
                                 .map(Integer::parseInt)
                                 .collect(toList());

        int result = Result.sockMerchant(n, ar);
        System.out.println(result);
     //   bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

        bufferedReader.close();
      //  bufferedWriter.close();
    }
}