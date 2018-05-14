
package arrayassign;
import java.util.*;


public class ArrayAssign {

    
    public static void main(String[] args) {
        String record[]={"A,12,3100","B,13,2000","C,14,3000"};
        int i;
        int sum=0;
        for(i=0;i<=record.length-1;i++)
        {
           // System.out.println(record[i]);
            String a[]=record[i].split(",");
            //System.out.println(a[i]);
            int n= Integer.parseInt(a[2]);
            
            sum=sum+n; 
        }
        System.out.println(sum);
        
    }
    
}
