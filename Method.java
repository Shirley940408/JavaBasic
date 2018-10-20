public class Method{
    public static void main(String[] args){
        /**
         * print a symbol:
         *   ***
         *   ***
         */
    symbol(6);
    }
    public static void symbol(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<3;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}