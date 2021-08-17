package study_ss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class s{
    public static void main(String[] args){
        System.out.println("aaaa");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("qqqq");
            System.out.println(fis);
        }
    }
}