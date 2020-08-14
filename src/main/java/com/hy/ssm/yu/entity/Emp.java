package com.hy.ssm.yu.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yukangze
 * @since 2020-07-27
 */
public class Emp extends Model<Emp> {

    private static final long serialVersionUID = 1L;

    private String name;

    private String sex;

    private Integer age;

    /**
     * 岗位
     */
    private String postno;

    /**
     * 工资
     */
    private Integer sal;

    /**
     * 部门编号
     */
    private Integer deptno;

    /**
     * 证件照片
     */
    private String picture;

    /**
     * 入职日期
     */
    private Date hiredate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String getPostno() {
        return postno;
    }

    public void setPostno(String postno) {
        this.postno = postno;
    }
    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }
    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Emp{" +
        "name=" + name +
        ", sex=" + sex +
        ", age=" + age +
        ", postno=" + postno +
        ", sal=" + sal +
        ", deptno=" + deptno +
        ", picture=" + picture +
        ", hiredate=" + hiredate +
        "}";
    }
}
