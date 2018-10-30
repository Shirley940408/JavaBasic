public class Array{
    public static void main(String[] args){
        // int[] a=new int[2];
        // a=new int[2];
        // a[0]=10;
        // a[1]=20;
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // byte[] b={1,2,3};
        // byte[] a=b;//bring the address of b to a;
        // a[0]=10;        
        // System.out.println(b);
        int[] a={1,2,3};
        int[] b=new int [a.length*2];
        System.arraycopy(a,0,b,0,a.length);
        a=b;
        print(a);
        if(null==""){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void  print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}