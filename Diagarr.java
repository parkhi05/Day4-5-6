
package diagarr;


public class Diagarr {

    public static void main(String[] args) {
        float diag=0;
        double n[][] = {
                    {1.1,2.1,3.1},
                    {4.1,5.1,6.1},
                    {7.1,8.1,9.1},
    };
        //System.out.println(n[1][2]);
        diag+=n[0][0]+n[1][1]+n[2][2];
        System.out.println(diag);
        
    }
    
}
