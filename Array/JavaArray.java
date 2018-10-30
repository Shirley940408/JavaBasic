import java.util.Scanner;
public class JavaArray{
    public static void main(String[] args){
        int[] data={1,3,6,2,5,9,8,10,4,7};
        // int[] ascend={10,20,30,40,50,60,70,80,90,100};
        int[] ascend={1,2,2,3,4,5};
        int[] arr=bubblingUp(data);
        //int[] arr=InsertionSort(data);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // System.out.println("Please input a number between 10,20,30,40,50,60,70,80,90,100");
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        int num=2;
        System.out.println(binarySearch(ascend,num));          
    }
    public static int[] bubblingUp(int[] arr){
        int temp;
        for(int i=1; i<arr.length; i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
    public static int[] InsertionSort(int[] arr){
        int temp;
        //int index=-1;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            for(int j=i-1;j>=0&&temp<arr[j];j--){
                arr[j+1]=arr[j];
                arr[j]=temp;
            }       
        }
        return arr;
    }
    public static int binarySearch(int[] arr, int n){
        int left,right;
        left=0;
        right=arr.length-1;
        int mid=(left+right)/2;
        while(left<=right){
            if(n==arr[mid]){
                return mid;
            }
            if(n<arr[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
            mid=(left+right)/2;
        }
        return -1;
    }
}