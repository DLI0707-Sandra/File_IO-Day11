package basics.com;

import java.io.*;

public class ReadandDisplayFile
{
    public static void main(String[] args)
    {
        File input_file=new File("src/basics/com/input.txt");
        try (BufferedReader bufferedReader=new BufferedReader(new FileReader(input_file));)
        {

            String line;
            while((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
