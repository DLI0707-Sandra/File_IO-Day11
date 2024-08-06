package basics.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputtoFile
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the data to be input to the file:");
//        scanner.nextLine();
        String data=scanner.nextLine();
        File input_file=new File("src/basics/com/user_input.txt");
        try (FileWriter fileWriter=new FileWriter(input_file);)
        {
            fileWriter.write(data);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
