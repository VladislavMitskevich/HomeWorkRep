package hw_06.reflection;

public class ModelClass {
    private String name;

    public ModelClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }
}
