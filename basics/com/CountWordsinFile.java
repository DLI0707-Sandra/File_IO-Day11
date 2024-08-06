package basics.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordsinFile
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the file to be read:");
        String filename=scanner.next();

        File file=new File(filename);

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file));)
        {
            int count=0;
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                String[] words=line.split(" ");
                count+=words.length;
            }
            System.out.println("Number of words:"+count);
        }catch (IOException e)
        {

        }
    }
}
