package com.ljc.learn.mongodb;

import com.ljc.learn.mongodb.dao.StudentDao;
import com.ljc.learn.mongodb.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class LearnMongodbApplicationTests {


    @Autowired
    private StudentDao studentDao;

    /**
     * 查询所有信息
     */
    @Test
    public void findAll() {
        List<Student> all = studentDao.findAll();
        System.out.println(all.size());
    }

    /**
     * 新增信息
     */
    @Test
    public void save() {
        Student student = new Student();
        student.setId(1L);
        student.setName("宋人头");
        studentDao.save(student);
    }

    /**
     * 修改信息
     */
    @Test
    public void update() {
        Student student = new Student();
        student.setId(2l);
        student.setName("吴很帅");
        studentDao.update(student);
    }

    /**
     * 删除信息
     */
    @Test
    public void delete() {
        studentDao.delete(3);
    }

}
