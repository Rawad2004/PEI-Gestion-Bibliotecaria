package com.mycompany.components;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RoundedTextField extends JTextField {
    private int borderRadius = 15;
    private Color borderColor = new Color(183, 183, 183);
    private final Color activeBorderColor = new Color(10, 10, 10);
    private final Color inactiveBorderColor = new Color(183, 183, 183);
    private Color placeholderColor = new Color(160, 160, 160);

    public RoundedTextField() {
        super();
        setOpaque(false);
        setBorder(new EmptyBorder(10, 15, 10, 15));
        
        // Listener para el foco
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                setBorderActive(true);
            }

            @Override
            public void focusLost(FocusEvent e) {
                setBorderActive(false);
            }
        });

        // Listener para clicks en cualquier parte
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (!contains(e.getPoint())) {
                    setFocusable(false);
                    setFocusable(true); // Fuerza la pérdida de foco
                }
            }
        });
    }

    private void setBorderActive(boolean active) {
        borderColor = active ? activeBorderColor : inactiveBorderColor;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);
        
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);
        
        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        if (getText().isEmpty() && getClientProperty("JTextField.placeholderText") != null) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g2.setColor(placeholderColor);
            
            Insets insets = getInsets();
            FontMetrics fm = g2.getFontMetrics();
            int x = insets.left;
            int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            
            g2.drawString((String) getClientProperty("JTextField.placeholderText"), x, y);
            g2.dispose();
        }
    }

   public int getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
        repaint();
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint();
    }

    public Color getPlaceholderColor() {
        return placeholderColor;
    }

    public void setPlaceholderColor(Color placeholderColor) {
        this.placeholderColor = placeholderColor;
        repaint();
    }

    public Color getActiveBorderColor() {
        return activeBorderColor;
    }

    public Color getInactiveBorderColor() {
        return inactiveBorderColor;
    }
}

    
