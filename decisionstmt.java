public class decisionstmt {
    public static void main(String[] args) {
        int num=0;
        int alpha=0;
        int spl=0;
        String s="jennie148@gmail.com";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90||s.charAt(i)>=97 && s.charAt(i)<=122){
                alpha++;
            }
            else if (s.charAt(i)>=48 && s.charAt(i)<=57){
                num++;

            }
            else{
                spl++;

            }

        }
        System.out.println("no of alphabet:"+alpha);
        System.out.println("no of number:"+num);
        System.out.println("no of spl chracter:"+spl);
        
    }
    
}
