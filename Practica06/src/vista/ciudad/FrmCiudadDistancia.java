/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.ciudad;

import controlador.Ciudad.CiudadGrafoController;
import controlador.tda.grafos.GrafoEND;
import controlador.tda.lista.ListaEnlazada;
import controlador.utiles.Utilidades;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import vista.ciudad.modelo.ModeloTablaCiudad;

/**
 *
 * @author sebastian
 */
public class FrmCiudadDistancia extends javax.swing.JDialog {

    private CiudadGrafoController cgc;
    private ModeloTablaCiudad mtp = new ModeloTablaCiudad();

    /**
     * Creates new form FrmNatalyDisntacia
     */
    public FrmCiudadDistancia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        
    }

    private void crear() {

        Integer nro = Integer.parseInt(cbxnro.getSelectedItem().toString());
        cgc = new CiudadGrafoController(nro);
        jPanel2.setVisible(true);
        jPanel4.setVisible(true);
        jPanel5.setVisible(true);
        String[] aux = {""};
        Jlista.setListData(aux);
        cargarTabla();
        cargarComboVertice();
    }

    private void cargarTabla() {
        mtp.setGrafo(cgc.getGde());
        mtp.fireTableStructureChanged();
        mtp.fireTableDataChanged();
        tbltabla.setModel(mtp);
        tbltabla.updateUI();
        System.out.println(cgc.getGde().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbxnro = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbxorigen = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        cbxdestino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jlista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        tbltabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbltabla);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 640, 160);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 680, 190);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel4.setText("Nro Ciudad");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 20, 90, 14);

        cbxnro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));
        jPanel3.add(cbxnro);
        cbxnro.setBounds(120, 10, 130, 20);

        jButton2.setText("CREAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(300, 10, 90, 23);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 10, 680, 60);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel5.setText("Origen");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 20, 90, 14);

        cbxorigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbxorigen);
        cbxorigen.setBounds(60, 10, 130, 30);

        jButton3.setText("VINCULAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(580, 10, 90, 30);

        cbxdestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(cbxdestino);
        cbxdestino.setBounds(250, 10, 130, 30);

        jLabel6.setText("Destino");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(200, 20, 90, 14);

        jLabel7.setText("Distancia");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(390, 20, 50, 14);
        jPanel4.add(txtDistancia);
        txtDistancia.setBounds(450, 10, 120, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 300, 680, 60);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jButton4.setText("Camino");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(590, 40, 75, 30);

        Jlista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Jlista);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(50, 10, 190, 80);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 380, 680, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 700, 490);

        setSize(new java.awt.Dimension(734, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtDistancia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacios, llene distancia", "Error", JOptionPane.ERROR_MESSAGE);
        } else{
          adyacencia(Double.valueOf(txtDistancia.getText()));  
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        camino();
    }//GEN-LAST:event_jButton4ActionPerformed


    private void cargarComboVertice() {
        cbxorigen.removeAllItems();
        cbxdestino.removeAllItems();
        try {
            for (int i = 1; i < cgc.getGde().numVertices()+1; i++) {
                cbxorigen.addItem(cgc.getGde().obtenerEtiqueta(i).toString());
                cbxdestino.addItem(cgc.getGde().obtenerEtiqueta(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error al cagar el combo");
        }
    }
    private void adyacencia(Double distancia){
        Integer origen = (cbxorigen.getSelectedIndex()+1);
        Integer destino = (cbxdestino.getSelectedIndex()+1);
        if (origen==destino) {
            JOptionPane.showMessageDialog(null, "escoja destinos diferentes");
        }else{
            try {
                cgc.getGde().insertarAristaE(cgc.getGde().obtenerEtiqueta(origen), cgc.getGde().obtenerEtiqueta(destino), distancia);
                System.out.println("-----------------------");
                System.out.println(cgc.getGde().toString());
                System.out.println("-----------------------");
            } catch (Exception ex) {
                Logger.getLogger(FrmCiudadDistancia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void camino(){
        Integer origen = (cbxorigen.getSelectedIndex()+1);
        Integer destino = (cbxdestino.getSelectedIndex()+1);
        
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "escoja destinos diferentes");
        }else{
            try {
                //cgc.getGde().Matrizpesos();
                //ListaEnlazada<Integer> lista = cgc.getGde().caminoMinimo(origen, destino);
                ListaEnlazada<Integer> lista = cgc.getGde().Dijkstra(origen, destino);
                String [] aux = new String[lista.getSize()];
                Integer cont = lista.getSize() - 1;
                for (int i = 0; i < lista.getSize(); i++) {
                    aux[cont] = cgc.getGde().obtenerEtiqueta(lista.obtenerDato(i)).toString();
                    cont--;
                }
                Jlista.setListData(aux);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCiudadDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCiudadDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCiudadDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCiudadDistancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCiudadDistancia dialog = new FrmCiudadDistancia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Jlista;
    private javax.swing.JComboBox<String> cbxdestino;
    private javax.swing.JComboBox<String> cbxnro;
    private javax.swing.JComboBox<String> cbxorigen;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbltabla;
    private javax.swing.JTextField txtDistancia;
    // End of variables declaration//GEN-END:variables
}