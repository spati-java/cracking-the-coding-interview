package chapter4;

import model.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreesAndGraphsTest {
    TreesAndGraphs tag;
    TreeNode tn ;
    TreeNode root = null;

    @BeforeEach
    public void init(){

        tag = new TreesAndGraphs();
        root = new TreeNode(10);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);

        root.left.left.right = new TreeNode(3);

    }


    public  TreeNode addNode(TreeNode root , int val) {
        if(root == null)  root = new TreeNode(val);
        else if (root.data > val) root.left = addNode(root.left, val);
        else root.right = addNode(root.right, val);
        return root;

    }

    @Test
    public void testPrintInorder() {
        List<Integer> dataL = new ArrayList<>();
        tn = this.root;
        printInorder(tn , dataL);
        System.out.println(dataL);

    }

    public void printInorder( TreeNode root , List<Integer> dataL) {
        if(root != null){
            printInorder(root.left , dataL);
            dataL.add(root.data);
            printInorder(root.right, dataL);
        }
    }

    @Test
    void pathsWithSum() {
    }

    @Test
    void invertedBSt() {
        List<Integer> dataL = new ArrayList<>();
        System.out.println(dataL);
        //tn = tag.invertedBSt(this.root);
        printInorder(tn , dataL);
        System.out.println(dataL);
    }

    @Test
    void getListOfDepths() {

        List<List<Integer>> resultList = tag.getListOfDepths(this.root);

        for(List<Integer> list: resultList){
            System.out.println("  ");
            for(Integer i: list){
                System.out.print(i.intValue() + " ");
            }
            System.out.println("  ");
        }

    }

    @Test
    void height() {

      int expected = 4;

      int actual = tag.getHeight(this.root);

      assertEquals(expected, actual);


    }
}