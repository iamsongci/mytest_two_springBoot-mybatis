package com.songci.service.impl;

import com.songci.dao.StudentDao;
import com.songci.entity.Student;
import com.songci.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by SongLiuxin on 2018/2/9.
 */
@Service("StudentService")
public class StudentServiceImpl  implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> queryStudent() {
        return studentDao.queryStudent();
    }

    @Override
    public Student queryStudentById(int studentId) {
        return studentDao.queryStudentById(studentId);
    }

    @Override
    public int insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int deleteStudent(int studentId) {
        return studentDao.deleteStudent(studentId);
    }
}
