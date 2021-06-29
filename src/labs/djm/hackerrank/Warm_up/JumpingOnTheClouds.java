package labs.djm.hackerrank.Warm_up;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        //skip the thunderclouds(1)
        //0-0-0 / 0-1-0 => 1 jump , 0-0-1-0 / 0-0-0-0 =>has 2 jumps
        //can jump on normalclouds(0) => highest jump is 1 or 2
        List<Integer> clouds= Arrays.asList(0,0,0,1,0,0);
        int i=0,count=clouds.size();
        int jumps=0;
        while(i<count-2){
            if((clouds.get(i+1)==0&&clouds.get(i+2)==0)||(clouds.get(i+1)==1&&clouds.get(i+2)==0)){
                i+=2;
                jumps++;
            }else{
                i++;
                jumps++;
            }
        }
        if(i<count-1)
            if(clouds.get(i+1)==0)
                jumps++;
        System.out.println(jumps);
    }
}
