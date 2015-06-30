//This HashTable is backed by an array and resolved hash collisions using seperate chaining via a LinkedList

import java.util.List;
import java.util.LinkedList;

public class HashTable
{
  private class KeyValuePair
  {
    Object key;
    Object value;
    
    private KeyValuePair(Object key, Object value)
    {
      this.key = key;
      this.value = value;
    }
    
    public void setValue(Object value)
    {
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
  
  private int hash(Object key)
  {
    return (key.hashCode() & 0x7FFFFFFF) % capacity; //Mask off sign bit -- could use Math.abs() instead
  }
  
  public void put(Object key, Object value)
  {
    if(key == null || value == null)
    {
      throw new IllegalArgumentException("Key and Value cannot be null");
    }
    
    int index = hash(key);
    List <KeyValuePair> list = null;
    
    if(values[index] == null)
    {
      list = new LinkedList<KeyValuePair>();
      values[index] = list;
    }
    else
    {
      list = (List<KeyValuePair>) values[index];
    }
    
    //Check if it already exists, and overwrite
    if(get(key) != null)
    {
      for(KeyValuePair kvp : list)
      {
        if(kvp.key.equals(key))
        {
          kvp.setValue(value); //Remap key to the new value
        }
      }
    }
    else
    {
      list.add(new KeyValuePair(key, value));  //Add a new key, value pair to the linked list
    }
  }
  
  public Object get(Object key) throws IllegalArgumentException
  {
    if(key == null)
    {
      throw new IllegalArgumentException("Key cannot be null");
    }
    
    List <KeyValuePair> list= (List<KeyValuePair>) values[hash(key)];
    
    if(list != null)
    {
      for(KeyValuePair kvp : list)
      {
        if(kvp.key.equals(key))
        {
          return kvp.value;
        }
      }
    }
    
    return null;
  }
  
 public Object remove(Object key) throws IllegalArgumentException
 {
    if(key == null)
    {
      throw new IllegalArgumentException("Key cannot be null");
    }
  
    List <KeyValuePair> list = (List<KeyValuePair>) values[hash(key)];
  
    if(list != null)
    {
      for(int i = 0; i < list.size(); i++)
      {
        if(list.get(i).key.equals(key))
        {
          return list.remove(i).value;
        }
      }
    }
    
    return null; 
 }
}
