public class UF {
    int[] nums;
    int leng;

    UF(int N) {
        nums = new int[N];
        leng = N;
        fillArray();

    }

    void printArray() {
        for (int i : nums) {
            System.out.print(" | " + i + " | ");
        }
        System.out.println("\n");
    }

    void fillArray() {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
    }

    boolean connected(int p, int q) {
        return nums[p] == nums[q];

    }

    void union(int p, int q) {
        int pNum = nums[p];
        int qNum = nums[q];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == pNum) nums[i] = qNum;

        }

    }

    public static void main(String[] args) {
        System.out.println("hello");
        UF u = new UF(8);

    }


}
