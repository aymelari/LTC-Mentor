package lesson20;

import java.util.Comparator;

public class customer  {
    private String name;
    private Integer age;
  private  Integer id;
    private String education;

    public customer(String name, Integer age, Integer id, String education) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public String getEducation() {
        return education;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEducation(String education) {
        this.education = education;
    }


    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", education='" + education + '\'' +
                '}';
    }



}
