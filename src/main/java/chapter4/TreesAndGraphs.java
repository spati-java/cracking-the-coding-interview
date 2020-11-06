package chapter4;

import model.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreesAndGraphs {

    public int pathsWithSum(TreeNode tree) {

        int numberOfPaths = 0;

        return numberOfPaths;
    }

    public List<List<Integer>> getListOfDepths(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        List<List<Integer>> depths = new ArrayList<>();

        q.offer(root);

        while(!q.isEmpty()) {

            TreeNode temp = q.poll();
            System.out.println("checking node "  + temp.data);
            LinkedList<Integer> linkedList = new LinkedList<>();

            if( temp.left != null  &&  temp.right != null ) {
                linkedList.addFirst(temp.data);
                linkedList.add(temp.left.data);
                linkedList.addLast(temp.right.data);
                q.offer(temp.left );
                q.offer(temp.right );

            } else if ( temp.left != null && temp.right == null){
                System.out.println("left not null and right null  "  + temp.data);
                linkedList.addFirst(temp.data);
                linkedList.addLast(temp.left.data);
                q.offer(temp.left );

            } else if(temp.right != null && temp.left == null) {
                System.out.println(" case right not null and left   null  "  + temp.data);
                linkedList.addFirst(temp.data);
                linkedList.add(temp.right.data);
                q.offer(temp.right );
            }
            depths.add(linkedList);
        }
        return depths;
    }

    public int getHeight(TreeNode root) {
        if(root == null) return 0;
        return height(root);
    }

    public int height(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int leftH = 0;
        int rightH = 0;

        leftH =   getHeight(root.left);
        rightH =  getHeight(root.right);

        if(leftH > rightH) return leftH+1;

        return rightH+1;


    }
}