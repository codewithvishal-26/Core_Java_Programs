package Begineers;

public class rmspace {

    public static void main(String[] args){
        String str = " Visiting the Taj Mahal ";

        String noSpace = str.replaceAll("\\s", "");
        System.out.println("Original String: '" + str + "'");
        System.out.println("String without spaces: '" + noSpace + "'");

        String trimstr = str.trim();
        System.out.println("Trimmed String: '" + trimstr + "'");

        String trimnoSpace = str.strip().replace("", "");
        System.out.println("Trimmed and no space String: '" + trimnoSpace + "'");
      
    }
    
}
