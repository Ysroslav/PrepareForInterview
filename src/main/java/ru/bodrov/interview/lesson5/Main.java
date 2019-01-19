package ru.bodrov.interview.lesson5;

import org.hibernate.Session;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Session session = StudentSession.getSessionFactory().openSession();
        StudentDAO dao = new StudentDAO(session);

        //добавляем 1000 записей
        session.beginTransaction();
        for(int i = 0; i<1000; i++) {
            dao.persist(new TblStudent("Student" + i, 5));
        }
        session.getTransaction().commit();
        // проверка работы метода findAll
        List<TblStudent> students = dao.findAll();
        System.out.println(students.size());

        TblStudent student = new TblStudent("Sidorov Ivan", 2);
        session.beginTransaction();
        dao.persist(student);
        student.setMark(3);
        dao.update(student);
        session.getTransaction().commit();
        System.out.println(dao.findById(student.getId()).toString());
        session.close();
    }
}
