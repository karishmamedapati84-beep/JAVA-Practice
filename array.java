import java.util.*;
class array {
    public static void main(String s[]){
        int sum=0,avg=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[]=new int[10];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("The sum of the array is:"+sum);
        System.out.println("The avg of the array is:"+avg);

    }
}
