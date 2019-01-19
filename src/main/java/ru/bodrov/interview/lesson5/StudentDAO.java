package ru.bodrov.interview.lesson5;

import org.hibernate.Session;

import java.util.List;

public class StudentDAO {

    private Session session;

    public StudentDAO(Session session){
        this.session = session;
    }

    public TblStudent findById(String id){
        TblStudent student = session.get(TblStudent.class, id);
        return student;
    }

    public void delete(TblStudent student){
        session.delete(student);
    }

    public List<TblStudent> findAll(){
        List<TblStudent> students = session.createQuery("from TblStudent").list();
        return students;
    }

    public void deleteAll(){
        List<TblStudent> students = findAll();
        for(TblStudent student : students){
            delete(student);
        }
    }

    public void update(TblStudent student){
        session.update(student);
    }

    public void persist(TblStudent student){
        session.save(student);
    }
}
