package main;

import Entity.player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import map_coding.TileManage;
import object.SuperObject;

public class GamePanel extends JPanel implements Runnable {

    // SCREEEN SETTING
    final int originalTileSize = 16; //16x16 tamaño de entidades
    final int scale = 3;

    public final int tileSize = originalTileSize * scale; //48x48 multiplicador para ajustar el tamaño del as entidades
    public final int maxScreenCol = 16; //Tamaño de ancho de la pantalla
    public final int maxScreenRow = 12; //Tamaño de alto de la pantalla
    public final int screenWidth = tileSize * maxScreenCol; //Ajustamos el tamaño de ancho en pixeles de la pantalla 768
    public final int screenHeight = tileSize * maxScreenRow; //Ajustamos el tamaño de alto en pixeles de la pantalla 576
    public final int secMilisec = 1000000000;

    //World settings
    public final int maxWorldCol = 45;
    public final int maxWorldRow = 45;
    public final int worldWidth = tileSize * maxWorldCol;
    public final int worldHeight = tileSize * maxWorldRow;
    
    int FPS = 60;

    // System
    TileManage tileM = new TileManage(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    public CollisionChecker cChecker = new CollisionChecker(this);
    public AssetSetter aSetter = new AssetSetter(this);
    public UI ui = new UI(this);
    
    // Entidades
    public player player = new player(this,keyH);
    public SuperObject obj[] = new SuperObject[200];
    

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); //Dimensiones de la pantalla
        this.setBackground(Color.black); //Color de fondo de la pantalla
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }
    
    public void setupGame() {
        
        aSetter.setObject();
        
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = secMilisec / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;
        

        while (gameThread != null) {

            currentTime = System.nanoTime(); // Tiempo actual en nano segundos (mayor precision)

            delta += (currentTime - lastTime) / drawInterval; // Calculo para sacar el numero de fotogramas por segundo que tiene que imprimir el programa
            timer += (currentTime - lastTime);
            lastTime = currentTime; 

            if (delta >= 1) {
                // 1 Update information as character position
                update();
                // 2 draw the screen with the update information
                repaint();
                delta--;
                drawCount++;
            }
            
            if (timer >= secMilisec) {
                System.out.println("FPS: " + drawCount);
                drawCount = 0;
                timer = 0;              
            }

        }
    }

    public void update() {
       
        player.update();
        
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g); // la clase se usa usando la funcion repaint();

        Graphics2D g2 = (Graphics2D) g;

        //Tile
        tileM.draw(g2);
        
        //Object
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] != null) {
                obj[i].draw(g2, this);
            }
        }
        
        //Player
        player.draw(g2);
        
        //Ui
        ui.draw(g2);

        g2.dispose();
        
    }

}
