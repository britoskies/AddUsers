package GUIs;
import Database.Sql_Connection;
import java.sql.*;
import javax.swing.JOptionPane;

// Applying Inheritance 

public class RegisterGUI extends javax.swing.JFrame {

    // Instances 
        
    Connection con = Sql_Connection.getConnection();
    private Statement st = null;
    private ResultSet rs = null;

    // TextField Atributes
    
    private String name;
    private String lastName; 
    private String mail; 
    private String user; 
    private String tel; 
    private String pwd; 
    private String pwdConf;
    
    // Setting atribute values
    
    public void getValues(){
        
        name = tfName.getText();
        lastName = tfLastName.getText();
        mail = tfMail.getText();
        user = tfUserName.getText();
        tel = tfTel.getText();
        pwd = tfPwd.getText();
        pwdConf = tfPwdConf.getText();
    }
    
    // Constructor
    
    public RegisterGUI() {
        initComponents();
    }
    
    
    
    // DESIGN BLOCK    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        lblUsario = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        tfPwd = new javax.swing.JPasswordField();
        tfPwdConf = new javax.swing.JPasswordField();
        lblPwdConf = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        tfTel = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        tfMail = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setBackground(new java.awt.Color(242, 240, 240));
        setLocation(new java.awt.Point(650, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(50, 36, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        lblTitle.setBackground(new java.awt.Color(36, 122, 228));
        lblTitle.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("REGISTRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblNombre.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre");

        tfName.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfName.setToolTipText("Inserte su nombre");
        tfName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfName.setName(""); // NOI18N

        lblApellido.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellido.setText("Apellido");

        tfLastName.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfLastName.setToolTipText("Inserte su apellido");
        tfLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfLastName.setName(""); // NOI18N

        lblUsario.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblUsario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsario.setText("Nombre de usuario");

        tfUserName.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfUserName.setToolTipText("Inserte el nombre de usuario");
        tfUserName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfUserName.setName(""); // NOI18N

        lblPwd.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblPwd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPwd.setText("Contraseña");

        tfPwd.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfPwd.setToolTipText("Inserte su contraseña");

        tfPwdConf.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfPwdConf.setToolTipText("Confirme su contraseña");

        lblPwdConf.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblPwdConf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPwdConf.setText("Confirmar contraseña");

        lblTel.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTel.setText("Teléfono");

        tfTel.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfTel.setToolTipText("Inserte el número de teléfono");
        tfTel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfTel.setName(""); // NOI18N

        lblCorreo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCorreo.setText("Correo Electrónico");

        tfMail.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tfMail.setToolTipText("Inserte el correo electrónico");
        tfMail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfMail.setName(""); // NOI18N

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
                            .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(tfPwd)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPwdConf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPwdConf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblPwdConf;
    private javax.swing.JLabel lblTel;
    public javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsario;
    public javax.swing.JTextField tfLastName;
    public javax.swing.JTextField tfMail;
    public javax.swing.JTextField tfName;
    public javax.swing.JPasswordField tfPwd;
    public javax.swing.JPasswordField tfPwdConf;
    public javax.swing.JTextField tfTel;
    public javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables


// METHODS

    // Validation control
    
    private int checkValidations(){
        
        int validate = 0;
        
        try{
        
            getValues();

            String[] values = {user,name,lastName,pwd,pwdConf,tel,mail};
            String query = "select Usuario from Cliente";
            String dbUserName = "";
            boolean doesUserExist = false;
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            
            while (rs.next()){
                dbUserName = rs.getString("Usuario");
                
                if (user.equals(dbUserName)){
                   doesUserExist = true;
                }
            }

            for (String i: values){
                if (i.isEmpty()){
                    validate = 0;
                    break;
                } else {
                    validate = 1;
                }
            }
            
            if (doesUserExist == true){
                return 2;
            }

            if (validate == 1){
                if (!pwd.equals(pwdConf)){
                   return 1;
                 } else {
                    return 3;
                   }
            } else {
                return validate;
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return validate;  
    }
    
     // Registration method
    
    private void signUp(){
        
        getValues();
        int val = checkValidations();
        
        LoginGUI login = new LoginGUI();
 
        try {
            
            String query = "insert into Cliente (Usuario,Nombre,Apellido,Contraseña,Telefono,Correo) values('" 
                    + user + "','" + name + "','" + lastName + "','" 
                    + pwd + "','" + tel + "','" + mail + "')";

            st = con.createStatement();
            
            // Alert management
            
            switch (val) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Recuerde que no puede dejar campos vacíos");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Este usuario ya existe en la base de datos");
                    break;
                default:
                    st.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "¡Bienvenido " + user +"!\nSu usuario ha sido registrado");
                    login.setVisible(true);
                    this.setVisible(false);
                    break;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
