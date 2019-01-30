package cn.yic.data.entity;

public class Person {

    private String name;
    private String gender;
    private int age;
    private String schoolName;

    public Person() {
    }

    public Person(String name, String gender, int age, String schoolName) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
