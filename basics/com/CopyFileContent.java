package basics.com;

import java.io.*;

public class CopyFileContent
{
    public static void main(String[] args) throws IOException {

        File source_file=new File("src/basics/com/source.txt");
        File destination_file=new File("src/basics/com/destination.txt");
        System.out.println("Before copying destination file:");
        try(FileReader fileReader1=new FileReader(destination_file);) {
            int character1;
            while ((character1 = fileReader1.read()) != -1) {
                System.out.println((char) character1);
            }
        }catch (IOException e){}
        try(FileReader fileReader=new FileReader(source_file); FileWriter fileWriter=new FileWriter(destination_file);)
        {
            int character;
            while ((character=fileReader.read())!=-1)
            {
                fileWriter.write((char)character);
            }

        }
        catch (IOException e)
        {

        }
        System.out.println("After copying destination file:");
        try {
            FileReader fileReader=new FileReader(destination_file);
            int character;
            while ((character=fileReader.read())!=-1)
            {
                System.out.print((char)character);
            }
            fileReader.close();
        }catch (IOException e)
        {

        }
    }
}
