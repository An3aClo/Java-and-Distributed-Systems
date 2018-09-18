package animal;

public class Animal {

    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void run() {
        new Animal().getName();// this is to get the method in another method using a constructer 
   
    }

    public Animal() {
    }

    //Use insert code function by right clicking to get the getters setters and constructers
    public static void main(String[] args) {
        // Animal a = new Animal();
        System.out.println(new Animal().getName());// ----this is a shorter method
    }

}
