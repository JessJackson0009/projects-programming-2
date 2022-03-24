
import java.io.*;
import java.util.Scanner;

public class Project2 extends Object{

        public static void main (String args[]){

                int numOfLines = 0;
                int numOfDoubles = 0;
                String stringLine = null;
                int numOfSkips = 0;
                double curNum = 0.0;
                double maxValue = 0.0;
                double minValue = 10000.00;

                if(args.length != 1){
                        System.out.println("Usage: java Project2 <filename>");
                        System.exit(0);
                }
                try(
                    FileInputStream file = new FileInputStream( args[0]);
                    Scanner in = new Scanner(file);
                )
                {
                    while(in.hasNextLine()){
                        stringLine = in.nextLine();
                        numOfLines = numOfLines + 1;
                        if(stringLine == "" || !(in.hasNextDouble())){
                            numOfSkips++;
                        }
                        if(in.hasNextDouble() && !(in.hasNextInt())){
                            numOfDoubles++;
                        }
                        while(in.hasNextDouble() && (!(in.hasNextInt()))){
                            curNum = in.nextDouble();
                            if(curNum > maxValue){
                                maxValue = curNum;
                            if(curNum < minValue && curNum < maxValue){
                                minValue = curNum;
                            }
                        }
                        }
                    }
                }
                
                catch(FileNotFoundException fnf){
                        System.out.println(args[0] + " not found");
                }

                catch(IOException ioe){
                    System.out.println("Input Output Error");
                }
                System.out.println("number of lines " + numOfLines);
                System.out.println("number of lines skipped " + numOfSkips);
                System.out.println("number of double values " + numOfDoubles);
                System.out.println("max value: " + maxValue);
                System.out.println("min value: " + minValue);



            }
}
