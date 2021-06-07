/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
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
 * @author Nguyen
 */
public class DocGiaData {   
    
    public static List<DocGia> showData() 
    {
        
        List<DocGia> ls = null;
        try(Connection con = Connect.getConnect())
        {
            ls=new ArrayList<>();
            java.sql.Statement st = con.createStatement();
            String sql = "SELECT * FROM DocGia";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {  
                DocGia dg = new DocGia();
                dg.setsMaDG(rs.getString("madocgia"));
                dg.setsTenDG(rs.getString("tendocgia"));
                
                  
                dg.setsDiaChi(rs.getString("diachi"));
                dg.setsSDT(rs.getString("sdt"));
                ls.add(dg);
            }
        }
        catch(Exception e)
        {
            System.out.println("Lỗi "+e);
        }
        return ls;
    }
   
    
    public static void CapNhatDocGia(DocGia dg)
    {
        // kiểu dl kiểu nvarchar insert, update phải có N'' đằng trc
        try(Connection con = Connect.getConnect()) 
        {
            String sql = "UPDATE DocGia set tendocgia=?,=?,diachi=?,sdt=?, WHERE madocgia=?";                    
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,dg.getsTenDG());
            pst.setString(2,dg.getsDiaChi());
            pst.setString(3,dg.getsSDT());
            pst.setString(4,dg.getsMaDG());
            pst.executeUpdate();
            
        } 
        catch (Exception e)
        {
             System.out.println("Lỗi "+e.getMessage());
        }                 
    }
    
    public static void XoaDocGia(String MaDG)
    {       
        try(Connection con = Connect.getConnect()) 
        {
            String sql = "DELETE FROM DocGia where madocgia= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,MaDG);            
            pst.execute();
        } 
        catch (Exception e) 
        {
           e.printStackTrace(); 
        }           
    }
    
    
    
    public static void ThemDocGia(DocGia dg)
    {
        try(Connection con = Connect.getConnect()) 
        {
            String sql = "INSERT INTO DocGia(tendocgia,diachi,sdt) "
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,dg.getsTenDG());
            
            pst.setString(2,dg.getsDiaChi());
            pst.setString(3,dg.getsSDT());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm độc giả thành công!" , "Thông báo", 1);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Độc giả không được thêm" , "Thông báo", 1);
        }            
    }

    public static void XoaDocGia(DocGia kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void TimKiem(String TenDG, DefaultTableModel dtm) {
        
        try(Connection con = Connect.getConnect()) {
            Statement stm = con.createStatement();
            
            String sql = "SELECT * FROM  DoGia  where tendocgia like '%"+ TenDG +"%'";           
            ResultSet rs = stm.executeQuery(sql);
            String madocgia,tendocgia,diachi,sdt;
                        
            while(rs.next()) {               
                madocgia = rs.getString("madocgia");
                tendocgia = rs.getString("tendocgia");
                
                diachi = rs.getString("diachi");
                sdt = rs.getString("sdt");
                dtm.addRow(new String[] {madocgia,tendocgia,diachi,sdt});        
            }
            
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }   
}

