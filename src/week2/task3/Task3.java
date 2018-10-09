package week2.task3;
class TheCat{
    private int age;
    private String name,color;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public String getcolor(){
        return color;
    }

    public void dotuoi(int a){
        if(a>3)  System.out.println("you have an old cat");
        else  System.out.println("you have a young cat");

    }
    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
    }
    public void amthanh(){
        System.out.println("meaoooooooooo") ;
    }

}

class Xoso{
    private int code;
    private    String name,seri;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setcode(int code){
        this.code=code;
    }
    public int getcode(){
        return code;
    }
    public void setseri(String seri){
        this.seri=seri;
    }
    public String getseri(){
        return seri;
    }

    public void kiemtra(int a,int b){
        //kiem tra to ve so co ton tai
        if(code>a&&code<b) {
            System.out.println("ve so hop le");

        }
        else  System.out.println("ve so ko hop le");

    }

    public void Info(){
        System.out.println(name);
        System.out.println(code);
        System.out.println(seri);
        // in ra thong tin to ve so
    }
    public void Lucky(int cod,String ser){
        // kiem tra ket qua to ve so cua ban
        if(code==cod&&seri==ser) {
            System.out.println("Chuc Mung:" + name +"da trung thuong");
        }
        else System.out.println(" Chuc ban may man lan sau");
    }



}
class Mark{
    private int toan,anh,van;

    public void settoan(int toan){
        this.toan=toan;
    }
    public int gettoan(){
        return toan;
    }
    public void setanh(int anh){
        this.anh=anh;
    }
    public int getanh(){
        return anh;
    }
    public void setvan(int van){
        this.van=van;
    }
    public int getvan(){
        return van;
    }

    public double diemtrungbinh(){
        return (toan+anh+van)/3;
    }
    public void showInfo(){
        System.out.println("Diem so 3 mon hoc chinh la:");
        System.out.println(toan);
        System.out.println(van);
        System.out.println(anh);
    }
    public void bestMark(){
        System.out.println("Mon hoc ban cao diem nhat la: ");
        if(this.toan>this.anh&&this.toan>this.van)  {
            System.out.println("Toan");
        }
        if(this.van>this.anh&&this.van>this.toan)  {
            System.out.println("Van");
        }
        if(this.anh>this.toan&&this.anh>this.van)  {
            System.out.println("Anh");
        }

    }

}

public class Task3 {
    public static void main(String[] args){
        TheCat a=new TheCat();
        a.setage(4);
        a.setcolor("black");
        a.setname("miu");
        a.showInfo();

        Mark b=new Mark();
        b.settoan(4);
        b.setvan(9);
        b.setanh(6);
        b.bestMark();



        Xoso c=new Xoso();
        c.setname("Chu Phuc");
        c.setcode(246879);
        c.setseri("B1023YT6");
        c.Lucky(246777,"B123YU703");





    }


}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
