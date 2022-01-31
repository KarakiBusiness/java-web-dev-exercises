package exercises.technology2;

public class Laptop extends Computer{
    private double weight;

    public Laptop(int storage, int ram, String graphicsCard, double weight) {
        super(storage, ram, graphicsCard);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isClunky(){
        if (weight>15){
            return true;
        }else{
            return false;
        }
    }






}
