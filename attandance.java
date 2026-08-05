import java.util.*;
class attandance{
    public static void main(String s[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[]=new int[10];
        System.out.println("Enter the attandance of the student:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}