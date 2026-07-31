class PartD{
    public static void main(String[] args) {

        // 1. Loop from 1 to 5
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            count++;
        }
        System.out.println("Loop runs: " + count + " times");

        // 2. Loop from 1 to n (n = 20)
        int n = 20;
        count = 0;
        for (int i = 1; i <= n; i++) {
            count++;
        }
        System.out.println("Loop runs when n = 20: " + count + " times");

        // 3. Nested loops from 1 to 5
        count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("Inner PRINT runs: " + count + " times");

        // 4. Nested loops from 1 to n (n = 10)
        n = 10;
        count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                count++;
            }
        }
        System.out.println("PRINT runs when n = 10: " + count + " times");
    }
}