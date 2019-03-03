import java.util.Arrays;
class SelectionSort
{
    void sort(int intArray[])
    {
       // print Array;
        System.out.println("Example Array:"+ "\n" + "Selection Sort" );
        System.out.println(Arrays.toString(intArray));
        //surfing between the array
        for (int i=0; i<intArray.length-1; i++) {
            int Min = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[Min])
                    Min = j;
                //swaping min number on the array
                int temp = intArray[Min];
                intArray[Min] = intArray[i];
                intArray[i] = temp;
            }
        }
    }

    // Prints the array
    private void printArray(int intArray[])
    {
        int n = intArray.length;
        for (int i=0; i<n; ++i)
            //System.out.print(Arrays.toString(intArray));
            System.out.print(intArray[i]+ " ");
            System.out.println();
    }

    public static void main (String[] args)
    {
        int[] intArray = new int[]{8,0,25,12,22,11,5};
        SelectionSort ob = new SelectionSort();
        ob.sort(intArray);
        System.out.println("Sorted Array");
        ob.printArray(intArray);
    }
}