//Code to remove duplicates from an array in Java.  
//Based off of this answer on StackOverflow: http://codereview.stackexchange.com/a/29231

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public static int[] removeDuplicates(int []arr)
{
  Set<Integer> alreadyExists = new HashSet<Integer>();
  int loc = 0;
  int noDuplicates[] = new int[arr.length];
  
  for(int i = 0; i < arr.length; i++)
  {
    if(alreadyExists.add(arr[i])) // returns "true" if set changed
    {
      noDuplicates[loc] = arr[i];
      loc++;
    }
  }
  
  return Arrays.copyOf(noDuplicates, loc);
}
