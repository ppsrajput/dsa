public class PrintAllSubArrays {
    public static void main(String[] args) {
        int[] array={2,1,5,6,4,5};


        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];

            }
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("max = "+max+" , min = "+min);

        int smallestLength=array.length;
        for(int i=0;i<array.length;i++) {

            for(int end=i;end<array.length;end++){

                int subArrayIndex=0;
                int[] subArray=new int[end-i+1];
                boolean maxExist=false;
                boolean minExist=false;
                for(int x=i;x<=end;x++){
                    subArray[subArrayIndex]=array[x];
                    subArrayIndex++;
                }

                for(int y=0;y<subArray.length;y++){
                    if(subArray[y]==max){
                        maxExist=true;
                    }else if(subArray[y]==min){
                        minExist=true;
                    }
                }
                if(maxExist && minExist){
                    if(subArray.length<smallestLength)smallestLength=subArray.length;
                }
            }
        }
        System.out.println("smallestLength"+smallestLength);
    }
}
