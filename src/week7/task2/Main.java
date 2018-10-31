package week7.task2;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        Task2 task2 = new Task2();

        try {
            System.out.println(task2.getArithmeticException(1, 1.5));
        } catch (ArithmeticException e) {
            System.out.println("Lỗi Chia cho 0");
        }


        String s1 = null;
        String s2 = "Math";
        try {
            System.out.println(task2.getNullPointerException(s1, s2));
        }
        catch (NullPointerException e){
            System.out.println("ERROR:  NullPointerException.");
        }


        try{
            task2.getFileNotFoundException("File.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("ERROR:  FileNotFoundException");
        }



        try
        {
            task2.getIOException("weeek7.txt");
        }
        catch (IOException e){
            System.out.println("ERROR: IOException");
        }



        try {
            task2.getClassCastException();
        }
        catch (ClassCastException ex){
            System.out.println("ClassCastException");
        }

        int Arr[] = {1,2,3,4,5};
        int position = 7;
        try{
            Arr = task2.delete(Arr,position);
            for(int i:Arr){
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

    }
}