class SortingMethod {
    public static void main(String[] args) {
        int[] a = {20, 10, 30, 15, 20,5,6,9,100};

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {            // change in if condition for increasing order(a[i]>a[j])
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}