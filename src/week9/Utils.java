package week9;

import java.io.*;

public class Utils {

    public static String readContentFormFile(String path){
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            String result="";
            int i = 0;
            while((i=fileInputStream.read())!=-1){
                result+=(char)i;
            }
            fileInputStream.close();
            return result;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }



    public static void writeContentToFile(String path, String newContent){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            byte[] temp = newContent.getBytes();
            fileOutputStream.write(temp);
            fileOutputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void addContentToFile(String path,String newContent){
        try{
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write("\n");
            fileWriter.write(newContent);
            fileWriter.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }



    public static File findFileByName(String folderPath, String fileName){
        try{
            File dic = new File(folderPath);
            File[] arrFile = dic.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.startsWith(fileName) && name.endsWith(".txt");
                }
            });
            return arrFile[0];
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String args[]){

        String s="Tuan 9";
        Utils.writeContentToFile ("src/week9/File.txt", s);




        String c="add";
        Utils.addContentToFile ("src/week9/File.txt",c);

        String readFormFile = Utils.readContentFormFile("src/week9/File.txt");
        System.out.println(readFormFile);
        File searchFile = Utils.findFileByName("src/week9/","File.txt");
        if(searchFile!=null)    System.out.println("File is exist");
        else System.out.println("File is not exist");
    }
}