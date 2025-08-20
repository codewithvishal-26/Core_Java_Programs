package Begineers;

public class FindSubStr {
    public static void main(String[] args) {
        
        String str = "Vishal Chandrabanshi";
        String subStr = "Chandra";
        

        if(str.contains(subStr)){
            System.err.println("Substring Found!");
        }else {
            System.out.println("Substring not found!");
        }
    }
}
