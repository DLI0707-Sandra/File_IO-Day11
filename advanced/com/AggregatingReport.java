package advanced.com;

import java.io.*;
import java.util.Scanner;

public class AggregatingReport
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of possible levels:");
        int number=scanner.nextInt();
        File logs=new File("src/advanced/com/logs.txt");
        File summary=new File("src/advanced/com/log_summary.txt");
        int[] count=new int[number];
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(logs)); BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(summary));)
        {
            String line;
            while((line=bufferedReader.readLine())!=null)
            {
                String[] log_data=line.split(",");
                count[Integer.parseInt(log_data[1])-1]++;
            }
            for(int i=0;i<number;i++)
            {
                if(count[i]!=0)
                    bufferedWriter.write("Level"+(i+1)+":"+count[i]+"\n");
            }
        }catch (IOException e)
        {

        }

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(summary))) {
            String line;
            while((line= bufferedReader.readLine())!=null)
                System.out.println(line);

        }catch (IOException e)
        {}

    }
}
