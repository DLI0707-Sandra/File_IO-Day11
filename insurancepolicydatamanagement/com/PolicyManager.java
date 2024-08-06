package insurancepolicydatamanagement.com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PolicyManager
{
    public static void main(String[] args)
    {
        File policies=new File("src/insurancepolicydatamanagement/com/policies.txt");
        File summary=new File("src/insurancepolicydatamanagement/com/summary.txt");

        try(FileReader fileReader=new FileReader(policies); FileWriter fileWriter=new FileWriter(summary);)
        {
            int character;
            int nextcharacter;
            int count=0;
            int total_amount=0;
            String policy="";
            String[] policy_data;
            while((character=fileReader.read())!=-1)
            {
                if(character=='\n')
                {

                    policy_data=policy.split(",");
                    try {
                        total_amount+=Integer.parseInt(policy_data[policy_data.length-1].trim());
                    }catch (NumberFormatException e){
                        System.out.println("Exception");
                    }
                    count++;
                    policy="";
                }

                else {
                    policy+=(char)character;
                }
            }

            policy_data=policy.split(",");
            try {
                total_amount+=Integer.parseInt(policy_data[2].trim());
            }catch (NumberFormatException e){
                System.out.println("Exception");
            }
            count++;

            fileWriter.write("Number of policies:"+count+"\n");
            fileWriter.write("Total policy amount:"+total_amount);
        }catch (IOException e)
        {
            System.out.println("File not found !");
        }

    }
}
