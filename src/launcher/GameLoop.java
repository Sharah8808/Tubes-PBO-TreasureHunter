package launcher;
import java.awt.Graphics;

public interface GameLoop {
    
    public void tick();
    public void render(Graphics g);
}
