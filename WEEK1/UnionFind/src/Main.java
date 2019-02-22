

public class Main {

    public static void main(String[] args) {
//       QuickFind qf = new QuickFind(10);
//       qf.printArray();
//       qf.union(1,7);
//       qf.printArray();
        QuickUnion qu = new QuickUnion(10);
        qu.printArray();
        qu.union(1,7);
        qu.printArray();
        qu.union(2,4);
        qu.printArray();
        qu.union(3,4);
        qu.printArray();
        qu.union(4,9);
        qu.printArray();

    }
}
