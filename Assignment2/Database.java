import java.util.Arrays;
public class Database
{
  final int[] data;

  public Database(int[] data) {
    this.data = data;
  }

  public int[] quickSort() {
      return Utility.quickSort(data);
  }

  public int[] bubbleSort() {
    // Bubble sort happens
    Arrays.sort(data);
    return data;
  }

  public int min() {
      int min = data[0];
      for (int i = 0; i < data.length; i++) {
          if (data[i] < min) min = data[i];
      }
      return min;
  }

  public double average() {
      int sum = 0;
      for (int i = 0; i < data.length; i++) {
          sum += data[i];
      }
      return ((double) sum) / ((double) data.length);
  }

  public int max() {
      int max = data[0];
      for (int i = 0; i < data.length; i++) {
          if (data[i] > max) max = data[i];
      }
      return max;
  }

  public int indexOf(int key) {
    //Ensure its sorted
    int mid = 0;
    int low = 0;
    int high = data.length - 1;
    while (high >= low)
    {
        mid = (high + low) / 2;
        if (data[mid] < key) {
            low = mid + 1;
        }
        else if (data[mid] > key) {
            high = mid - 1;
        }
        else {
            return mid;
        }
    }
    return -1;
  }
}