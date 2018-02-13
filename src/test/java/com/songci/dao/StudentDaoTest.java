package com.songci.dao;

import com.songci.entity.Student;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Year;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by SongLiuxin on 2018/2/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTest {
    @Autowired
    private StudentDao studentDao;

    //@Ignore 用法很简单, 如果你的测试用例还没有准备好而不想被执行, 又不想删掉或注释掉, 可以使用 @Ignore 标注来忽略测试。
    @Test
    @Ignore
    public void queryStudent() throws Exception {
        List<Student> list = studentDao.queryStudent();
        list.forEach(x->System.out.println(x.toString()));
    }

    @Test
    public void queryStudentById() throws Exception {
        System.out.println(studentDao.queryStudentById(2));
    }

    @Test
    public void insertStudent() throws Exception {
        for (int i=0;i<10;i++){
            Student student = new Student("小张"+i,1);
            studentDao.insertStudent(student);
            System.out.println(student.toString());
        }
    }

    @Test
    public void updateStudent() throws Exception {
        System.out.println(studentDao.updateStudent(new Student(1,"张张1" ,2)));
    }

    @Test
    public void deleteStudent() throws Exception {
        System.out.println(studentDao.deleteStudent(3));
    }

}