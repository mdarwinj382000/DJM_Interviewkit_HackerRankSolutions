package labs.djm.hackerrank.Warm_up;

public class RepeatedString {
    //string => "abc" => infinite repeatation => max string is 100 size
    //among them within n characters range => count of 'a' present
    // maximum range asked is 10^12 characters range
    public static int countMatches(String text, String str)
    {
        if (text.isEmpty() || str.isEmpty()) {
            return 0;
        }

        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String s="aba";
        long n=10;
        long size=s.length();
        long temp=n / size;
        long matches=countMatches(s,"a");
        long count= matches * temp;
        if(n!=(temp*size)){
            for(int i=0;i<(n-(temp*size));i++){
                if(s.charAt(i)=='a'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
