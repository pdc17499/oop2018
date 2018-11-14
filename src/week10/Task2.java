package week10;
public class Task2 {

    public void bubbleSort(double[] temp){
        for(int i=0;i<temp.length-1;i++){
            for(int j=0;j<temp.length-1;j++){
                if(temp[j]>temp[j+1]){
                    double tmp = temp[j];
                    temp[j]= temp[j+1];
                    temp[j+1]= tmp;
                }
            }
        }
    }
    public static void main(String args[]){

        double[] ar=new double[1000];
        for(int i=0;i<1000;i++){
            ar[i] = Math.random()*(1000-1) +1;
        }
        Task2 s= new Task2();
        s.bubbleSort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}