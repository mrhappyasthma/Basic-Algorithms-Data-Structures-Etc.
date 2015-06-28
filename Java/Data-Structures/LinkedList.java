public class LinkedList<T>
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
  
  private Node head;
  private int length;
  
  public LinkedList()
  {
    head = null;
    length = 0;
  }
  
  public boolean isEmpty()
  {
    return (head == null);
  }
  
  public void add(T value)
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
    
    length++;
  }
  
  public boolean contains(T value)
  {
    if(isEmpty())
    {
      return false;
    }
    
    Node n = head;
    
    while(n != null)
    {
      if(n.value.equals(value))
      {
        return true;
      }
      else
      {
        n = n.next;
      }
    }
    
    return false;
  }
  
  public T get(int index)
  {
    if(index < 0 || index >= length || isEmpty())
    {
      return null;
    }
    
    Node n = head;
    
    for(int i = 1; i <= index; i++)
    {
      n = n.next;
    }
    
    return n.value;
  }
  
  public T remove(int index)
  {
    if(index < 0 || index >= length || isEmpty())
    {
      return null;
    }
    
    T value = null;
    Node n = head;
    
    if(index == 0)
    {
      value = head.value;
      head = head.next;
    }
    else
    {
      for(int i = 1; i < index; i++)
      {
        n = n.next;
      }
      
      value = n.next.value;
      n.next = n.next.next;
    }
    
    length--;
    return value;
  }
  
  public void print()
  {
    Node n = head;
    
    while(n != null)
    {
      System.out.println(n.value.toString());
      n = n.next;
    }
  }
  
  public int size()
  {
    return length;
  }
}
