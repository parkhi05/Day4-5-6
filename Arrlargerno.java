
package arrlargerno;


public class Arrlargerno {

    public static void main(String[] args) {
        int n[] = {12,15,2,6,76,18};
        int max=n[0];
        for(int i = 1;i< n.length-1;i++)
        {
          if(n[i]>max)  
              max=n[i];
        }
        System.out.println(max);
    }
    
}
