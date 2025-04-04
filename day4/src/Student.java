//LỚP MÔ TẢ SINH VIÊN (THÔNG TIN CÁ NHÂN + ĐIỂM SỐ)

public class Student {
    private String id; // mã sinh viên
    private String name; // Tên sinh viên
    private int age; // tuổi sinh viên
    private boolean gender; // giới tính (true: Nam | false: Nữ)
    private double html; // điểm môn HTML
    private double reactjs; // điểm môn reactjs
    private double mysql; // điểm môn MySQL


    // Tạo các Constructor cần thiết
    public Student() {
    }

    public Student(String id, String name, int age, boolean gender, double html, double reactjs, double mysql) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.html = html;
        this.reactjs = reactjs;
        this.mysql = mysql;
    }

    // <editor-fold> Getter/Setter
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getReactjs() {
        return reactjs;
    }

    public void setReactjs(double reactjs) {
        this.reactjs = reactjs;
    }

    public double getMysql() {
        return mysql;
    }

    public void setMysql(double mysql) {
        this.mysql = mysql;
    }
    // </editor-fold>

    public double getAverageScore() {
        return (html + reactjs + mysql) / 3;
    }
}