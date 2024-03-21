package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Obj_boots extends SuperObject {
    
    public Obj_boots() {
        name = "boots";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("../objects/boots.png"));
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
        collision = true;
    }
}
