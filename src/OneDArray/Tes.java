package OneDArray;

public class Tes {
    public static void main(String[] args) {
        String str="agafsdggsdsajglgafdsaggaag";
        int answer=0;
        int aCount=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='a') {
                aCount++;
            }
            if(str.charAt(i)=='g'){
                answer=answer+aCount;
            }
        }
        System.out.println(answer);
        Thread.currentThread().getPriority();
    }
}
