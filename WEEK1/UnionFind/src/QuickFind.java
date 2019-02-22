// quick find method -- union is too slow (N^2)

/*

Quadratic algorithms do not scale with technology!!!
As the memory and processing power gets bigger and faster the quadratic algorithm
takes even longer because of the more commands to process

 */

public class QuickFind {
    int[] nums;
    int leng;

    QuickFind(int N) {
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
        QuickFind qf = new QuickFind(10);
        qf.printArray();
        qf.union(1, 7);
        qf.printArray();

    }




}

