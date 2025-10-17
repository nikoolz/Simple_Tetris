package main;

import java.awt.*;

public class PlayManager {

    // Main Play Area
    final int WIDTH = 360;
    final int HEIGHT = 600;
    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;

    public PlayManager() {

        // Main Play Area Frame
        left_x = (GamePanel.WIDTH/2) - (WIDTH / 2);
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGHT;
    }
    public void update() {

    }
    public void draw(Graphics2D g2){
        // Draw Play Area Frame
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(left_x-4, top_y-4, WIDTH+8, HEIGHT+8);
    }
}
