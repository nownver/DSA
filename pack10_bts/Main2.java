import code.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("-- demo --");
        System.out.println();
        System.out.println("-- demo1 --");
        demo1();
        System.out.println();
    }

    public static void demo1() {
        int[] data = { 2, 1, 3, 4, 5, 6, 7, 8, 9 };
        BST_651617 bst = new BST_651617();
        for (int j = 0; j < data.length; j++)
            bst.insert(data[j]);
        bst.printInOrder();
        System.out.println("Tree height = " + bst.height());
        int[] dat = { 15, 20, 10, 18, 16, 12, 8, 25, 19, 30 };
        bst = new BST_651617();
        for (int j = 0; j < dat.length; j++)
            bst.insert(dat[j]);
        bst.printInOrder();
        System.out.println("Tree height = " + bst.height());

        System.out.println();
        System.out.println("-- demo2 --");
        demo2(bst);
    }

    public static void demo2(BST_651617 bst) {
        System.out.println("node with max value " +
        bst.findMaxFrom(bst.getRoot()));

        System.out.println();
        System.out.println("-- demo3 --");
        demo3(bst);
    }

    public static void demo3(BST_651617 bst) {
        bst.delete(12, bst.getRoot());
        System.out.println(bst.search(20)); // 18<-20->25
        System.out.println(bst.search(25)); // null<-25->30
        System.out.println(bst.search(16)); // null<-16->null
        System.out.println(bst.search(10)); // 8<-10->null
        System.out.println(bst.search(12)); // not found
    }
}