import java.util.*;

public class Array1DOperations {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<>();

    // Display array
    static void display() {
        System.out.println("Array: " + list);
    }

    // Insert value
    static void insert(int index, int value) {
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index!");
            return;
        }

        list.add(index, value);
        System.out.println("Value inserted successfully.");
        display();
    }

    // Delete value
    static void delete(int index) {
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index!");
            return;
        }

        int removed = list.remove(index);
        System.out.println("Deleted value: " + removed);
        display();
    }

    // Linear search
    static void search(int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                System.out.println("Value found at index: " + i);
                return;
            }
        }

        System.out.println("Value not found.");
    }

    // Left rotation
    static void rotateLeft(int k) {
        if (list.isEmpty()) {
            System.out.println("Array is empty.");
            return;
        }

        k = k % list.size();

        for (int i = 0; i < k; i++) {
            int first = list.remove(0);
            list.add(first);
        }

        System.out.println("Array after left rotation:");
        display();
    }

    // Right rotation
    static void rotateRight(int k) {
        if (list.isEmpty()) {
            System.out.println("Array is empty.");
            return;
        }

        k = k % list.size();

        for (int i = 0; i < k; i++) {
            int last = list.remove(list.size() - 1);
            list.add(0, last);
        }

        System.out.println("Array after right rotation:");
        display();
    }

    public static void main(String[] args) {

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid size.");
            return;
        }

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        display();

        while (true) {

            System.out.println("\n----- 1D ARRAY MENU -----");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Linear Search");
            System.out.println("4. Left Rotate");
            System.out.println("5. Right Rotate");
            System.out.println("6. Display");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    insert(index, value);
                    break;

                case 2:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();

                    delete(index);
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();

                    search(value);
                    break;

                case 4:
                    System.out.print("Enter k: ");
                    int k = sc.nextInt();

                    if (k < 0) {
                        System.out.println("k cannot be negative.");
                    } else {
                        rotateLeft(k);
                    }
                    break;

                case 5:
                    System.out.print("Enter k: ");
                    k = sc.nextInt();

                    if (k < 0) {
                        System.out.println("k cannot be negative.");
                    } else {
                        rotateRight(k);
                    }
                    break;

                case 6:
                    display();
                    break;

                case 7:
                    System.out.println("Program ended.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}