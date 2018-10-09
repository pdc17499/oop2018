package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String id;
    private String name;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group=group;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    Student() {

        name ="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        this.name=n;
        this.id=sid;
        this.email=em;
        this.group="INT22041";

    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        this.name=s.name;
        this.id=s.id;
        this.email=s.email;
        this.group=s.group;

    }

    String getInfo() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
        return null; // xóa dòng này sau khi cài đặt
         }
}
