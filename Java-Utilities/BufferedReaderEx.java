import java.io.BufferedReader;
import java.io.FileReader;

try
{
  BufferedReader in = new BufferedReader(new FileReader("file.txt"));
  String s = in.readLine();
  in.close();
}
catch(Exception exc)
{
  exc.printStackTrace();
}
