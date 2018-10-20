public class For{
    public static void main(String[] args){
        // int num=0;
        // for (int i=0; i<10;i++){
        //     //num=i;
        //     // System.out.println(num);
        //     for (int j=0; j<10;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();//println()equals to input an enter after output each time.
        // }
        // for (int i=1; i<=100;i+=2){
        //     num+=i;
        // }
        // System.out.println(num);
        // for(int i=1;i<=9;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i*j+" ");
        //     }
        //     System.out.println();
        // }
        /**
         * 
      output the symbol:

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
         */
        for(int i=1;i<=9;i++){
            int row=Math.abs(i-5);           
            for(int j=1; j<=row;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=5-row;k++){
                System.out.print("* ");
            }
                System.out.println();
        }
    }
}
/*
for loop variability scope
*/