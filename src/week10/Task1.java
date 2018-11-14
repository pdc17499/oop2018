package week10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public List<String> getAllFunctions(String path) {
        List<String> myList = new ArrayList<> ();
        try {
            FileInputStream fin = new FileInputStream (path);
            int i = 0;
            String str = "";
            while ((i = fin.read ()) != -1) {
                str += (char) i;
            }
            while (str.indexOf ("public static") != -1) {
                int start = str.indexOf ("public static");
                int end = str.indexOf ("//end");
                String s = str.substring (start, end);
                str = str.substring (end+ 1);
                myList.add (s);
            }
            return myList;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return null;
    }


    public static void main(String Args[]){

    }
}