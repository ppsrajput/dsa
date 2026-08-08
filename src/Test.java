public class Test {
    public static void main(String[] args) {

//        int[] array=new int[]{1,2,3,4};
//
//        int total=0;
//        for(int i=0;i<array.length;i++){
//
//            int allPossibleStaringIndices = i + 1;
//            int allPossibleEndingIndices = array.length - i;
//            int contributionOfIInAllSubArrays = allPossibleStaringIndices * allPossibleEndingIndices;
//            total=total+(contributionOfIInAllSubArrays * array[i]);
//
//        }
//        System.out.println(total);

        int[] a={10};
        test(a);
        System.out.println(a[0]);


    }
    static void test(int[] a){
        a=new int[1];
        a[0]=50;

    }
}
