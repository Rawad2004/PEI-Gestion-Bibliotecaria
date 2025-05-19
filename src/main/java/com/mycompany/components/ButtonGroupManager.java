package com.mycompany.components;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class ButtonGroupManager {
    private final List<MyButton> buttons = new ArrayList<>();
    private JLabel titleLabel;
    
     public ButtonGroupManager(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }
    

    public void addButton(MyButton button, String pageTitle) {
        if (!buttons.contains(button)) {
            buttons.add(button);
            button.addActionListener(e -> {
                buttons.forEach(b -> b.setSelected(b == button));
                updatePageTitle(pageTitle); // Actualiza el título al hacer clic
            });
        }
    }
    
    private void updatePageTitle(String title) {
        if (titleLabel != null) {
            titleLabel.setText(title);
            // Opcional: puedes agregar efectos de transición aquí
        }
    }

    public void removeButton(MyButton button) {
        buttons.remove(button);
    }

    public void clearSelection() {
        buttons.forEach(b -> b.setSelected(false));
    }
}