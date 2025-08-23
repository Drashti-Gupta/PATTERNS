import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        int n=4;
        //upper half
        for( int i=1;i<=n;i++){
            //first part
            for( int j=1;j<=i;j++){
                //stars
                System.out.print("*");
            }
            //spaces
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
            }
            //second part
            for( int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for( int i=n;i>=1;i--){
            //first part
            for( int j=1;j<=i;j++){
                //stars
                System.out.print("*");
            }
            //spaces
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
            }
            //second part
            for( int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        } 
}
