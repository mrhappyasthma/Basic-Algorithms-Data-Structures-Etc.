//Computer "n choose k" with no repetition

//See: https://en.wikipedia.org/wiki/Binomial_coefficient#Multiplicative_formula

//Math:       n!               k     n + 1 - i
//       ------------    =     𐍀    -----------
//        k! * (n-k)!         i=1        i

public static int choose(int n, int k)
{
  int sum = 1; //Default value for products	
	
  for(int i = 1; i <= k; i++)
  {
  	sum *= ((double)(n - (k - i)) / (double)i); //Cast to doubles because of division
  }
  
  return sum;
}

//Another possible solution uses recursion.  It is taken from http://stackoverflow.com/a/15302448

public static int chooseRecursive(int n, int k)
{
  if(k > n)
  {
    return 0;
  }
  
  if(k == 0)
  {
    return 1;
  }
  
  return (n * choose(n-1, k-1)) / k;  //O(k) space & time
}
