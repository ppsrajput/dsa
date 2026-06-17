public class SubArrayQuestionOptimized {
    public static void main(String[] args) {
        /*
        * Given an array of N integers, return the length of smallest sub array
        * which contains both max and min elements of the array
        * */

        // Brute Force Approach
        int[] array=new int[]{111,2,1,3,4,4,5,5,3,4,51,-90,-6000};
       // int[] array=new int[]{1,2,3};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxIndex=-1;
        int minIndex=-1;

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
//        System.out.println(min);


        int smallestLength=array.length;

        for(int i=0;i<array.length;i++){
            if(array[i]==max){
                maxIndex=i;
                if (minIndex != -1) {

                    int length = maxIndex - minIndex + 1;
                    if (smallestLength> length) {
                        smallestLength= length;
                    }

                }


            }
            if(array[i]==min){
                minIndex=i;
                if (maxIndex != -1) {

                    int length = minIndex - maxIndex + 1;
                    if (smallestLength> length) {
                        smallestLength=length;
                    }

                }
            }
        }
        System.out.println(smallestLength);



    }
}
