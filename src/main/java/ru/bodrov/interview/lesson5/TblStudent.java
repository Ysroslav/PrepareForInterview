package ru.bodrov.interview.lesson5;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "tbl_student", schema = "db_student")
public class TblStudent {

    @Id
    private String id = UUID.randomUUID().toString();;

    @Column(name = "name_student")
    private String nameStudent;

    @Column(name = "mark")
    private int mark;

    public TblStudent(){}

    public TblStudent(String nameStudent){
        this.nameStudent = nameStudent;
    }

    public TblStudent(String nameStudent, int mark){
        this.nameStudent = nameStudent;
        this.mark = mark;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblStudent that = (TblStudent) o;

        if (mark != that.mark) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nameStudent != null ? !nameStudent.equals(that.nameStudent) : that.nameStudent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nameStudent != null ? nameStudent.hashCode() : 0);
        result = 31 * result + mark;
        return result;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------Student Information ---------\n");
        sb.append("ID :" + getId() + "\n");
        sb.append("Name:" + getNameStudent() + "\n");
        sb.append("Mark:" + getMark() + "\n");
        sb.append("********************************");
        return sb.toString();
    }
}
