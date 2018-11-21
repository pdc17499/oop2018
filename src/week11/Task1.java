package week11;
public class Task1 {
    public <T extends Comparable<T>> void Sort(T[] Arr){
        for(int i=0;i<Arr.length-1;i++){
            for(int j=i+1;j<Arr.length;j++){
                if(Arr[i].compareTo(Arr[j])>0){
                    T t = Arr[j];
                    Arr[j]= Arr[i];
                    Arr[i] = t;
                }
            }
        }
    }
    public <T>void printArray(T[] Arr){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        Double A[] = {1.5,7.3,6.7,0.2,12.1};
        Task1 task1 = new Task1();
        task1.<Double>Sort(A);
        task1.<Double>printArray(A);
    }
}