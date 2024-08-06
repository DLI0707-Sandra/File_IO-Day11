package basics.com;

import java.io.*;

public class ReverseandWrite
{

    public static void main(String[] args)
    {
        File input=new File("src/basics/com/input.txt");
        File reverse=new File("src/basics/com/reversed.txt");

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(input));BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(reverse));)
        {
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                StringBuilder stringBuilder=new StringBuilder(line);
                stringBuilder.reverse();
                String reversed=stringBuilder.toString();
                bufferedWriter.write(reversed);
            }

        }catch (IOException e)
        {

        }

    }

}
