
package arruserinput;
import java.util.*;


public class ArrUserinput {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n[] = new int[5];
        for(int i=0;i<=n.length-1;i++)
        {
            System.out.println("Enter the elements :");
            n[i]=sc.nextInt();
        }
            System.out.println("Elements you entered are :");
            for(int i = 0;i<=n.length-1;i++)
            {
                System.out.println(n[i]);
            }
            
    }
    
}
