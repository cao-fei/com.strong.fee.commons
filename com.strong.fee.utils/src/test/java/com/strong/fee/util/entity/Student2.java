package com.strong.fee.util.entity;

/**
 * author: 小殊
 * create: 2018/7/23 上午11:14
 */
public class Student2 {

    private int id;
    private int age;
    private String name;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student2)) return false;

        Student2 student2 = (Student2) o;

        if (getId() != student2.getId()) return false;
        if (getAge() != student2.getAge()) return false;
        return getName() != null ? getName().equals(student2.getName()) : student2.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getAge();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}