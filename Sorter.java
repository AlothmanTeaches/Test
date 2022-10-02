import java.util.Arrays;

public class Sorter{
<<<<<<< HEAD
    public static void stringSorter(String[] array){
        System.out.println("test");
        for(int i= 0;i<array.length ;i++);
=======
    public static void stringSorter(String[] arr){
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].compareTo( arr[min_idx]) < 0)
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
>>>>>>> createSorter
    }

    public static void main(String[] args) {
        String [] arr = {"B","A","D","C"};

        stringSorter(arr);
        System.out.println(Arrays.toString(arr));
    }

}