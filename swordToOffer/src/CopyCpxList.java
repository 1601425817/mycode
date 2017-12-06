import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

class RandomListNode {
     int label;
     RandomListNode next = null;
     RandomListNode random = null;

    public RandomListNode(int label) {
        this.label = label;
    }
}
public class CopyCpxList {
	public static RandomListNode Normalcopy(RandomListNode head)//普通链表的复制
	{
		if(head == null)
		{
			return null;
		}
		RandomListNode phead = new RandomListNode(head.label);
		RandomListNode pnode = phead;
		head = head.next;
		while(head != null)
		{
			pnode.next = new RandomListNode(head.label);
			pnode = pnode.next;
			head = head.next;
		}
		return phead;
	}
	
	public static RandomListNode Clone(RandomListNode head)//普通链表的复制
	{
		if(head == null)
		{
			return null;
		}
		head = copy(head);
		randomNodecopy(head);
		return separate(head);
	} 
	
	public static RandomListNode copy(RandomListNode head)//普通链表的复制
	{
		if(head == null)
		{
			return null;
		}
		RandomListNode phead = head;
		while(head != null)
		{
			RandomListNode node = new RandomListNode(head.label);
			node.next = head.next;
			head.next = node;
			head = node.next;
		}
		return phead;
	}
	
	public static void randomNodecopy(RandomListNode head)//普通链表的复制
	{
		if(head == null)
		{
			return;
		}
		while(head != null)
		{
			if(head.random != null)
			{
				head.next.random = head.random.next;
			}
			head = head.next.next;
		}
		return;
	}
	
	public static RandomListNode separate(RandomListNode head)
	{	
		RandomListNode phead = head.next;
		RandomListNode pNode = phead;
		while(head != null)
		{
			phead.next = head.next.next;
			phead = head.next;
			head.next = phead.next;
			head = phead.next;
			if(head == null)
			{
				phead.next = null;
				break;
			}
			
		}
		return pNode;
	}
	
	public static void main(String[] args)
	{
		RandomListNode head = new RandomListNode(0);
		head.next = new RandomListNode(1);
		RandomListNode node = head.next;
		node.next = new RandomListNode(2);
		node = node.next;
		node.next = new RandomListNode(3);
		node = node.next;
		node.next = new RandomListNode(5);
		head.random = head.next.next;
		head.next.next.next.random = head.next;
		head.next.random  = head.next.next.next.next;
		RandomListNode phead = Clone(head);
		while(phead != null)
		{
			System.out.println(phead.label);
			phead = phead.next;
		}
	}
	
}
