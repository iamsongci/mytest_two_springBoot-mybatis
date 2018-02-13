package com.songci.service;

import com.songci.entity.Student;

import java.util.List;

/**
 * Created by SongLiuxin on 2018/2/9.
 */
public interface StudentService {
    /**
     * 列出学生列表
     * @return
     */
    List<Student> queryStudent();

    /**
     * 根据学生Id查询
     * @param studentId
     * @return
     */
    Student queryStudentById(int studentId);

    /**
     * 插入学生信息
     * @param student
     * @return
     */
    int insertStudent(Student student);

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    int updateStudent(Student student);

    /**
     * 删除信息
     * @param studentId
     * @return
     */
    int deleteStudent(int studentId);
}
