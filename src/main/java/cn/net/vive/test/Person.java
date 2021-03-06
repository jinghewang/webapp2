package cn.net.vive.test;

/**
 * Created by robin on 2015/8/22.
 */
public class Person {

    public Person(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String id, String name) {

        this.id = id;
        this.name = name;
    }

    public Person(String id) {

        this.id = id;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    private String id;
    private String name;
    private Integer age;
}
