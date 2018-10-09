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