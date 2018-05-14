
package twodarr;


public class TwoDarr {

    
    public static void main(String[] args) {
       int n[][]= {{1,2,3},{4,5,6}};
     
       for(int i=0;i<=n.length-1;i++)
       {
           for(int j=0;j<=n[0].length-1;j++)
           {
            System.out.print(n[i][j]);
           }
           System.out.println("");
       }
    }
    
}
