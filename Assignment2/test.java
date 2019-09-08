import java.util.Arrays;

class Utility 
{

    public static int[] quickSort(int[] arr) 
    {
        // Prevents Side effects by copying the arr other than just sorting the array passed in

        int[] sortedArray = Arrays.copyOf(arr, arr.length);

        _quickSort(sortedArray, 0, arr.length - 1);

        return sortedArray;
    }

    static void _quickSort(int[] arr, int l, int h) 
    {
        if (l < h) 
        {
            // Set pivot
            int pivot = arr[(h + l) / 2];

            int i = l;
            // iterate through low to high
            for (int j = l; j < h; j++) 
            {
                // If current value is less than pivot value
                if (arr[j] < pivot) 
                {
                    // Swap the value in the low array with the current value
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    // increment the index of array of lower values
                    i++;
                }
            }

            // Swap the pivot point to the rightful place
            int temp = arr[i];
            arr[i] = arr[(h + l) / 2];
            arr[(h + l) / 2] = temp;

            // Recursively call with both halves
            _quickSort(arr, l, i - 1);
            _quickSort(arr, i + 1, h);
        }
    }
}