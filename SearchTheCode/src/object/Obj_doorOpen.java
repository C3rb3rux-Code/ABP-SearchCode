package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Obj_doorOpen extends SuperObject {
    
    
    public Obj_doorOpen() {
        name = "DoorOpen";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("../objects/doorOpen.png"));
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
        collision = false;
    }  
}
