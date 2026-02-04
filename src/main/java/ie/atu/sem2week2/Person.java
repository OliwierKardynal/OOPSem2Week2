package ie.atu.sem2week2;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Person() {
        this.name = "";
        this.age = 0;
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
