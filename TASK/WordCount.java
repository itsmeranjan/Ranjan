package TASK;

public class WordCount 
 {
    public static void main(String[] args) {
    String s1 ="tele hi tele mangood tele tele morninginam tele tele andiamworking tele ieat tele tele teleiwant teleilike teleiloveiam";
    String [] d=s1.split("tele");
    int count=0;
    for (String str : d) {
        count++;
    }
    System.out.println("count of tele :"+(count));
}
}