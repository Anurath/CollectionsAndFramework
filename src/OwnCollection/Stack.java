package OwnCollection;

public class Stack {

	Node head ;
	
	public Stack()
	{}
	
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public boolean push(Object val)
	{
		Node temp = new Node(val);
		
		if(isEmpty())
		{
			head = temp;
			return true;
		}
		temp.prev = head;
		head.next = temp;
		head = temp;
		
		return true;
	}
	
	public Object peek()
	{
		if(head!=null)
		{
			return head.val;
		}
		return null;
	}
	
	public Object pop()
	{
		if(head!=null)
		{
			if(head.prev!=null)
			{
				Node temp = head;
				head = head.prev;
				head.next = null;
				return temp.val;
			}
			else {
				Node temp = head;
				head = null;
				return temp.val;
			}
		}
		return null;
	}
}
