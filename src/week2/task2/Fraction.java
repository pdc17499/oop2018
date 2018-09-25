package week2.task2;

import  week2.task1.Task1;

import javax.xml.transform.sax.SAXSource;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;
    public String Infor(){
        return numerator+"/"+denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    }

    // phuong thuc rut gon phan so thanh toi gian
    public Fraction minimals() {
        int ucln = Task1.gcd(this.numerator, this.denominator);
        return new Fraction(this.numerator / ucln, this.denominator / ucln);
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        if (this.denominator == other.denominator)
            return new Fraction(this.numerator + other.numerator, other.denominator).minimals();
        else {
            return new Fraction(this.numerator * other.denominator + this.denominator * other.numerator, this.denominator * other.denominator).minimals();
        }

    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        if (this.denominator == other.denominator)
            return new Fraction(this.numerator - other.numerator, other.denominator).minimals();
        else {
            return new Fraction(this.numerator * other.denominator - this.denominator * other.numerator, this.denominator * other.denominator).minimals();
        }

    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator).minimals();
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator).minimals();
    }

    public boolean equals(Fraction other) {
        if (this.subtract(other).numerator == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Fraction a = new Fraction(12, 5);
        Fraction b = new Fraction(18, 7);

        System.out.println(a.divide(b).Infor());

    }
}
