//This Heap is backed by an array.  
//
//Reference: http://www.cs.cmu.edu/~adamchik/15-121/lectures/Binary%20Heaps/heaps.html
//
//Heap array accesses can be found using the following equations:
//  Left Child = 2 * i + 1
//  Right Child = 2 * i + 2
//  Parent = (i - 1) / 2

public class BinaryHeap
{
  private int[] data;
  private int heapSize;
  
  public BinaryHeap(int size)
  {
    data = new int[size];
    heapSize = 0;
  }
  
  public int getMaximum()
  {
    if(isEmpty())
    {
      throw new HeapException("Heap is empty");
    }
    else
    {
      return data[0];
    }
  }
  
  public boolean isEmpty()
  {
    return (heapSize == 0);
  }
  
  public int getLeftChild(int Index)
  {
    return (2
  }
}
