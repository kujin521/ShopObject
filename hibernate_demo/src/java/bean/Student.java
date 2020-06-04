package bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

/**
 * 类：
 * 编写人：kujin
 * 创建时间：2020/6/4
 * 修改时间：2020/6/4
 */

public class Student {
    private int id;
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
