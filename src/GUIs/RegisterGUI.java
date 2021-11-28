package GUIs;
import Database.Sql_Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegisterGUI extends javax.swing.JFrame {

    // Instancia de conexión 
        
    Connection con = Sql_Connection.getConnection();
 
    // Atributos para los TextField
    
    private String Nombre = "";
    private String Apellido = ""; 
    private String Correo = ""; 
    private String Usuario = ""; 
    private String Tel = ""; 
    private String Pwd = ""; 
    private String PwdConf = "";
    
    public void getValues(){
        
        Nombre = tfNombre.getText();
        Apellido = tfApellido.getText();
        Correo = tfCorreo.getText();
        Usuario = tfNombreUsuario.getText();
        Tel = tfTelefono.getText();
        Pwd = tfPwdReg.getText();
        PwdConf = tfPwdConf.getText();
    }
    
    
    public RegisterGUI() {
        initComponents();
    }
    
    
    // Método de validaciones
    
    private boolean gestion(){
        
        getValues();
        
        String[] values = {Usuario,Nombre,Apellido,Pwd,PwdConf,Tel,Correo};
        
        boolean validate = true;
        
        for (String i: values){
            if (i.isEmpty() == true){
                validate = true;
                break;
            } else {
                validate = false;
            }
        }
        
        if (validate == false){
            if (!Pwd.equals(PwdConf)){
               JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden!");
               return true;
             } else {
                    return validate;
               }
        } else {
            return validate;
        }
    }

    
     // Método de registro
    
    private void signUp(){
        
        getValues();
        
        LoginGUI login = new LoginGUI();
 
        try {
            
            String query = "insert into Cliente values('" 
                    + Usuario + "','" + Nombre + "','" + Apellido + "','" 
                    + Pwd + "','" + Tel + "','" + Correo + "')";

            Statement st = con.createStatement();
            
            // Manejo de alertas
           
            if (gestion() == true){
               JOptionPane.showMessageDialog(null, "Recuerde que no puede dejar campos vacíos");
            } else {
               st.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Bienvenido " + Usuario +"\nsu usuario ha sido registrado!");
               login.setVisible(true);
               this.setVisible(false);
            }
            
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null,exception);
        }
    }
        
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        tfApellido = new javax.swing.JTextField();
        lblUsario = new javax.swing.JLabel();
        tfNombreUsuario = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        tfPwdReg = new javax.swing.JPasswordField();
        tfPwdConf = new javax.swing.JPasswordField();
        lblPwdConf = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(242, 240, 240));
        setLocation(new java.awt.Point(650, 300));

        jPanel1.setBackground(new java.awt.Color(50, 36, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        jLabel2.setBackground(new java.awt.Color(36, 122, 228));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblNombre.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre");

        tfNombre.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfNombre.setToolTipText("Inserte su nombre");
        tfNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfNombre.setName(""); // NOI18N

        lblApellido.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellido.setText("Apellido");

        tfApellido.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfApellido.setToolTipText("Inserte su apellido");
        tfApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfApellido.setName(""); // NOI18N

        lblUsario.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblUsario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsario.setText("Nombre de usuario");

        tfNombreUsuario.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfNombreUsuario.setToolTipText("Inserte el nombre de usuario");
        tfNombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfNombreUsuario.setName(""); // NOI18N

        lblPwd.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblPwd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPwd.setText("Contraseña");

        tfPwdReg.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfPwdReg.setToolTipText("Inserte su contraseña");

        tfPwdConf.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfPwdConf.setToolTipText("Confirme su contraseña");

        lblPwdConf.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblPwdConf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPwdConf.setText("Confirmar contraseña");

        lblTel.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTel.setText("Teléfono");

        tfTelefono.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfTelefono.setToolTipText("Inserte el número de teléfono");
        tfTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfTelefono.setName(""); // NOI18N

        lblCorreo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorreo.setText("Correo Electrónico");

        tfCorreo.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfCorreo.setToolTipText("Inserte el correo electrónico");
        tfCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfCorreo.setName(""); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(19, 28, 70));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(186, 0, 0));
        btnVolver.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPwdConf)
                            .addComponent(lblPwdConf, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(tfPwdReg)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(111, 111, 111))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPwdReg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPwdConf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPwdConf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        signUp();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        LoginGUI login = new LoginGUI();
        login.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblPwdConf;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblUsario;
    public javax.swing.JTextField tfApellido;
    public javax.swing.JTextField tfCorreo;
    public javax.swing.JTextField tfNombre;
    public javax.swing.JTextField tfNombreUsuario;
    public javax.swing.JPasswordField tfPwdConf;
    public javax.swing.JPasswordField tfPwdReg;
    public javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
