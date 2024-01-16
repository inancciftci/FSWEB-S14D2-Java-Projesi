import com.inanc.model.*;

public class Main {
    public static void main(String[] args) {
        Ceiling ceiling = new Ceiling(150, PaintColor.RED);
        Bed bed = new Bed("Queen Size", 4, 160, 3, 1);
        Lamp lamp = new Lamp(true, LampType.FLUORESCENT, 6);
        Wardrobe wardrobe = new Wardrobe(60, 180, 15.5);
        Carpet carpet = new Carpet(150, 150, PaintColor.GRAY);

        Bedroom bedroom1 = new Bedroom("Bedroom 1", new Wall("Right"), new Wall("Left"),
                 new Wall("Front"), new Wall("Back"), ceiling, bed, lamp, wardrobe, carpet);


        carpet.lying();
        bed.make();
        lamp.turnOn();
        wardrobe.add();
        ceiling.create();

        System.out.println(bedroom1);
    }
}