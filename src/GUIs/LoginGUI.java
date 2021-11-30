package GUIs;
import java.sql.*;
import Database.Sql_Connection;
import javax.swing.JOptionPane;

// Applying Inheritance 

public class LoginGUI extends javax.swing.JFrame {
    
    
    private Statement st = null;
    private ResultSet rs = null;
    
    // Connection Instance
    
    Connection con = Sql_Connection.getConnection();
    
    // Constructor

    public LoginGUI() {
        initComponents();
    }    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPwd = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        tfPwd = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        lblRegistrar = new javax.swing.JLabel();
        pnlTitle = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setBackground(new java.awt.Color(242, 240, 240));
        setLocation(new java.awt.Point(800, 300));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(100, 5));
        setResizable(false);

        lblPwd.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblPwd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPwd.setText("Contraseña");

        lblUsuario.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("Usuario");

        tfUser.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfUser.setToolTipText("Inserte el nombre de usuario");
        tfUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfUser.setName(""); // NOI18N
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });

        tfPwd.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        tfPwd.setToolTipText("Inserte su contraseña");
        tfPwd.setPreferredSize(new java.awt.Dimension(5, 23));

        btnIniciar.setBackground(new java.awt.Color(19, 28, 70));
        btnIniciar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblRegistrar.setBackground(new java.awt.Color(120, 180, 253));
        lblRegistrar.setForeground(new java.awt.Color(36, 122, 228));
        lblRegistrar.setText("Regístrate aquí!");
        lblRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRegistrarMousePressed(evt);
            }
        });

        pnlTitle.setBackground(new java.awt.Color(50, 36, 34));
        pnlTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        lblLogin.setBackground(new java.awt.Color(36, 122, 228));
        lblLogin.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfUser)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfPwd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
 
    }//GEN-LAST:event_tfUserActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        signIn();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void lblRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMousePressed
        RegisterGUI registro = new RegisterGUI();
        registro.setVisible(true);  
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_lblRegistrarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPasswordField tfPwd;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
    

// METHODS
    
    // Sign in to the system method
    
    private void signIn(){

        try {
            
            String query = "select Usuario, Contraseña from Cliente where Usuario = '" + tfUser.getText() 
                           + "' and Contraseña = '" + tfPwd.getText() +"'";
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            rs = st.getResultSet();
            
            // Open DashBoard after logged in
            
            if (rs.next()) {
                DashboardGUI dash = new DashboardGUI();
                dash.setVisible(true);
                this.setVisible(false);
            }
            
            // Checking for empty fields or putting the wrong password
            
            else if (tfUser.getText().isEmpty() || tfPwd.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, 
                        "Debe ingresar su usuario y contraseña\n*Si no está registrado debe registrarse"
                );
            }
            
            else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!");
            }
        }
        catch (SQLException e){ 
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
