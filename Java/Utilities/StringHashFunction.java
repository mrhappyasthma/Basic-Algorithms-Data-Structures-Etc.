//Based off of: http://algs4.cs.princeton.edu/34hash/

int M = SizeOfTable;  //Use the size of the data structure for the table here!
int hash = 0;
int R = 31; //per Java -- small prime int

for(int i = 0; i < str.length(); i++)
{
  hash = (R * hash + s.charAt(i)) % M;
}
