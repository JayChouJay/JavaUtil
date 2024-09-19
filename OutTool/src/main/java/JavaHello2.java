public class JavaHello2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 11;
        ko:
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int b = arr[j];
                if (a + b == target) {
                    System.out.println(i + "--" + j);
                    break ko;
                }
            }
        }
    }
}