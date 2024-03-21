package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame window = new JFrame(); //Libreria de Interfaz
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Añadimos la X para cerrar el programa
        window.setResizable(false); //Eliminamos la posibilidad de modificar el tamaño de la pantalla
        window.setTitle("2D Adventure"); //Añadimos el título del Programa
        
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanel.setupGame();
        gamePanel.startGameThread();
        
    }
}
