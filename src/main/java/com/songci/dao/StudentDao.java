package com.songci.dao;

import com.songci.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author SongLiuxin
 * @date 2018/2/8
 */
public interface StudentDao {
    /**
     * 列出学生列表
     * @return
     */
    List<Student>queryStudent();

    /**
     * 根据学生Id查询
     * @param studentId
     * @return
     */
    Student queryStudentById(@Param("id")int studentId);

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
    int deleteStudent(@Param("id") int studentId);
}
