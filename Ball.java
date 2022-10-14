import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x;
    private int y;
    private int d;
    private Color color;

    public Ball(int x, int y, int d, Color color) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getD() {
        return d;
    }

    public Color getColor () {
        return color;
    }

    public boolean isInBall(int x, int y) {
        int centerX = this.x + d / 2;
        int centerY = this.y + d / 2;
        int distance = (int) Math.sqrt(Math.pow(centerX - x, 2) + Math.pow(centerY - y, 2));
        return distance <= d / 2;
    }
    public void paint(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(x, y, d, d);
        graphics.setColor(Color.black);
        graphics.drawOval(x, y, d, d);
    }
}

