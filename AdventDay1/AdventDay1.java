import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;
public class AdventDay1 {


    public static void main(String args[]) throws IOException{
        File input = new File("input.txt");
        Scanner fr = new Scanner(new FileInputStream(input));
        HashSet<Integer> set = new HashSet<Integer>();
        while(fr.hasNextLine()) {
            set.add(fr.nextInt());
        }
        int year = 2020;
        int numberToMult1 = 0;
        int numberToMult2 = 0;
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int temp = iter.next();
            int valNeeded = 2020 - temp;
            if (set.contains(valNeeded)) {
                numberToMult1 = valNeeded;
                numberToMult2 = temp;
                break;
            }
        }
        System.out.println(numberToMult1 * numberToMult2);
    }
}
