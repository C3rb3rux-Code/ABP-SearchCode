package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import object.Obj_key;

public class UI {
    GamePanel gp;
    Font arial_40;
    BufferedImage keyImage;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    
    public UI (GamePanel gp) {
        this.gp = gp;
        
        arial_40 = new Font("Arial", Font.PLAIN, 30);
        
        Obj_key key = new Obj_key();
        keyImage = key.image;
    }
    public void showMessage(String text) {
        
        message = text;
        messageOn = true;
        
    }
    public void draw(Graphics2D g2) {
        
        g2.setFont(arial_40);
        g2.setColor(Color.white);
        g2.drawString("x " + gp.player.hasKey, 70, 60);
        g2.drawImage(keyImage, gp.tileSize / 2, gp.tileSize / 2, gp.tileSize, gp.tileSize, null);
        
        if (messageOn == true) {
            
            g2.drawString(message, 50, 110);
            
            messageCounter++;
            
            if(messageCounter > 120) {
                messageCounter = 0;
                messageOn = false;
            }
            
        }
    }
}
