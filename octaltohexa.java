public class octaltohexa {
    static int getDecimal(int octal){  
        int decimal = 0;  
        int n = 0;  
        while(true){  
          if(octal == 0){  
            break;  
          } else {  
              int temp = octal%10;  
              decimal += temp*Math.pow(8, n);  
              octal = octal/10;  
              n++;  
           }  
        }  
        return decimal;  
    }
    static String tohexa(int decimal){    
        int rem;  
        String hex="";   
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
       while(decimal>0)  
        {  
          rem=decimal%16;   
          hex=hexchars[rem]+hex;   
          decimal=decimal/16;  
        }  
       return hex;  
    }  
    public static void main(String[]args){
        int Oct = getDecimal(567);
        System.out.println(tohexa(Oct));
    }
}
