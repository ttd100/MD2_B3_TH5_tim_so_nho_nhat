public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 8};
        System.out.println("Minimum number of array is: " + findMinimal(array));
    }

    public static int findMinimal(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}