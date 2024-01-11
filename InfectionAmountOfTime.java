//Question 2385 named Amount of Time for Binary Tree to Be Infected

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

class InfectionAmountOfTime
{
    private static HashMap<Integer, ArrayList<Integer>> map;
    public static int main(TreeNode root, int start){
        map = new HashMap<Integer, ArrayList<Integer>>();
        toUndirectedGraph(root, null);
        HashSet<Integer> visited = new HashSet<>();
        visited.add(start);
        int max = recursiveInfection(start, visited, 0);
        return max;
    }
    private static void toUndirectedGraph(TreeNode root, TreeNode head){
        if(!map.containsKey(root.val)){
            ArrayList<Integer> arr = new ArrayList<>(3);
            if(head != null){
                arr.add(head.val);
            }
            if(root.left != null){
                arr.add(root.left.val);
                toUndirectedGraph(root.left, root);
            }
            if(root.right != null){
                arr.add(root.right.val);
                toUndirectedGraph(root.right, root);
            }
            map.put(root.val, arr);
        }
    }
    private static int recursiveInfection(int start, HashSet<Integer> visited, int level){
        ArrayList<Integer> arr = map.get(start);
        arr.removeAll(visited);
        int max = level;
        if(arr.size() == 0){
            return level;
        }
        visited.addAll(arr);
        for(int i=0; i<arr.size(); i++){
            int tempMax = recursiveInfection(arr.get(i), visited, level+1);
            if(tempMax > max){
                max = tempMax;
            }
        }
        return max;
    }
}