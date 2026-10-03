class Solution {
    public static void main(String[] args) {
        int[] l1 = {1, 2, 3};
        int[] l2 = {1, 2, 3};

        int sum = 0;

        if (l1.length > 0 && l2.length > 0) {
            for (int i = 0; i < l1.length; i++) {
                sum += l1[i];
            }

            for (int i = 0; i < l2.length; i++) {
                sum += l2[i];
            }
        }

        System.out.println(sum);
    }
}