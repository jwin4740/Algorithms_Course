// quick find method -- union is too slow (N^2)

/*

Quadratic algorithms do not scale with technology!!!
As the memory and processing power gets bigger and faster the quadratic algorithm
takes even longer because of the more commands to process

 */

public class QuickUnion {
    int[] nums;
    int leng;

    QuickUnion(int N) {
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

    private int root(int i) {
        while (i != nums[i]) i = nums[i];
        return i;
    }

    boolean connected(int p, int q) {
        return root(p) == root(q);

    }

    void union(int p, int q) {
        int pNum = root(p);
        int qNum = root(q);
        nums[pNum] = qNum;

    }
    public static void main(String[] args) {
        System.out.println("hello");
        QuickUnion qu = new QuickUnion(10);
        qu.printArray();
        qu.union(1, 7);
        qu.printArray();

    }

}

