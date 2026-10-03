class Starprint {
    public static void main(String args[]) {
        int n = 7;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 1 || i == 2 && j == 4
                        || i == 3 && j == 3
                        || i == 4 && j == 2
                        || i == 1 && j == 1) {
                    System.out.println("*");
                }
            }
        }

        System.out.println();
    }
}