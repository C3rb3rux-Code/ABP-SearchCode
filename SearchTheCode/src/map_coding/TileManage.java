package map_coding;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import main.GamePanel;

public final class TileManage {

    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[][];

    public TileManage(GamePanel gp) {
        this.gp = gp;

        tile = new Tile[10];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();

        loadMap();
                
    }

    public void getTileImage() {

        try {

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("../map_base/rockTile.png"));
            tile[1].collision = true;
          
            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("../map_base/wood.png"));
                      

        } catch (IOException e) {
            System.out.println("Fallo de escritura");
        }
    }

    public void loadMap() {
        try {
            InputStream is = getClass().getResourceAsStream("../map/Mapa_45x45.txt");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                int col = 0;
                int row = 0;

                while (col < gp.maxWorldCol && row < gp.maxWorldRow) {

                    String line = br.readLine();

                    while (col < gp.maxWorldCol) {
                        String numbers[] = line.split(" ");

                        int num = Integer.parseInt(numbers[col]);

                        mapTileNum[col][row] = num;
                        col++;
                    }
                    if (col == gp.maxWorldCol) {
                        col = 0;
                        row++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error de escritura");
        }
    }

    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) { //aqui

            int tileNum = mapTileNum[worldCol][worldRow];

            //Creador de camera para que siga al personaje y cargue el mapa
            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX
                && worldX - gp.tileSize < gp.player.worldX + gp.player.screenX
                && worldY + gp.tileSize > gp.player.worldY - gp.player.screenY
                && worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
                g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }

            worldCol++;

            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }
        }
    }
}