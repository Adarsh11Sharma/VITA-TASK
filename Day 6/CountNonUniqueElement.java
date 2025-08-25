import java.util.*;


public class CountNonUniqueElement{

    public static  void CountNonUniqueElement(int arr[]){
       Arrays.sort(arr);
       int n=arr.length;
       boolean[] isDuplicate=new boolean[n];
       int NonUniqueElement=0;
       for (int i = 0; i < arr.length; i++) {
           if(isDuplicate[i]){
            continue;
           }
           boolean foundDuplicate=false;
           for (int j = i+1; j < n; j++) {
            if(arr[i]==arr[j]){
                foundDuplicate=true;
                isDuplicate[j]=true;
            }
               
           }

           if (foundDuplicate){
            NonUniqueElement++;
            isDuplicate[i]=true;
           }

           
       }

       System.out.println(NonUniqueElement);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }

        CountNonUniqueElement(arr);
    }
}