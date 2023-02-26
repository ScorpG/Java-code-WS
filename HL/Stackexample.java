


public class Stackexample 
{
	Node top = null;
	
	public boolean isEmpty()
	{
		if( top == null )
			return true;
		else
			return false;
		// alternatively, return top==null;
	}
	
	// public void push(Node newNode) OR
	public void push(int d)
	{
		Node newNode = new Node();
		newNode.data = d;    //This adds data into half of the node and pointers into the other half 
		newNode.next = null; // the method newNode lives only inside the push method not in the pop method
		
		if( isEmpty() )
			top = newNode;
		else
		{	newNode.next = top;
			top = newNode; //This links the new node to the old top of the stack and then makes the new node the top of the stack
			// The order has to be correct; link and then make top 
		}
}//if you do top = null, you would kill the whole stack no matter what is in it
public int pop() // the top method lives in the whole code
{ 
	if (!isEmpty()) //translates to if is not stack is empty
	{
	int d = top.data;//this saves the data in the top then changes the top to the old top
	top = top.next; 
	return d; 
} else {
	System.out.println("Stack is empty");
	return 0;
}
}
public void printStack()
	{
		Node temp = top;
		System.out.print("top -> ");
		while( temp != null )
		{
			System.out.print(temp.data);
			System.out.print(" -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}


}
