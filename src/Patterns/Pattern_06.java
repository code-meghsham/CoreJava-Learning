package Patterns;

public class Pattern_06 {
    public static void main(String[] args) {
        int n=5;

        for (int i=1; i<=n;i++) {
            for (int j=0; j<=n;j++){
                if(j<=n-i) {
                    System.out.print(" \t");
                }else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
