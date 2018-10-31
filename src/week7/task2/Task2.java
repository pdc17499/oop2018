package week7.task2;
import java.io.*;


public class Task2 {



    public double getArithmeticException(double a, double b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException();
        return a/b;
    }

    public boolean getNullPointerException(String str1, String str2) throws NullPointerException{
        if(str1==null || str2==null)    throw new NullPointerException();
        return str1.equals(str2);
    }


    public void getFileNotFoundException(String path) throws FileNotFoundException {
        File file = new File(path);
        if(file.canRead()==false) throw new FileNotFoundException();
        FileInputStream fileInputStream = new FileInputStream(file);
        try{
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public void getIOException(String f) throws IOException{
        File file = new File(f);
        if(file.canRead()==false) throw new IOException();
        FileInputStream fileInputStream = new FileInputStream(file);
        try{
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    public  class Man{
        int a;
    }
    public  class  Woman extends Man{
        double c;
    }
    public void getClassCastException() throws ClassCastException{
        Man a1= new Man();
       Woman b  =  (Woman)a1;
        throw new ClassCastException();
    }

    public int[] delete(int Arr[], int position) throws ArrayIndexOutOfBoundsException{
        if(position >= Arr.length || position < 0)   throw new ArrayIndexOutOfBoundsException();
        int []Brr = new int[Arr.length-1];
        for(int i = position; i < Arr.length - 1; i++){
            Arr[i] = Arr[i+1];
        }
        for(int i=0;i<Brr.length;i++){
            Brr[i]= Arr[i];
        }
        return Brr;
    }

    }




