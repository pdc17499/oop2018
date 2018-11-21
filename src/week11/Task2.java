package week11;

import java.util.ArrayList;

public class Task2 {
    public <T extends Comparable<T>> T MaxArray(ArrayList<T> Arr){
        T Max = Arr.get(0);
        for(int i=0;i<Arr.size();i++){
            if(Arr.get(i).compareTo(Max)>0){
                Max = Arr.get(i);
            }
        }
        return Max;
    }
    public static void main(String Args[]){
        ArrayList<Double> A = new ArrayList<Double>();
        A.add(2.3);
        A.add(0.6);
        A.add(7.8);
        Task2 task2 = new Task2();
        System.out.println(task2.MaxArray (A));
    }

}