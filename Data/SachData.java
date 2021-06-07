/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.Sach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mamon
 */
public class SachData {
    public static void ThemSach(Sach s)
    {
        int smt=0;
        try(Connection con = Connect.getConnect()) 
        {
            String sql = "INSERT INTO Sach(tensach,soluong,giatien,hinhanh,namxuatban,tenloai) "
                    + "VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,s.getsTenSach());
            pst.setString(2,s.getsSoLuong());
            pst.setString(3,s.getsGiaTien());
            pst.setBytes(4,s.getsHinhAnh());
            pst.setString(5,s.getsNamXuatBan());
            pst.setString(6,s.getsTenLoai());
            
            smt=pst.executeUpdate();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }            
    }
    
    public static void XoaSach(Sach s)
    {       
        try(Connection con = Connect.getConnect()) 
        {
            String sql = "DELETE FROM Sach where masach= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,s.getsMaSach());            
            pst.execute();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }           
    }

    public static List<Sach> showData() 
    {
        
        List<Sach> ls = null;
        try(Connection con = Connect.getConnect())
        {
            ls=new ArrayList<>();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM Sach";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                Sach s = new Sach();
                s.setsMaSach(rs.getString("masach"));
                s.setsTenSach(rs.getString("tensach"));
                s.setsSoLuong(rs.getString("soluong"));
                s.setsGiaTien(rs.getString("giatien"));
                s.setsHinhAnh(rs.getBytes("hinhanh"));
                s.setsNamXuatBan(rs.getString("namxuatban"));
                s.setsTenLoai(rs.getString("tenloai"));
                                
                ls.add(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("Lỗi "+e.getMessage());
        }
        return ls;
    }
    
    public static ArrayList<String> LoadDataTheLoai()
    {
        ArrayList<String> tl = new ArrayList<>();
        Connection con = Connect.getConnect(); 
        String sql = "SELECT tenloai FROM Sach_loaiSach GROUP BY tenloai";
        try{
            
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {               
                tl.add(rs.getString("tenloai"));
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Lỗi "+e);
        }
        return tl;
    }
     
    public void search(String TenSach, DefaultTableModel dtm) throws SQLException 
    {       
        try(Connection con = Connect.getConnect()) {
            Statement stm = con.createStatement();
            
            String sql = "select * from Sach where tensach like '%"+ TenSach +"%'";           
            ResultSet rs = stm.executeQuery(sql);           
            String masach, tensach, namxuatban, soluong ,giatien,theloai;
            
            byte[] hinhSach;
            while(rs.next()) {                             
                masach = rs.getString("masach");
                tensach =  rs.getString("tensach");
                soluong =  rs.getString("soluong");
                giatien = rs.getString("giatien");
                namxuatban = rs.getString("namxuatban");
                theloai =  rs.getString("theloai");
                hinhSach = rs.getBytes("hinhanh");
                
                dtm.addRow(new String[] {masach, tensach, soluong ,namxuatban,theloai });                 
            }           
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void CapNhatSach(Sach s)
    {
        // kiểu dl kiểu nvarchar insert, update phải có N'' đằng trc
        try(Connection con = Connect.getConnect()) 
        {
            String sql = "UPDATE Sach set tensach=?,soluong=?,giatien=?,hinhanh=?,namxuatban=?,tenloai=?, WHERE masach=? ";                    
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,s.getsTenSach());
            pst.setString(2,s.getsTenLoai());
            pst.setString(3,s.getsSoLuong());
            pst.setString(4,s.getsGiaTien());
            pst.setString(5,s.getsTenLoai());
            pst.setBytes(6,s.getsHinhAnh());
            pst.setString(7,s.getsNamXuatBan());
            pst.setString(8,s.getsMaSach());
            pst.executeUpdate();
            
        } 
        catch (Exception e)
        {
            System.out.println("Lỗi "+e.getMessage());
        }                 
    }
    
    
    public void Close() throws SQLException
    {
        Connection con = Connect.getConnect();
        if(con!=null)
        {
            JOptionPane.showMessageDialog(null,"Kết Nối Database bị lỗi");
        }
    }

}
