class UniqueArray {
    
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 2, 3, 3, 4, 5, 5, 6};
        int sum = 0;
        int prev = Integer.MIN_VALUE;

        for (int value : a) {
            if (value != prev) {
                sum += value;
                prev = value;
            }
            System.out.println(value);
        }

        System.out.println(sum);
    }
}