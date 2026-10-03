
class TwoPointers
{
    public static void main(String[] args)
    {
        int a[]= {10, 20, 30, 40};
        int target = 70;
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == target) {
                System.out.println("Pair: " + a[left] + ", " + a[right]);
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
