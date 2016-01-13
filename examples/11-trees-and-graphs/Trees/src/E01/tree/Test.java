package E01.tree;

public class Test {

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<String>("root");
		{
			TreeNode<String> node0 = root.addChild("node0");
			TreeNode<String> node1 = root.addChild("node1");
			TreeNode<String> node2 = root.addChild("node2");
		    {
		    	TreeNode<String> node20 = node2.addChild("node20");
		    	TreeNode<String> node21 = node2.addChild("node21");
		        {
		        	TreeNode<String> node201 = node20.addChild("node201");
		        }
		    }
		}
		root.print(root , 0);

	}

}
