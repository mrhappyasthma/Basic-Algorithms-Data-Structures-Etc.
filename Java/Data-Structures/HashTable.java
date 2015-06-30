import java.util.List;
import java.util.LinkedList;

public class HashTable
{
  private class KeyValuePair
  {
    Object key;
    Object value;
    
    private KeyBaluePait(Object key, Object value)
    {
      this.key = key;
      this.value = value;
    }
  }
  
  private Object values[]; //You cannot have an array of generics, so we use an array of Objects
  private int capacity;
  
  public HashTable(int capacity)
  {
    this.capacity = capacity;
    values = new Object[capacity];
  }
}
