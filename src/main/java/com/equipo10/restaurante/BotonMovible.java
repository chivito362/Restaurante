
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;

public class BotonMovible extends JButton {
    private Point initialClick;
    private static TransferHandler handler = new TransferHandler("text");

    public BotonMovible(String text) {
        super(text);
        setFocusable(true);
        setTransferHandler(handler);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getX() - initialClick.x;
                int deltaY = e.getY() - initialClick.y;
                setLocation(getX() + deltaX, getY() + deltaY);
            }
        });
    }
}