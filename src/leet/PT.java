package leet;

import java.util.ArrayList;
import java.util.List;

public class PT {
    public static void main(String[] args) {


        List<List<Integer>> nums=new ArrayList<>(5);



        int rows=5;
        List<Integer> previousChild=null;
        for(int i=1;i<=rows;i++){
            List<Integer> child=new ArrayList<>();

            if(i==1){
                child.add(1);
                nums.add(child);
            }
            else{
                for(int j=0;j<=previousChild.size();j++){
                    if(j==0 || j==previousChild.size() ){
                        child.add(1);
                    }else{
                        child.add(previousChild.get(j-1)+previousChild.get(j));
                    }
                }
                nums.add(child);

            }
             previousChild=new ArrayList<>(child);
        }
        System.out.println(nums);
    }
}
