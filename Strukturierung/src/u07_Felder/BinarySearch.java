package u07_Felder;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 12, 17, 23, 24, 31, 32, 36, 37, 42, 47, 53, 55, 64, 75, 89, 91, 91, 93, 96 };
        System.out.println("Found at index: " + binarySearch(a, 91));
    }


    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;// '>>> 1' ist wie '/2', nur umgehe ich so einen fehler bei sehr großen Zahlen.
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }
}
