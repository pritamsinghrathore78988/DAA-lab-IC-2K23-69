/*
Part 1. Trace It Yourself
Given list: 8, 3, 15, 6, 2
1) Find the largest number by checking one number at a time.
   Write down how many comparisons you made.
2) Sort this list from smallest to largest using any method you like.
   Write down the steps you followed.
*/

class PartA{
    public static void main(String[] args) {
        int arr[] = {8, 3, 15, 6, 2};
        PartA obj = new PartA();
        obj.largest(arr);
        int arr2[] = {8, 3, 15, 6, 2};
        obj.sortarr(arr2);
    }
    void largest(int arr[]) {
        int largest = arr[0];
        int cmp = 0;
        for (int i = 1; i < arr.length; i++) {
            cmp++;
            System.out.println("Compare " + largest + " and " + arr[i]);
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("\nLargest Number = " + largest);
        System.out.println("Comparisons Made = " + cmp);
    }

    void sortarr(int arr[]) {
        System.out.println("\nSorting Steps:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("Pass " + (i + 1) + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.print("\nSorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}