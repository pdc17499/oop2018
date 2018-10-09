/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
class HoaQua {
    public String ngaynhap;
    public int soluong;
    public String getngaynhap() {
        return ngaynhap;
    }
    public void setngaynhap(String n) {

        this.ngaynhap=n;

    }
    public int getSoluong() {
        return soluong;
    }
    public void  setSoluong(int n) {
      this.soluong=n;
    }
    public void GT(){
        System.out.println("Mua vao   "+ngaynhap+" voi so luong: "+soluong );
    }

}

class Cam extends HoaQua{
    private String nguongoc;
    public int giaban;
    public int getgiaban() {
        return giaban;
    }
    public void setgiaban(int n) {
        this.giaban=n;
    }
    public String getNguongoc(){
        return  this.nguongoc;
    }
    public void setNguongoc(String n) {
        this.nguongoc=n;
    }
}

class Tao extends  HoaQua{
    public String mausac;
    public int giaban;

    public int getgiaban() {
        return giaban;
    }
    public void setgiaban(int n) {
        this.giaban=n;
    }


    public String getMausac() {
        return mausac;
    }
    public void setMausac(String d) {
        this.mausac= d;
    }


}

class CamThanhPhong extends Cam{
    public   String muivi;
    private  int can;
    public int getCan(){
        return  can;
    }
    public  void setCan(int a){
        can=a;

    }

    public String getMuivi() {
        return muivi;
    }
    public void setMuivi(String i) {
        this.muivi = i;
    }

}
class CamSanh extends Cam {
    public int cannang;
    public String hinhdang;

    public int getCannang() {
        return cannang;
    }

    public void setCannang(int n) {
        this.cannang = n;
    }

    public String getHinhdang() {
        return hinhdang;
    }

    public void setHinhdang(String d) {
       hinhdang = d;
    }

}


 class  Main{

    public static void main(String []args ) {

        HoaQua k = new HoaQua();
        k.setngaynhap("17/4/2018");
        k.setSoluong(100);
        k.GT();
        System.out.println("");


        }

        }



