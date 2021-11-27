package GUIs;
import Database.Sql_Connection;
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class DashboardGUI extends javax.swing.JFrame {

    // Instancia de conexión 
      
    Connection con = Sql_Connection.getConnection();
    private Statement st = null;
    private ResultSet rs = null;

    public DashboardGUI() {
        initComponents();
        dataTable.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        dataTable.getTableHeader().setOpaque(false);
        dataTable.getTableHeader().setBackground(new Color(50,36,34));
        dataTable.getTableHeader().setForeground(new Color(255,255,255));
    }
    
    public void mostrarData(){
        
        try{
            
            String query = "select Usuario,Nombre,Apellido,Telefono,Correo from Cliente";

            st = con.createStatement();
            rs = st.executeQuery(query);
            rs = st.getResultSet();
            
            while (rs.next()){
                
                String Usuario = rs.getString("Usuario");
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                String Correo = rs.getString("Correo");
                String Telefono = rs.getString("Telefono");

                String[] rows = {Usuario,Nombre,Apellido,Correo,Telefono};

                DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
                model.addRow(rows);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCerrarS = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vista de Datos");
        setFocusableWindowState(false);
        setLocation(new java.awt.Point(500, 300));

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

        btnMostrar.setBackground(new java.awt.Color(19, 28, 70));
        btnMostrar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("MOSTRAR DATOS");
        btnMostrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(19, 28, 70));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 0, 0, 0));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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
                "Usuario", "Nombre", "Apellido", "Correo", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCerrarS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrarData();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSActionPerformed
        LoginGUI log = new LoginGUI();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        RegisterGUI reg = new RegisterGUI();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrarS;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
