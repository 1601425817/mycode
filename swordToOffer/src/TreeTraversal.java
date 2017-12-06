import java.util.ArrayList;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class TreeTraversal {
    TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
   
        if(pRootOfTree == null)
            return null;
        inOrder(pRootOfTree);
        System.out.println(pre);
        while(pRootOfTree.left != null)
        {
            pRootOfTree = pRootOfTree.left;
        }
        return pRootOfTree;
    }
    public void inOrder(TreeNode root) {
		if(root.left != null)
			inOrder(root.left);
        if(pre == null)
            pre = root;
        if(pre != root){
            pre.right = root;
        	root.left = pre;
        	pre = root;
   		}
		if(root.right != null)
			inOrder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode8 = new TreeNode(8);
		TreeNode treeNode10 = new TreeNode(10);
		TreeNode treeNode12 = new TreeNode(12);
		TreeNode treeNode14 = new TreeNode(14);
		TreeNode treeNode16 = new TreeNode(16);
		treeNode6.left = treeNode4; treeNode6.right = treeNode8;
		treeNode14.left = treeNode12; treeNode14.right = treeNode16;
		treeNode10.left = treeNode6; treeNode10.right = treeNode14;
		TreeNode root = new TreeTraversal().Convert(treeNode10);
		while(root != null)
		{
			System.out.print(root.val+" ");
			root = root.right;
		}
	}

}
