public class NewClass
{
    public static int getLargest(int[] arr. int sz)
    {

        int iterate1 = 0;
        int iterate2 = 0;
        int largest = 0;
        // the outer loop here will run n times, which here is sz - 1 times.
        while (iterate1 < sz - 1) {
            iterate2++;
            /* the inner loop iterates for each element in the array.
            So for the nested loop, for each element of iterate1,
            iterate2 compares it with the other elements in the
            array.
             */
            if (iterate2 == sz) {
                iterate1++;
                iterate2 = iterate1;
                continue;
            }
            // So we can say this inner loop is (n-1)/2
            int product = arr[iterate1] * arr[iterate2];
            if (product > largest) {
                largest = product;
            }
        }
        return largest;
    }
}

// That is why the big O notation would be n * (n-1)/2, or 0(n^2)