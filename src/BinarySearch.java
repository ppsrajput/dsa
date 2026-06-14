public class BinarySearch {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5};

        int start=0;
        int end=array.length-1;
        int target=4;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(array[mid]==target){
                System.out.println("answer is index "+mid);
                break;
            }
            if(target<array[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
    }
}
