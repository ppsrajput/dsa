package OneDArray;

public class RainWaterTrapped {
    public static void main(String[] args) {
        int[] array={2,1,3,2,1,2,4,3,2,1,3,1};

        int answer=0;
        for(int i=0;i< array.length;i++){
            int leftMax=Integer.MIN_VALUE;
            int rightMax=Integer.MIN_VALUE;
            int level;

            for(int j=i-1;j>=0;j--){
                if(leftMax<array[j]){
                    leftMax=array[j];
                }
            }
            for(int k=i+1;k< array.length;k++){
                if(rightMax<array[k]){
                    rightMax=array[k];
                }
            }
            level = Math.min(leftMax, rightMax);

            if (array[i]<level) {
                answer+=level-array[i];
            }
        }
        System.out.println(answer);


    }
}
