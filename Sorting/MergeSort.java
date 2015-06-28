//Based off of "Cracking the Coding Interview"
//Their version of the code can be found here: https://code.google.com/p/ctci/source/browse/trunk/Java/Chapter+11a/Introduction/MergeSort.java?r=13

public static void mergeSort(int arr[])
{
  if(arr == null || arr.length = 0)
  {
    return;
  }

  mergeSort(arr, 0, arr.length-1);
}

private static void mergeSort(int arr[], int left, int right)
{
  if(left < right)
  {
    int mid = left + (right-left)/2; //Pick middle most element
    
    mergeSort(arr, left, mid);
    mergeSort(arr, mid+1, right);
    
    merge(arr, left, mid, right);
  }
}

private static void merge(int arr[], int left, int mid, int right)
{
  int tempArr[] = new int[(right-left+1)];
  int pos = 0;
  int leftPos = left;
  int rightPos = mid+1;
  
  while(leftPos <= mid && rightPos <= right)
  {
    if(arr[leftPos] < arr[rightPos])
    {
      tempArr[pos] = arr[leftPos];
      leftPos++;
    }
    else
    {
      tempArr[pos] = arr[rightPos];
      rightPos++;
    }
    
    pos++;
  }
  
  while(leftPos <= mid)
  {
    tempArr[pos] = arr[leftPos];
    leftPos++;
    pos++;
  }
  
  while(rightPos <= right)
  {
    tempArr[pos] = arr[rightPos];
    rightPos++;
    pos++;
  }
  
  for(int i = 0; i < pos; i++)
  {
    arr[left+i] = tempArr[i];
  }
}
