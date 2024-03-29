

public class Jumpsearch {

    public static void main(String[] args) {
          int arr[]= { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
          int x=55;
          int location =jumpsearch(arr,x);
        System.out.println("number"+x+"index"+arr);
    }
    public static int jumpsearch(int[] arr, int x) {
        int n =arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;
        while (arr[Math.min(step, n)-1] < x)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < x)
        {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }

        // If element is found
        if (arr[prev] == x)
            return prev;

        return -1;
    }

    }