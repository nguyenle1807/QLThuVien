/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Data.*;
import Object.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mamon
 */
public class ThuThuData {   
    
    public static List<ThuThu> showData()
    {
        
        List<ThuThu> ls = null;
        try(Connection con = Connect.getConnect())
        {
            ls=new ArrayList<>();
            java.sql.Statement st;
            st = con.createStatement();
            ResultSet rs;
            String sql = "SELECT * FROM ThuThu";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                ThuThu tt = new ThuThu();
                tt.setsMaTT(rs.getString("mathuthu"));
                tt.setsTenTT(rs.getString("tenthuthu"));
                tt.setsDiaChi(rs.getString("diachi"));
                tt.setUserName(rs.getString("Username"));
                tt.setPassWord(rs.getString("PassWord"));   
                tt.setsSDT(rs.getString("sdt"));
                tt.setsHinhAnh(rs.getBytes("hinhanh"));
                ls.add(tt);
            }
        }
        catch(Exception e)
        {
            System.out.println("Loi "+e);
        }
        return ls;
    }
    public static int suaThuThu(ThuThu tt)
    {
                 
        int smt=0;
        try(Connection ketNoi=Connect.getConnect())
        {
            String sql="UPDATE ThuThu set tenthuthu=?,sdt=?,diachi=?,hinhanh=? WHERE mathuthu=?";
            PreparedStatement pst;
            pst = ketNoi.prepareStatement(sql);
            pst.setString(1, tt.getsTenTT());
            pst.setString(2, tt.getsSDT());
            pst.setString(3, tt.getsDiaChi());
            pst.setBytes(4, tt.getsHinhAnh());
            smt=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Bị lỗi "+ex.getMessage());
        }
        return smt=0;
    }
}
   
    
    
