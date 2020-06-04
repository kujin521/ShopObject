package bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

/**
 * 类：
 * 编写人：kujin
 * 创建时间：2020/6/4
 * 修改时间：2020/6/4
 */
@Entity
public class Students {
    private String sid;
    private String sname;
    private String gender;
    private Date birthday;
    private String address;

    @Id
    @Column(name = "sid")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(sid, students.sid) &&
                Objects.equals(sname, students.sname) &&
                Objects.equals(gender, students.gender) &&
                Objects.equals(birthday, students.birthday) &&
                Objects.equals(address, students.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, gender, birthday, address);
    }
}
