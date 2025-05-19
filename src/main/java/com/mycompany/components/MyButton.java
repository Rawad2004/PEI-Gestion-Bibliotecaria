package com.mycompany.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class MyButton extends JButton {

    // Colores personalizados
    private final Color bgColorNormal = new Color(241, 241, 241); // Fondo por defecto
    private final Color textColorNormal = new Color(114, 114, 114); // Texto por defecto
    private final Color textColorActive = new Color(10, 10, 10); // Texto activo/hover
    private final Color bgColorSelected = Color.WHITE; // Fondo seleccionado

    private boolean selected = false; // Estado de selección
    private final int radius = 11; // Border radius
    private String pageTitle;

    public void setPageTitle(String title) {
        this.pageTitle = title;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public MyButton() {

        // Configuración inicial
        setForeground(textColorNormal);

        setBackground(bgColorNormal);

        setContentAreaFilled(
                false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setPreferredSize(
                new Dimension(194, 48));
        setFocusPainted(
                false);

        // Eventos del mouse
        addMouseListener(
                new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e
            ) {
                setForeground(textColorActive);
                if (!selected) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }
            }

            @Override
            public void mouseExited(MouseEvent e
            ) {
                if (!selected) {
                    setForeground(textColorNormal);
                }
            }
        }
        );
    }

    // Método para cambiar estado de selección
    public void setSelected(boolean selected) {
        this.selected = selected;
        if (selected) {
            setBackground(bgColorSelected);
            setForeground(textColorActive);
        } else {
            setBackground(bgColorNormal);
            setForeground(textColorNormal);
        }
        repaint();
    }

    public boolean isSelected() {
        return selected;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Pintar fondo redondeado
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Pintar texto
        g2.setColor(getForeground());
        g2.setFont(getFont());

        // Centrar texto
        String text = getText();
        int textWidth = g2.getFontMetrics().stringWidth(text);
        int x = (getWidth() - textWidth) / 2;
        int y = (getHeight() + g2.getFontMetrics().getAscent() - g2.getFontMetrics().getDescent()) / 2;

        g2.drawString(text, x, y);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Intencionalmente vacío para eliminar el borde
    }
}
