package exercises.technology2;

import org.junit.Test;

public class program {

    public static void main(String[] args) {
        Computer helios = new Computer(500, 16, "geo 3070 ");
        System.out.println("storage " + helios.getStorage());
        System.out.println("ram " + helios.getRam());
        helios.increaseStorage(250);
        helios.increaseRam(16);
        System.out.println("new Storage = " + helios.getStorage());
        System.out.println("new ram " + helios.getRam());

        Laptop heliosLaptop = new Laptop(500, 32, "rtx", 20);
        System.out.println(heliosLaptop.isClunky());
        System.out.println(heliosLaptop.getWeight());
        System.out.println(helios.getGraphicsCard());

        Smartphone samsung = new Smartphone(500, 16, "N/A", 32, 521);
        System.out.println(samsung.getNumOfPhotos());
        System.out.println(samsung.getNumOfApps());
        samsung.takePhoto();
        samsung.downloadApp();
        System.out.println(samsung.getNumOfPhotos());
        System.out.println(samsung.getNumOfApps());
        System.out.println(samsung.getId());

    }
}
