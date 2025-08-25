import java.util.*;

public class HollowButterfly {
    public static void main(String[] args) {
        int n=4;
        //upper half
        for( int i=1;i<=n;i++){
            //first part
            for( int j=1;j<=i;j++){
             
                //stars
                if(j==1||j==i){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //spaces in the middle
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
            }
            //second part
            for( int j=1;j<=i;j++){
                //star
                if(j==1||j==i){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // lower half
        for( int i=n;i>=1;i--){
            //first part
            for( int j=1;j<=i;j++){
                //stars
                if(j==1||j==i){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //spaces in the middle
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
            }

            //second part
            for( int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    
            }
            System.out.println();
        }
        } 
}
