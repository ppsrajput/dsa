package OneDArray;

public class ContainerWithMostWaterOptimized {
    public static void main(String[] args) {


        int[] height={1,8,6,2,5,4,8,3,7};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        int maxIndex=0;
        int secondMaxIndex=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
                maxIndex=i;
            }
        }
        System.out.println(max);

        for(int i=0;i<height.length;i++){
            if((i!=maxIndex)&& height[i]>secondMax && height[i]<=max){
                secondMax=height[i];
                secondMaxIndex=i;

            }
        }


        int level=Math.min(max,secondMax);
        int answer = level * (Math.abs(maxIndex - secondMaxIndex));
        System.out.println(answer);



    }
}
