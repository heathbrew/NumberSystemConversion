public class bintohexa {
static int getDecimal(int binary){  
        int decimal = 0;  
        int n = 0;  
        while(true){  
          if(binary == 0){  
            break;  
          } else {  
              int temp = binary%10;  
              decimal += temp*Math.pow(2, n);  
              binary = binary/10;  
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
public static void main(String[] args){
        int Dec = getDecimal(10010); 
        System.out.println(tohexa(Dec));
    }

}
