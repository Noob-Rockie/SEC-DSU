public class SwapFirstLast {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 1, 2, 0, 3, 2, 2, 3, 0, 1, 1, 2, 1, 0};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
