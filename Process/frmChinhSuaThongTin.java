/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import Data.ThuThuData;
import Object.*;
import static com.sun.tools.attach.VirtualMachine.list;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import static java.nio.file.Files.list;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author Nguyen
 */

public class frmChinhSuaThongTin extends javax.swing.JFrame {
    String nameimage=null;
    byte[] image_person = null;
    public DefaultTableModel model;
    /**
     * Creates new form frmChinhSuaThuThu
     */
    public frmChinhSuaThongTin() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTenTT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        lbl_HinhAnh = new javax.swing.JLabel();
        btnDoiAnh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ch???nh s???a th??ng tin");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("T??n th??? th??:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, -1));

        jLabel9.setText("?????a Ch???:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 212, -1, -1));
        jPanel1.add(txtTenTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 23, 294, -1));
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 209, 294, -1));

        btnLuu.setText("L??u");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 60, -1));

        lbl_HinhAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbl_HinhAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 118, 113));

        btnDoiAnh.setText("?????i ???nh");
        btnDoiAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiAnhActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoiAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 82, -1));

        jLabel1.setText("S??? ??i???n tho???i:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 112, -1, -1));
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 109, 158, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("CH???NH S???A");

        btnThoat.setText("Quay l???i");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThoat)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String tentt=txtTenTT.getText();
        String sdt=txtSDT.getText();
        String diachi=txtDiaChi.getText();
        byte[] hinhanh = image_person;
        ThuThu s;
        s = new ThuThu(tentt,sdt,diachi,hinhanh);
        int smt=ThuThuData.suaThuThu(s);
        if(smt>0)
            JOptionPane.showMessageDialog(rootPane, "???? c???p nh???t th??nh c??ng");
        else
            JOptionPane.showMessageDialog(rootPane, "C???p nh???t kh??ng th??nh c??ng! Vui l??ng ki???m tra l???i");
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        frmThuThu tt = new frmThuThu();
            this.dispose();
            tt.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDoiAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiAnhActionPerformed

        JFileChooser jfc = new JFileChooser("src/images/ThuThu");
        jfc.setFileFilter(new FileNameExtensionFilter("C??c lo???i file *.jpg", "jpg"));
        int returnValue = jfc.showOpenDialog(rootPane);
        if(returnValue==JFileChooser.APPROVE_OPTION)
        {
            nameimage = jfc.getSelectedFile().getAbsolutePath();
            ImageIcon imageicon = new ImageIcon(nameimage);
            imageicon.setImage(imageicon.getImage().getScaledInstance(lbl_HinhAnh.getWidth(), lbl_HinhAnh.getHeight(), Image.SCALE_DEFAULT));
            lbl_HinhAnh.setIcon(imageicon);
            try {
                File image = new File(nameimage);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for(int readNum;(readNum=fis.read(buf))!=-1;)
                {
                    bos.write(buf,0,readNum);
                }
                image_person=bos.toByteArray();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,e);
            }
        }
    }//GEN-LAST:event_btnDoiAnhActionPerformed

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
            java.util.logging.Logger.getLogger(frmChinhSuaThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChinhSuaThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChinhSuaThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChinhSuaThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmChinhSuaThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiAnh;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_HinhAnh;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenTT;
    // End of variables declaration//GEN-END:variables

    public void TrangThaiNut(boolean b) {

        
        this.btnLuu.setEnabled(b);
       
    }
    
    public void showListNhanVien()
    {
        List<ThuThu> list = ThuThuData.showData();
        model.setRowCount(0);
        for(ThuThu tt : list)
        {
            model.addRow(new Object[]{
                tt.getsTenTT(),tt.getsSDT(),tt.getsDiaChi()
            });            
        }
    }  
                            

    private void ResetText()
    {      
        txtTenTT.setText("");
        txtSDT.requestFocus();
        
        txtDiaChi.setText("");        
    }
}
