package org.dangerous.pattern.structure.combination;

/**
 * 组合模式
 * Created by Administrator on 2016/12/22.
 */
public class Client {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
