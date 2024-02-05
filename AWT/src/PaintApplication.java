import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PaintApplication extends Frame {
    private ArrayList<Point> points;
    private Color currentColor;
    private int brushSize;
    private boolean drawMode;

    public PaintApplication() {
        // Set frame properties
        setTitle("Paint Application");
        setSize(600, 400);
        setLayout(new BorderLayout());

        // Canvas for drawing
        Canvas canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                handleMousePress(e);
            }
        });
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                handleMouseDrag(e);
            }
        });
        add(canvas, BorderLayout.CENTER);

        // Panel for controls
        Panel controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        // Buttons for switching between draw and erase modes
        Button drawButton = new Button("Draw");
        drawButton.addActionListener(e -> setDrawMode(true));

        Button eraseButton = new Button("Erase");
        eraseButton.addActionListener(e -> setDrawMode(false));

        // Slider for adjusting brush size
        Label sizeLabel = new Label("Brush Size:");
        Scrollbar sizeSlider = new Scrollbar(Scrollbar.HORIZONTAL, 5, 1, 1, 20);
        sizeSlider.addAdjustmentListener(e -> setBrushSize(sizeSlider.getValue()));

        // Color picker
        Choice colorChoice = new Choice();
        colorChoice.add("Black");
        colorChoice.add("Red");
        colorChoice.add("Green");
        colorChoice.add("Blue");
        colorChoice.addItemListener(e -> setColor(colorChoice.getSelectedItem()));

        // Add controls to the panel
        controlPanel.add(drawButton);
        controlPanel.add(eraseButton);
        controlPanel.add(sizeLabel);
        controlPanel.add(sizeSlider);
        controlPanel.add(colorChoice);

        // Add control panel to the frame
        add(controlPanel, BorderLayout.SOUTH);

        // Initialize variables
        points = new ArrayList<>();
        currentColor = Color.BLACK;
        brushSize = 5;
        drawMode = true;

        // Close the application on window close
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    private void handleMousePress(MouseEvent e) {
        points.clear();
        points.add(new Point(e.getX(), e.getY()));
    }

    private void handleMouseDrag(MouseEvent e) {
        points.add(new Point(e.getX(), e.getY()));
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(currentColor);
        g2d.setStroke(new BasicStroke(brushSize, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }

    private void setBrushSize(int size) {
        brushSize = size;
    }

    private void setColor(String color) {
        switch (color) {
            case "Red":
                currentColor = Color.RED;
                break;
            case "Green":
                currentColor = Color.GREEN;
                break;
            case "Blue":
                currentColor = Color.BLUE;
                break;
            default:
                currentColor = Color.BLACK;
                break;
        }
    }

    private void setDrawMode(boolean draw) {
        drawMode = draw;
        if (drawMode) {
            currentColor = Color.BLACK;
        } else {
            currentColor = Color.WHITE;
        }
    }

    public static void main(String[] args) {
        new PaintApplication();
    }
}
