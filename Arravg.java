
package arravg;

public class Arravg {

    
    public static void main(String[] args) {
        int n[]={3,2,6,4,9};
        int sum=0;
        float avg=0.0f;
        for(int i =0;i<=n.length-1;i++)
        {
            System.out.println(n[i]);
        }
        for(int i =0;i<=n.length-1;i++)
        { 
            sum+=n[i];
        
     
        }
          System.out.println("sum : "+sum);
          avg=(float)sum/n.length;        //Type Casting : int/int=int
                                          //Float/int = float
          System.out.println("Averange is : "+avg);
        
    
    }
    
}
