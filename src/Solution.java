
public class Solution {
    public static int balancedStringSplit(String s) {
        int count=0;
        int CR=0;
        int CL=0;
        for(int i =0 ; i<s.length();i++){
            
            if(s.charAt(i)=='R'){
                CR++;
            }else{
                CL++;
            }
            if(CR==CL){
                count++;
                CL=0;
                CR=0;
            }
            
        }
        
        return count;
        
    }

    
    public static void main(String[] args) {
        String s= "RLLLLRRRLR";    
        int res=balancedStringSplit(s);
        System.out.println(res);
        
        
    }
    
}
