import java.util.Scanner;

class  RightAngleTriangle{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = s.nextInt();
        
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");           
            }
            System.out.println("");

            
        }
    }

}

class Box {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = s.nextInt();
        
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j <row; j++) {
                System.out.print("*");           
            }
            System.out.println("");

            
        }
    }

}
// class RightAngleTriangleOtherSide {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int row = s.nextInt();
        
//         for (int i =0 ; i <= row; i++) {    
//             if (i<row) {
//                 for
                
//             }                     
           

            
//         }
//     }

// }

class SpaceBox{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
         
        int n = s.nextInt();
        for(int i=1; i<=n; i++){

            if (i==1 || i==n) {
                for(int j =0;j<n; j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
            else{
                for(int j =1;j<=n;j++){
                    if (j==1 || j==n) {
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                    //System.out.println("");
                }
              System.out.println("");
            }   
            }
        }

    }



