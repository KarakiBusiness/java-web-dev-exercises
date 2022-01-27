package exercises.technology;

public class Computer{
    private String name = "Desktop";
    private Integer weightInLbs = 20;
    private String cursor = "Mouse";

    public void moveCursor() {
        System.out.println(cursor + " item was moved ");
    }

    public void lift(){
        System.out.println("lifted " + weightInLbs + "pounds");
    }

    public void Computer(String name, Integer weightInLbs, String cursor){
        Computer newComputer = new Computer();
        this.name = name;
        this.weightInLbs = weightInLbs;
        this.cursor = cursor;
    }

    public static void main(String[] args) {
        Laptop.bend();
    }
}
