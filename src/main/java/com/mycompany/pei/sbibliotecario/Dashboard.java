package com.mycompany.pei.sbibliotecario;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mycompany.components.ButtonGroupManager;
import com.mycompany.views.Books;
import com.mycompany.views.Lendings;
import com.mycompany.views.Principal;
import com.mycompany.views.Reports;
import com.mycompany.views.Returns;
import com.mycompany.views.Users;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Rawad
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private ButtonGroupManager buttonGroup;

    public Dashboard() throws Exception {
        initComponents();
        InitStyles();
        setupButtonGroup();
        SetDate();
        initContent();

    }

    private void initContent() throws Exception {
        ShowJPanel(new Principal());
    }

    public static void ShowJPanel(JPanel p) {
        p.setSize(774, 612);
        p.setLocation(0, 0);
        
        Print.removeAll();
        Print.add(p, BorderLayout.CENTER);
        Print.revalidate();
        Print.repaint();
    }

    private void setupButtonGroup() {
        buttonGroup = new ButtonGroupManager(lblPageTitle);

        buttonGroup.addButton(btn_prin, "Página Principal");
        buttonGroup.addButton(btn_lends, "Gestion De Préstamos");
        buttonGroup.addButton(btn_returns, "Control De Devoluciones");
        buttonGroup.addButton(btn_users, "Administración De Usuarios");
        buttonGroup.addButton(btn_books, "Catálogo De Libros");
        buttonGroup.addButton(btn_reports, "Reportes");

        lblPageTitle.setText("Página Principal");
        btn_prin.setSelected(true);
    }

    private void InitStyles() {

    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Print = new com.mycompany.components.PanelRound();
        Sidebar = new javax.swing.JPanel();
        btn_prin = new com.mycompany.components.MyButton();
        btn_lends = new com.mycompany.components.MyButton();
        btn_returns = new com.mycompany.components.MyButton();
        btn_users = new com.mycompany.components.MyButton();
        btn_books = new com.mycompany.components.MyButton();
        btn_reports = new com.mycompany.components.MyButton();
        Logo = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        lblPageTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 698));
        setMinimumSize(new java.awt.Dimension(1020, 680));

        Background.setBackground(new java.awt.Color(241, 241, 241));
        Background.setMinimumSize(new java.awt.Dimension(1020, 698));

        Print.setBackground(new java.awt.Color(253, 253, 253));
        Print.setMinimumSize(new java.awt.Dimension(774, 612));
        Print.setPreferredSize(new java.awt.Dimension(463, 630));
        Print.setRoundBottomLeft(35);
        Print.setRoundBottomRight(35);
        Print.setRoundTopLeft(35);
        Print.setRoundTopRight(35);

        javax.swing.GroupLayout PrintLayout = new javax.swing.GroupLayout(Print);
        Print.setLayout(PrintLayout);
        PrintLayout.setHorizontalGroup(
            PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        PrintLayout.setVerticalGroup(
            PrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        Sidebar.setBackground(new java.awt.Color(241, 241, 241));

        btn_prin.setText("Principal");
        btn_prin.setAlignmentY(0.05F);
        btn_prin.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btn_prin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_prin.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_prin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prinActionPerformed(evt);
            }
        });

        btn_lends.setText("Prestamos");
        btn_lends.setAlignmentY(0.05F);
        btn_lends.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btn_lends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lendsActionPerformed(evt);
            }
        });

        btn_returns.setText("Devoluciones");
        btn_returns.setAlignmentY(0.05F);
        btn_returns.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btn_returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnsActionPerformed(evt);
            }
        });

        btn_users.setText("Usuarios");
        btn_users.setAlignmentY(0.05F);
        btn_users.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });

        btn_books.setText("Libros");
        btn_books.setAlignmentY(0.05F);
        btn_books.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btn_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_booksActionPerformed(evt);
            }
        });

        btn_reports.setText("Reportes");
        btn_reports.setAlignmentY(0.05F);
        btn_reports.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-light.png"))); // NOI18N

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_prin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_lends, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btn_returns, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btn_users, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btn_books, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btn_reports, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addGap(34, 34, 34)
                .addComponent(btn_prin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_lends, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_returns, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_books, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        dateText.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        dateText.setForeground(new java.awt.Color(114, 114, 114));
        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        lblPageTitle.setFont(new java.awt.Font("Inter", 1, 20)); // NOI18N
        lblPageTitle.setForeground(new java.awt.Color(114, 114, 114));
        lblPageTitle.setText("Page-Title");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(lblPageTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateText))
                    .addComponent(Print, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateText)
                            .addComponent(lblPageTitle))
                        .addGap(10, 10, 10)
                        .addComponent(Print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lendsActionPerformed
        ShowJPanel(new Lendings());
    }//GEN-LAST:event_btn_lendsActionPerformed

    private void btn_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_booksActionPerformed
        ShowJPanel(new Books());
    }//GEN-LAST:event_btn_booksActionPerformed

    private void btn_returnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnsActionPerformed
        ShowJPanel(new Returns());        
    }//GEN-LAST:event_btn_returnsActionPerformed

    private void btn_prinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prinActionPerformed
        try {
            ShowJPanel(new Principal());
        } catch (Exception ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_prinActionPerformed

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
        ShowJPanel(new Users());
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
        ShowJPanel(new Reports());
    }//GEN-LAST:event_btn_reportsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatMacLightLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dashboard().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Logo;
    private static com.mycompany.components.PanelRound Print;
    private javax.swing.JPanel Sidebar;
    private com.mycompany.components.MyButton btn_books;
    private com.mycompany.components.MyButton btn_lends;
    private com.mycompany.components.MyButton btn_prin;
    private com.mycompany.components.MyButton btn_reports;
    private com.mycompany.components.MyButton btn_returns;
    private com.mycompany.components.MyButton btn_users;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel lblPageTitle;
    // End of variables declaration//GEN-END:variables
}
