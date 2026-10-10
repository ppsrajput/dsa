package OneDArray;

public class ContainerWithMostWater {
    public static void main(String[] args) {

        int answer=0;

        int[] height={1,8,3,7};
        int max=Integer.MIN_VALUE;



        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){


                int min = Integer.min(height[i], height[j]);
                int water = min* (j-i);
                if(answer<water){
                    answer=water;
                }
            }
        }
        System.out.println(answer);

    }
}
