package week7.task2;

public class Task2 {

    public boolean getNullPointerException(String str1, String str2) throws NullPointerException{
        if(str1==null || str2==null)    throw new NullPointerException();
        return str1.equals(str2);
    }

}
