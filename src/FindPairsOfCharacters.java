public class FindPairsOfCharacters {
    public static void main(String[] args) {
        int count=find( "sdagadfgdfaggad",true);
        System.out.println("Total AG Pairs are "+count);
    }
    static int find(String string , boolean optimized){
        int count=0;
        char[] charArray = string.toCharArray();
        if(!optimized){

            for(int i=0;i<=charArray.length-1;i++){
                if(charArray[i]=='a'){
                    for(int j=i+1;j<charArray.length-1;j++){
                        if(charArray[j]=='g'){
                            count++;
                        }
                    }
                }
            }
        }else{

            int aCount=0;
            for(int i=0;i<charArray.length-1;i++){
                if(charArray[i]=='a'){
                    aCount++;
                }
                else if(charArray[i]=='g'){
                    count=count+aCount;
                }
            }


        }
        return count;
    }
}
