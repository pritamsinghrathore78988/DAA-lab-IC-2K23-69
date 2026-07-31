class PartB{
    public static void main(String[] args) {
        String[] tasks = {"Task1", "Task2", "Task3", "Task4", "Task5"};
        // Stack (LIFO)
        System.out.println("Stack Order:");
        for (int i = tasks.length - 1; i >= 0; i--) {
            System.out.println(tasks[i]);
        }
        // Queue (FIFO)
        System.out.println("\nQueue Order:");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);
        }
        // Printer (FIFO)
        System.out.println("\nPrinter Order:");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);
        }
    }
}