package GUIs;
import Database.Sql_Connection;
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

// Applying Inheritance 

public class DashboardGUI extends javax.swing.JFrame {

    // Instances
      
    Connection con = Sql_Connection.getConnection();
    
    private Statement st = null;
    private ResultSet rs = null;
    
    RegisterGUI reg = new RegisterGUI();
    
    DefaultTableModel model;
    
    // Constructor

    public DashboardGUI() {
        initComponents();
        
        // Table model for modification purposes
        
        this.model = (DefaultTableModel) dataTable.getModel();
        
        // Table header special design
        
        dataTable.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        dataTable.getTableHeader().setOpaque(false);
        dataTable.getTableHeader().setBackground(new Color(50,36,34));
        dataTable.getTableHeader().setForeground(new Color(255,255,255));
    }
    
   
    
    // DESIGN BLOCK

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnCerrarS = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Viewer");
        setFocusableWindowState(false);
        setLocation(new java.awt.Point(500, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(50, 36, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));

        jLabel2.setBackground(new java.awt.Color(36, 122, 228));
        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PANTALLA PRINCIPAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditar.setBackground(new java.awt.Color(19, 28, 70));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCerrarS.setBackground(new java.awt.Color(186, 0, 0));
        btnCerrarS.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCerrarS.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarS.setText("Cerrar Sesión");
        btnCerrarS.setToolTipText("");
        btnCerrarS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnCerrarS.setBorderPainted(false);
        btnCerrarS.setFocusPainted(false);
        btnCerrarS.setIconTextGap(0);
        btnCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(186, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("BORRAR");
        btnBorrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnNuevo1.setBackground(new java.awt.Color(19, 28, 70));
        btnNuevo1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnNuevo1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo1.setText("NUEVO");
        btnNuevo1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        dataTable.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Apellido", "Correo", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.setRowHeight(25);
        dataTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(0).setResizable(false);
            dataTable.getColumnModel().getColumn(1).setResizable(false);
            dataTable.getColumnModel().getColumn(2).setResizable(false);
            dataTable.getColumnModel().getColumn(3).setResizable(false);
            dataTable.getColumnModel().getColumn(4).setResizable(false);
            dataTable.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrarS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       try{
           updateData();
       }
       catch (Exception e){
           JOptionPane.showMessageDialog(null, "No existen filas seleccionadas");
       }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSActionPerformed
        LoginGUI log = new LoginGUI();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       try{
           deleteData();
       }
       catch (Exception e){
           JOptionPane.showMessageDialog(null, "No existen filas seleccionadas");
       }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        reg.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showData();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrarS;
    public javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    

// METHODS
    
    // Show data method
    
    private void showData(){
        
        try{
            
            String query = "select * from Cliente";

            st = con.createStatement();
            rs = st.executeQuery(query);
            rs = st.getResultSet();
            
            while (rs.next()){
                
                String id = String.valueOf(rs.getInt("id"));
                String Usuario = rs.getString("Usuario");
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                String Correo = rs.getString("Correo");
                String Telefono = rs.getString("Telefono");

                String[] row = {id,Usuario,Nombre,Apellido,Correo,Telefono};
                
                model.addRow(row);
            }
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
   
    
    // Delete data method
    
    private void deleteData() { 
  
        try {
            
            // Storing the selected row
            
            int rowIndex = dataTable.getSelectedRow();
            int rowValue = Integer.parseInt(dataTable.getValueAt(rowIndex, 0).toString());

            String query = "delete from Cliente where id = ?";
            
            PreparedStatement preparedst = con.prepareStatement(query);
            preparedst.setInt(1,rowValue);
   
            // Checking if their is a row selected
            
            if (rowIndex > -1) {
                model.removeRow(rowIndex);
                preparedst.execute();
                JOptionPane.showMessageDialog(null, "Usario eliminado!");
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    // Update data method
    
    private void updateData(){
        
        try {
            
            reg.setVisible(true);
            this.setVisible(false);
            
            int rowIndex = dataTable.getSelectedRow();
            // int indexValue = Integer.parseInt(dataTable.getValueAt(rowIndex, 0).toString());
            
            String query = "select * from Cliente";
    
            if (rowIndex > -1){
            
                st = con.createStatement();
                rs = st.executeQuery(query);
                rs = st.getResultSet();
                
                while (rs.next()){

                    reg.tfUserName.setText(rs.getString("Usuario"));
                    reg.tfName.setText(rs.getString("Nombre"));
                    reg.tfLastName.setText(rs.getString("Apellido"));
                    reg.tfMail.setText(rs.getString("Correo"));
                    reg.tfTel.setText(rs.getString("Telefono"));
                    reg.tfPwd.setText(rs.getString("Contraseña"));
                    reg.tfPwdConf.setText(rs.getString("Contraseña"));

                    reg.btnRegistrar.setText("ACTUALIZAR");
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "No existen filas seleccionadas");
            }
        } 
        
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}


