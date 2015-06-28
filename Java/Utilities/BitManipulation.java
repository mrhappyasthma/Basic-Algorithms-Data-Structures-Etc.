//Based off of "Cracking the Coding Interview"

public static int getBit(int x, int loc) throws IllegalArgumentException
{
  if(loc < 0 || loc > 31)
  {
    throw new IllegalArgumentException("Bit must be index 0-31");
  }
  
  int mask = 1 << loc;
  return Math.abs(((x & mask) >> loc));
}

public static int setBit(int x, int loc) throws IllegalArgumentException
{
  if(loc < 0 || loc > 31)
  {
    throw new IllegalArgumentException("Bit must be index 0-31");
  }
  
  int mask = 1 << loc;
  return x | mask;
}

public static int clearBit(int x, int loc) throws IllegalArgumentException
{
  if(loc < 0 || loc > 31)
  {
    throw new IllegalArgumentException("Bit must be index 0-31");
  }
  
  int mask = ~(1 << loc);
  return x & mask;
}

public static int updateBit(intx, int loc, int value) throws IllegalArgumentException
{
  if(loc < 0 || loc > 31)
  {
    throw new IllegalArgumentException("Bit must be index 0-31");
  }
  
  if(value < 0 || value > 1)
  {
    throw new IllegalArgumentException("Value must be a valid bit [0 or 1]");
  }
  
  if(value == 0)
  {
    return clearBit(x, loc);
  }
  else
  {
    return setBit(x, loc);
  }
}
