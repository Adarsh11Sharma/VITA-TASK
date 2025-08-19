import java.util.*;

public class MergeArray{

    public static void mergeArrays(int arr1[], int arr2[]) {
    int arr3[] = new int[arr1.length + arr2.length];
    int i = 0, j = 0;
    
    for (int k = 0; k < arr3.length; k++) {
        if (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
        } else if (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
        } else {
            arr3[k] = arr2[j];
            j++;
        }
    }
    
    for (int a : arr3) {
        System.out.print(a + " ");
    }
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];

       

        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
         int m=sc.nextInt();
         int arr2[]=new int[m];
         for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }


        mergeArrays(arr1, arr2);
    }
}