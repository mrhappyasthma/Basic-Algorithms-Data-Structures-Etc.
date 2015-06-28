public class Stack<T>
{
  private class Node
  {
    Node next;
    T value;
    
    public Node(T value)
    {
      this.value = value;
    }
  }
  
  Node head;
  
  public Stack()
  {
    head = null;
  }
  
  public boolean isEmpty()
  {
    return (head == null);
  }
  
  public void push(T value)
  {
    if(isEmpty())
    {
      head = new Node(value);
    }
    else
    {
      Node n = new Node(value);
      n.next = head;
      head = n;
    }
  }
  
  public T pop()
  {
    if(isEmpty())
    {
      return null;
    }
    
    T value = head.value;
    head = head.next;
    return value;
  }
}
