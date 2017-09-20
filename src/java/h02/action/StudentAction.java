package h02.action;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import h02.entity.Student;
import h02.service.StudentDBOImpl;

public class StudentAction extends ActionSupport {

    private Student stu;
    private int ido;
    private String stuname;
    private int sdo;
    private List stulist = new ArrayList<Student>();

    public int getSdo() {
        return sdo;
    }

    public void setSdo(int sdo) {
        this.sdo = sdo;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public List getStulist() {
        return stulist;
    }

    public void setStulist(List stulist) {
        this.stulist = stulist;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }
    StudentDBOImpl d = new StudentDBOImpl();

    public String insert() {
        boolean t = d.insertDB(stu);
        if (t == true) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String search_student() {

        stulist = d.searchDB(ido);
        System.out.println(stulist);
        for (int i = 0; i < stulist.size(); i++) {
            System.out.println(stulist.get(i));
        }
        if (stulist.isEmpty()) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public String show_all_student() {
        stulist = d.showallDBO();
        if (stulist.isEmpty()) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public String updatename() {
        System.out.println(ido + "" + stuname);
        stulist = d.updateDBO(ido, stuname);
        System.out.println(stulist);
        if (!(stulist.isEmpty())) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String deletedata() {
        stulist = d.deleteDBO(sdo);
        System.out.println(stulist);
        if (stulist.isEmpty()) {
            return ERROR;
        } else {
            return SUCCESS;
        }
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }
}
