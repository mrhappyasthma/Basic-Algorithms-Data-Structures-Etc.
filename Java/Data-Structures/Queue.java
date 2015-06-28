public class Queue<T>
{
  private class Node
  {
    Node next;
    T value;
    
    private Node(T value)
    {
      this.value = value;
    }
  }
  
  Node head, tail;
  
  public Queue()
  {
    head = null;
    tail = null;
  }
  
  public void enqueue(T value)
  {
    if(isEmpty())
    {
      head = new Node(value);
      tail = head;
    }
    else
    {
      Node n = new Node(value);
      tail.next = n;
      tail = n;
    }
  }
  
  public T dequeue()
  {
    if(isEmpty())
    {
      return null;
    }
    
    T value = head.value;
    head = head.next;
    return value;
  }
  
  public boolean isEmpty()
  {
    return (head == null);
  }
}
