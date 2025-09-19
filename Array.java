public class Array {

    public static void main(String[] args)

    {
        int[] Array = new int[100]; // Define array with size 100.
        {
            for (int i = 0; i < Array.length; i++) {
                Array[i] = (i + 1); // Fill array.
            }
        }
        for (int x = 0; x < Array.length; x++) { // Repeats array contents.

            if (Array[x] % 2 == 0) { // Determines whether even or odd.
                System.out.println(Array[x] + " is an even number.");
            } else {
                System.out.println(Array[x] + " is an odd number.");
            }

        }
    }
}
