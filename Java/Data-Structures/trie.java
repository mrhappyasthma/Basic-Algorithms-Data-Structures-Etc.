//Space:  O(R*N) to O(R*N*w)
//    w = average length of key
//Time for Search/Insert/Lazy Delete:  O(m)
//    m = length of key

//Reference:  http://algs4.cs.princeton.edu/52trie/

public class trie<V>
{
  private static int R = 256; //radix for ASCII strings
  private Node root;
  
  private static class Node
  {
    private Object val; //Cannot have an array of generics, so we will cast to/from an Object
    private Node[] next = new Node[R];
  }
  
  public V get(String key)
  {
    Node n = get(root, key, 0);
    
    if(n == null)
    {
      return null;
    }
    
    return (V) n.val;
  }
  
  private Node get(Node n, String key, int d)
  {
    if(n == null)
    {
      return null;
    }
    
    if(d == key.length())
    {
      return n;
    }
    
    char c = key.charAt(d);
    return get(n.next[c], key, d+1);
  }
  
  public void put(String key, V val)
  {
    root = put(root, key, val, 0);
  }
  
  private Node put(Node n, String key, V val, int d)
  {
    if(n == null)
    {
      n = new Node();
    }
    
    if(d == key.length())
    {
      n.val = val;
      return n;
    }
    
    char c = key.charAt(d);
    n.next[c] = put(n.next[c], key, val, d+1);
    return n;
  }
}
