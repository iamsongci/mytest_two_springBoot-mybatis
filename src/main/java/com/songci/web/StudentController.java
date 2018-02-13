package com.songci.web;

import com.songci.entity.Student;
import com.songci.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by SongLiuxin on 2018/2/9.
 */

//@RestController  =  @Controller  +  @ResponseBody
@RestController
@RequestMapping("/superadmin/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "studentList",method = RequestMethod.GET)
    private Map<String,Object> listStudent(){
        Map<String ,Object> modelList = new HashMap<String,Object>();
        List<Student> list = studentService.queryStudent();
        modelList.put("stuList",list);
        return modelList;
    }

    @RequestMapping(value = "getStudentById",method = RequestMethod.GET)
    private Map<String,Object> getStudentById(@RequestParam("stuId")Integer stuId){
        Map<String ,Object> model = new HashMap<String,Object>();
        Student student = studentService.queryStudentById(stuId);
        model.put("student",student);
        return model;
    }

    @RequestMapping(value = "addStudent",method = RequestMethod.POST)
    private Map<String,Object> addStudent(@RequestBody Student student){
        Map<String ,Object> model = new HashMap<String,Object>();
        model.put("success",studentService.insertStudent(student)==1?true:false);
        return model;
    }

    @RequestMapping(value = "modifyStudent",method = RequestMethod.POST)
    private Map<String,Object> modifyStudent(@RequestBody Student student){
        Map<String ,Object> model = new HashMap<String,Object>();
        model.put("success",studentService.updateStudent(student)==1?true:false);
        return model;
    }

    @RequestMapping(value = "deleteStudent",method = RequestMethod.POST)
    private Map<String,Object> deleteStudent(@RequestParam("stuId") Integer stuId){
        Map<String ,Object> model = new HashMap<String,Object>();
        model.put("success",studentService.deleteStudent(stuId)==1?true:false);
        return model;
    }
}
