public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 6, 1, 2, 3, 4, 8, 10, 1, 2, 3, 11};

        int maxSize = 1;
        int curSize = 1;
        int maxEnd = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                curSize++;

                if (curSize > maxSize) {
                    maxSize = curSize;
                    maxEnd = i;
                }
            } else {
                curSize = 1;
            }
        }

        for(int i = maxEnd - maxSize + 1; i < maxEnd + 1; i++)
            System.out.print(arr[i] + " ");
    }
}