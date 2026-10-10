package OneDArray;

public class ContainerWithMostWaterOptimized {
    public static void main(String[] args) {


        int[] height={1,8,6,2,5,4,8,3,7};

        int answer=0;

        int left=0;
        int right= height.length-1;

        while (left<right){

            int min = Integer.min(height[left], height[right]);
            int water=min*(right-left);

            answer=Integer.max(answer,water);

            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }


    }
}
