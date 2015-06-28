public static void quickSort(int arr[])
{
  quickSort(arr, 0, arr.length-1);
}

private static void quickSort(int arr[], int left, int right)
{
  int index = partition(arr, left, right);

  if(left < index-1)
  {
    quickSort(arr, left, index-1);
  }
  
  if(right > index)
  {
    quickSort(arr, index, right);
  }
}

private static int partition(int arr[], int left, int right)
{
  int pivot = arr[left + (right-left)/2]; //Pick middle most value
  
  while(left <= right)
  {
    while(arr[left] < pivot)
    {
      left++;
    }
    
    while(arr[right] > pivot)
    {
      right--;
    }
    
    if(left <= right)
    {
      swap(arr, left, right);
      left++;
      right--;
    }
  }
  
  return left;
}

private static void swap(int arr[], int left, int right)
{
  int temp = arr[left];
  arr[left] = arr[right];
  arr[right] = temp;
}
