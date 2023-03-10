package ra;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String phone;
    private String address;
    private float html;
    private float css;
    private float javascript;
    private float avgMark;

    public Student() {

    }

    public Student(String studentId, String studentName, int age, boolean sex, String phone, String address, float html, float css, float javascript) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.html = html;
        this.css = css;
        this.javascript = javascript;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public float getCss() {
        return css;
    }

    public void setCss(float css) {
        this.css = css;
    }

    public float getJavascript() {
        return javascript;
    }

    public void setJavascript(float javascript) {
        this.javascript = javascript;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public void inputData(Scanner sc) {
        while (true) {
            System.out.println("Nh???p m?? sinh vi??n : ");
            String maSv = sc.nextLine();
            if (maSv.length() == 5 && maSv.startsWith("RA")) {
                this.studentId = maSv;
                break;
            } else {
                System.err.println("Kh??ng ????ng ?????nh d???ng , vui l??ng nh???p m?? sv b???t ?????u b???ng RA v?? c?? 5 k?? t???");
            }
        }
        do {
            System.out.println("Nh???p t??n sinh vi??n :");
            String studentName = sc.nextLine();
            if (studentName.length() >= 20 && studentName.length() <= 50) {
                this.studentName = studentName;
                break;
            } else {
                System.err.println("T??n kh??ng ????ng, nh???p l???i");
            }
        } while (true);
        while (true) {
            System.out.println("Nh???p tu???i");
            int age = Integer.parseInt(sc.nextLine());
            if (age > 18) {
                this.age = age;
                break;
            } else {
                System.err.println("kh??ng ????? tu???i");
            }
        }
        System.out.println("nh???p gi???i t??nh");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        while (true) {
            System.out.println("Nh???p s??? ??i???n tho???i : ");
            String phone = sc.nextLine();
            if (phone.length() == 10 && phone.startsWith("0")) {
                this.phone = phone;
                break;
            } else {
                System.err.println("Kh??ng ????ng ?????nh d???ng ");
            }
        }
        System.out.println("nh???p ?????a ch???");
        this.address = sc.nextLine();
        while (true) {
            System.out.println("Nh???p ??i???m HTML");
            float html = Float.parseFloat(sc.nextLine());
            if (html >= 0 && html <= 10) {
                this.html = html;
                break;
            } else {
                System.err.println("Sai");
            }
        }

        while (true) {
            System.out.println("Nh???p ??i???m css");
            float css = Float.parseFloat(sc.nextLine());
            if (css >= 0 && css <= 10) {
                this.css = css;
                break;
            } else {
                System.err.println("Sai");
            }
        }
        while (true) {
            System.out.println("Nh???p ??i???m JavaScript");
            float javascript = Float.parseFloat(sc.nextLine());
            if (javascript >= 0 && javascript <= 10) {
                this.javascript = javascript;
                break;
            } else {
                System.err.println("Sai");
            }
        }
    }

    public void displayData() {
        System.out.printf("M?? sinh vi??n: %-10s T??n sinh vi??n: %-50s\n" +
                        "N??m sinh: %13d Gi???i t??nh: %-10s ??i???n tho???i: %-10s\n" +
                        "?????a ch???: %-46s ??i???m TB: %-2.1f\n", this.studentId,
                this.studentName, 2024 - this.age, this.sex ? "Nam" : "N???",
                this.phone, this.address, this.avgMark);
        System.out.println("-------------------------------------------------------------------------");
    }

    public void calAvgMark() {
        this.avgMark = (this.html + this.css + 2 * this.javascript) / 4;
    }
}