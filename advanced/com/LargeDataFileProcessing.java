package advanced.com;

import java.io.*;
import java.util.Scanner;

public class LargeDataFileProcessing
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount=scanner.nextInt();
        File transaction=new File("src/advanced/com/transactions.txt");
        File filtered=new File("src/advanced/com/filtered_transactions.txt");

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(transaction)); BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filtered));)
        {
            String line;
            while((line=bufferedReader.readLine())!=null)
            {
                String[] transaction_data=line.split(",");
                if(Integer.parseInt(transaction_data[2])>amount)
                {
                    bufferedWriter.write(line);
                }
            }
        }catch (IOException e)
        {

        }

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(filtered))) {
            String line;
            while((line= bufferedReader.readLine())!=null)
                System.out.println(line);

        }catch (IOException e)
        {}

    }
}
