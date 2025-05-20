/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.interfaces.DAOBooks;
import com.mycompany.pei.sbibliotecario.DAOBooksImpl;
import com.mycompany.pei.sbibliotecario.Dashboard;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Rawad
 */
public class Books extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Books() {
        initComponents();
        InitStyles();
        LoadBooks();
    }

    private void InitStyles() {
        bookSearch.putClientProperty("JTextField.placeholderText", "Ingrese el nombre del libro");
        bookSearch.setPlaceholderColor(new Color(183, 183, 183));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                requestFocus(); // Fuerza el foco al frame principal
            }
        });

        jTable1.setFont(new Font("Inter", Font.PLAIN, 11));

        JTableHeader header = jTable1.getTableHeader();
        header.setFont(new Font("Inter", Font.PLAIN, 11));
    }

    private void LoadBooks() {
        try {
            DAOBooks dao = new DAOBooksImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getId(), u.getTitle(), u.getDate(), u.getAuthor(), u.getCategory(), u.getEdit(), u.getLang(), u.getPages(), u.getDescription(), u.getEjemplares(), u.getStock(), u.getAvailable()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        Functions = new javax.swing.JPanel();
        searchButton = new com.mycompany.components.ButtonUse();
        bookSearch = new com.mycompany.components.RoundedTextField();
        addButton = new com.mycompany.components.ButtonUse();
        deleteButton = new com.mycompany.components.ButtonUse();
        editButton = new com.mycompany.components.ButtonUse();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new Color(0,0,0,0));
        setMinimumSize(new java.awt.Dimension(774, 612));
        setPreferredSize(new java.awt.Dimension(774, 612));

        bg.setBackground(new java.awt.Color(255, 255, 255,0));
        bg.setMinimumSize(new java.awt.Dimension(774, 612));
        bg.setPreferredSize(new java.awt.Dimension(774, 612));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(30, 30, 30));
        Welcome.setText("Libros");
        bg.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 33, 575, 42));

        Functions.setBackground(new java.awt.Color(255, 255, 255));

        searchButton.setForeground(new java.awt.Color(253, 253, 253));
        searchButton.setText("Buscar");
        searchButton.setColorClick(new java.awt.Color(42, 42, 42));
        searchButton.setColorOver(new java.awt.Color(42, 42, 42));
        searchButton.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        searchButton.setMaximumSize(new java.awt.Dimension(148, 45));
        searchButton.setMinimumSize(new java.awt.Dimension(148, 45));
        searchButton.setPreferredSize(new java.awt.Dimension(148, 45));
        searchButton.setRadius(40);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        bookSearch.setBackground(new Color(255,255,255,0));
        bookSearch.setForeground(new java.awt.Color(10, 10, 10));
        bookSearch.setBorderRadius(40);
        bookSearch.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        bookSearch.setMinimumSize(new java.awt.Dimension(645, 45));
        bookSearch.setPreferredSize(new java.awt.Dimension(645, 45));

        javax.swing.GroupLayout FunctionsLayout = new javax.swing.GroupLayout(Functions);
        Functions.setLayout(FunctionsLayout);
        FunctionsLayout.setHorizontalGroup(
            FunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunctionsLayout.createSequentialGroup()
                .addComponent(bookSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FunctionsLayout.setVerticalGroup(
            FunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunctionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bg.add(Functions, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 149, 740, 60));

        addButton.setForeground(new java.awt.Color(253, 253, 253));
        addButton.setText("Nuevo");
        addButton.setColorClick(new java.awt.Color(42, 42, 42));
        addButton.setColorOver(new java.awt.Color(42, 42, 42));
        addButton.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        addButton.setMaximumSize(new java.awt.Dimension(148, 45));
        addButton.setMinimumSize(new java.awt.Dimension(148, 45));
        addButton.setPreferredSize(new java.awt.Dimension(148, 45));
        addButton.setRadius(40);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        bg.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 148, 45));

        deleteButton.setForeground(new java.awt.Color(253, 253, 253));
        deleteButton.setText("Borrar");
        deleteButton.setColorClick(new java.awt.Color(42, 42, 42));
        deleteButton.setColorOver(new java.awt.Color(42, 42, 42));
        deleteButton.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        deleteButton.setMaximumSize(new java.awt.Dimension(148, 45));
        deleteButton.setMinimumSize(new java.awt.Dimension(148, 45));
        deleteButton.setPreferredSize(new java.awt.Dimension(148, 45));
        deleteButton.setRadius(40);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        bg.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 148, 45));

        editButton.setForeground(new java.awt.Color(253, 253, 253));
        editButton.setText("Editar");
        editButton.setColorClick(new java.awt.Color(42, 42, 42));
        editButton.setColorOver(new java.awt.Color(42, 42, 42));
        editButton.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        editButton.setMaximumSize(new java.awt.Dimension(148, 45));
        editButton.setMinimumSize(new java.awt.Dimension(148, 45));
        editButton.setPreferredSize(new java.awt.Dimension(148, 45));
        editButton.setRadius(40);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        bg.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 148, 45));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(740, 320));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(740, 320));

        jTable1.setFont(new java.awt.Font("Inter", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Fecha de Pub.", "Autor", "Categoría", "Edición", "Idioma", "Páginas", "Descripción", "Ejemplaresl", "Stock", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 215, 740, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
      try {
          
          if(bookSearch.getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Debes ingresar el nombre del usuario a buscar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
          
            DAOBooks dao = new DAOBooksImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            dao.listar(bookSearch.getText()).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getTitle(), u.getDate(), u.getAuthor(), u.getCategory(), u.getEdit(), u.getLang(), u.getPages(), u.getDescription(), u.getEjemplares(), u.getStock(), u.getAvailable()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Dashboard.ShowJPanel(new UpBooks());
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DAOBooks dao = new DAOBooksImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRows().length < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más libros a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i : jTable1.getSelectedRows()) {
                try {
                    dao.eliminar((int) jTable1.getValueAt(i, 0));
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            try {
                int bookId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                DAOBooks dao = new DAOBooksImpl();
                Dashboard.ShowJPanel(new UpBooks(dao.getBookById(bookId)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el libro a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Functions;
    private javax.swing.JLabel Welcome;
    private com.mycompany.components.ButtonUse addButton;
    private javax.swing.JPanel bg;
    private com.mycompany.components.RoundedTextField bookSearch;
    private com.mycompany.components.ButtonUse deleteButton;
    private com.mycompany.components.ButtonUse editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.mycompany.components.ButtonUse searchButton;
    // End of variables declaration//GEN-END:variables
}
