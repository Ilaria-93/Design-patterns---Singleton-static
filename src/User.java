public class User {
    private String name;
    private int age;

    public User() {
        this.name = "Default Name";
        this.age = 0;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void printNameAge() {
        System.out.println("The name is " + name + ", and the age is " + age + ".");
    }
}
