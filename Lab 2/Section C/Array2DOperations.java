import java.util.*;

public class Array2DOperations {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

    // Display matrix
    static void display() {

        System.out.println("Matrix:");

        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }
    }

    // Insert row
    static void insertRow(int index, ArrayList<Integer> row) {

        if (index < 0 || index > matrix.size()) {
            System.out.println("Invalid row index!");
            return;
        }

        // Check column compatibility
        if (!matrix.isEmpty() && row.size() != matrix.get(0).size()) {
            System.out.println("Invalid row size!");
            return;
        }

        matrix.add(index, row);

        System.out.println("Row inserted successfully.");
        display();
    }

    // Delete row
    static void deleteRow(int index) {

        if (index < 0 || index >= matrix.size()) {
            System.out.println("Invalid row index!");
            return;
        }

        matrix.remove(index);

        System.out.println("Row deleted successfully.");
        display();
    }

    // Search
    static void search(int value) {

        for (int i = 0; i < matrix.size(); i++) {

            for (int j = 0; j < matrix.get(i).size(); j++) {

                if (matrix.get(i).get(j) == value) {

                    System.out.println(
                            "Value found at row " + i +
                            ", column " + j
                    );

                    return;
                }
            }
        }

        System.out.println("Value not found.");
    }

    // Rotate 90 degrees clockwise
    static void rotateClockwise() {

        if (matrix.isEmpty()) {
            System.out.println("Matrix is empty.");
            return;
        }

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> rotated = new ArrayList<>();

        for (int j = 0; j < cols; j++) {

            ArrayList<Integer> newRow = new ArrayList<>();

            for (int i = rows - 1; i >= 0; i--) {
                newRow.add(matrix.get(i).get(j));
            }

            rotated.add(newRow);
        }

        matrix = rotated;

        System.out.println("Matrix after 90 degree clockwise rotation:");
        display();
    }

    public static void main(String[] args) {

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows < 0 || cols <= 0) {
            System.out.println("Invalid dimensions.");
            return;
        }

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                row.add(sc.nextInt());
            }

            matrix.add(row);
        }

        display();

        while (true) {

            System.out.println("\n----- 2D ARRAY MENU -----");
            System.out.println("1. Insert Row");
            System.out.println("2. Delete Row");
            System.out.println("3. Search");
            System.out.println("4. Rotate 90° Clockwise");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter row position: ");
                    int index = sc.nextInt();

                    int columns = matrix.isEmpty()
                            ? cols
                            : matrix.get(0).size();

                    ArrayList<Integer> row = new ArrayList<>();

                    System.out.println(
                            "Enter " + columns + " elements:"
                    );

                    for (int i = 0; i < columns; i++) {
                        row.add(sc.nextInt());
                    }

                    insertRow(index, row);
                    break;

                case 2:

                    System.out.print("Enter row index: ");
                    index = sc.nextInt();

                    deleteRow(index);
                    break;

                case 3:

                    System.out.print("Enter value to search: ");
                    int value = sc.nextInt();

                    search(value);
                    break;

                case 4:

                    rotateClockwise();
                    break;

                case 5:

                    display();
                    break;

                case 6:

                    System.out.println("Program ended.");
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}