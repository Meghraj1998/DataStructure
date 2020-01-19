package HashMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] a= {'a','b','f','f','a','a','e','a', 'a', 'c'};
		
	 
				
		NodeforHashMap  root=null;
		NodeforHashMap  root1=null;
		
		for(int i=0;i<a.length;i++)
		{
			 
			int k=(int)a[i];
			
			root1=search( root, k);
			if(root1==null)
			root=insert(root, k,1);
			
			
		}
		print(root);
		

	}
	
	
	
	
	public static NodeforHashMap insert( NodeforHashMap   root, int key , int value)
	{
		 
			  
		        /* If the tree is empty, return a new node */
		        if (root == null) { 
		            root = new NodeforHashMap (key, value); 
		            return root; 
		        } 
		  
		        /* Otherwise, recur down the tree */
		        if (key < root.key) 
		            root.left = insert(root.left, key, value); 
		        else if (key > root.key) 
		            root.right = insert(root.right, key,value); 
		        
		        
		  
		        /* return the (unchanged) node pointer */
		        
		        return root;
		        
		        
		        
		        
		        
		        
		     
	}
	
	
	public static NodeforHashMap search(   NodeforHashMap  root,int key)
	{
		
		 if (root == null) { 
	           return null; 
	        } 
		 
		 if(root.key==key)
		 {
			 root.value++;
			 
			 return root;
			 
			 
		 }
		 NodeforHashMap left=null;
		 NodeforHashMap right =null;
	        /* Otherwise, recur down the tree */
	        if (key < root.key) 
	        	
	        {
	          left=search(root.left, key); 
	        	
	        }
	             
	        else if (key > root.key)
	        {
	           right = search(root.right, key); 
	        	
	        }
	        	 
	        
	        
	  
	        /* return the (unchanged) node pointer */
	        
	       if(right!=null)
	       {
	    	  return right;
	    	  
	       }
	           if(left!=null)
	    	   return left;
	       
	       return null;
		
		
 
		
	}
	
	
	public static void print(NodeforHashMap root )
	{
		
		if(root==null)
			return;
		
		System.out.println(root.key+"---"+root.value);
		
		
		
		
		 print(root.left);
		 print(root.right);
		 
		
		return;
		
		
	}
	
	
	
	

}

 
