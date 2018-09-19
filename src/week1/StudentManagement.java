package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    int max=100;
       Student[] students=new Student[max];

    public boolean sameGroup(Student s1, Student s2) {
      return (s1.getGroup().equals(s2.getGroup()));

    }

    void studentsByGroup() {

        for (int i=0;i<max-1;i++)
            for (int j=1;j<max;j++)
                if (students[i].getGroup().compareTo(students[j].getGroup())<0) {
                    Student A = new Student();
                    A = students[i];
                    students[i] = students[j];
                    students[j] = A;
                }

        String B = " ";
         int i=0;

        while (i<max) {
            if (students[i].getGroup().equals(B) == false) {
                B = students[i].getGroup();
                System.out.println("Cac sinh vien thuoc lop " + B + "la: ");
                System.out.println(students[i]);
            }
            else {
                System.out.println(students[i]);
            }
            i++;
        }
    }


    void removeStudent(String id) {

        for( int i = 0 ; i < max ; i ++ )
        {
            int sinhvienthuN;
            if (students[i].getId().equals(id) )
            {
                sinhvienthuN = i;

                for(int j = i ; j < max-1  ; j++)
                {
                    students[j] = students[j+1];
                }

                max = max - 1;
            }
        }
    }

    public static void main(String[] args) {

        Student a=new Student();
        a.setName("Chu Duc Phuc");
        a.setEmail("vituonglaiconem@gmail.com");
        a.setGroup("INT2204");
        a.setId("17020957");

        System.out.println("ten Sv:" + a.getName());
        a.getInfo();

        //lam cau 8:
        Student b=new Student();
        b.getInfo();

        Student c=new Student("Phuc ", "17020957", "abcxyz@gmail.com");
            c.getInfo();

        Student d=new Student(a);
            d.getInfo();

        // cau10
        Student s01 = new Student("A", "17020711", "num1@gmail.com");

        Student s02 = new Student("B", "17020721", "num2@gmail.com");

        Student s03 = new Student();
         s03.setGroup("INT22042");
        StudentManagement ss = new StudentManagement();
        System.out.println( "Student 1vs2 " +ss.sameGroup(s01, s02));
        System.out.println("Student 1vs3 " + ss.sameGroup(s01, s03));
        System.out.println("Student 2vs3 " + ss.sameGroup(s02, s03));






    }
}
