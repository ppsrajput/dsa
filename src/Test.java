public class Test {
    public static void main(String[] args) {

        int[] array=new int[]{1,2,3,4};

        int total=0;
        for(int i=0;i<array.length;i++){

            int allPossibleStaringIndices = i + 1;
            int allPossibleEndingIndices = array.length - i;
            int contributionOfIInAllSubArrays = allPossibleStaringIndices * allPossibleEndingIndices;
            total=total+(contributionOfIInAllSubArrays * array[i]);

        }
        System.out.println(total);


    }
}
