package javaCode;

/**
 * @Author: 杨世江
 * @Description: 二叉树
 * @Date: 2020/7/24 15:39
 */
public class BTree {
    public int data;
    public BTree father, leftSon, rightSon;
    public static BTree root = new BTree();

    public boolean hasleft() {
        return leftSon != null;
    }

    public boolean hasright() {
        return rightSon != null;
    }

    public void insert(int data, BTree father) {

        //插入的数据和父节点比较大小
        int compare = data - father.data;
        if (compare == 0) {
            return;
        }
        //放在右边
        if (compare > 0) {
            //判断有没有右孩子，如果有则递归下一级
            if (father.hasright()) {
                insert(data, father.rightSon);
            } else {
                //创建一个新的节点没有左孩子
                father.rightSon = new BTree();
                father.rightSon.data = data;
                father.rightSon.father = father;
            }
        }
        if (compare < 0) {
            //判断有没有左孩子，如果有则递归下一级
            if (father.hasleft()) {
                insert(data, father.leftSon);
            } else {
                father.leftSon = new BTree();
                father.leftSon.data = data;
                father.leftSon.father = father;
            }
        }

    }
    //先序遍历
    public static void query1(BTree tree){
        if (tree==null) {
            return;
        }
        System.out.print(tree.data+"  ");
        if (tree.hasleft()) {
            query1(tree.leftSon);
        }
        if (tree.hasright()) {
            query1(tree.rightSon);
        }
    }

    //中序遍历
    public static void query2(BTree tree){
        if (tree==null) {
            return;
        }
        System.out.print(tree.data+"  ");
        if (tree.hasleft()) {
            query2(tree.leftSon);
        }
        if (tree.hasright()) {
            query2(tree.rightSon);
        }
    }
    //后序遍历
    public static void query3(BTree tree){
        if (tree==null) {
            return;
        }
        System.out.print(tree.data+"  ");
        if (tree.hasleft()) {
            query3(tree.leftSon);
        }
        if (tree.hasright()) {
            query3(tree.rightSon);
        }
    }
}
