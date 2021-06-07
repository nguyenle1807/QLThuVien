/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import javax.swing.JLabel;

/**
 *
 * @author nguye
 */
public class ThuThu {
    private String sMaTT;
    private String sTenTT;
    private String sDiaChi;
    private String UserName;
    private String passWord;
    private String sSDT;
    private byte[] sHinhAnh;
    public ThuThu()
    {}
    public ThuThu(String sMaTT, String sTenTT, String sDiaChi,String UserName, String passWord, String sSDT, byte[] sHinhAnh)
    {
        this.sMaTT = sMaTT;
        this.sTenTT = sTenTT;
        this.sDiaChi = sDiaChi;
        this.UserName = UserName;
        this.passWord = passWord;
        this.sSDT = sSDT;
        this.sHinhAnh = sHinhAnh;
    }

    public ThuThu(String tentt, String sdt, String diachi) {
        this.sTenTT = tentt;
        this.sSDT = sdt;
        this.sDiaChi = diachi;
    }

    public ThuThu(String tentt, String sdt, String diachi, JLabel hinhanh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ThuThu(String tentt, String sdt, String diachi, byte[] hinhanh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getsMaTT()
    {
        return sMaTT;
    }
    public void setsMaTT(String sMaTT)
    {
        this.sMaTT = sMaTT;
    }
    public String getsTenTT()
    {
        return sTenTT;
    }
    public void setsTenTT(String sTenTT)
    {
        this.sTenTT = sMaTT;
    }
    public String getUserName(){
        return UserName;
    }
    public void setUserName(String UserName)
    {
        this.UserName = UserName;
    }
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getsDiaChi()
    {
        return sDiaChi;
    }
    public void setsDiaChi(String sDiaChi)
    {
        this.sDiaChi = sDiaChi;
    }
    public String getsSDT()
    {
        return sSDT;
    }
    public void setsSDT(String sSDT)
    {
        this.sSDT = sSDT;
    }
    public byte[] getsHinhAnh() {
        return sHinhAnh;
    }
    public void setsHinhAnh(byte[] sHinhAnh) {
        this.sHinhAnh = sHinhAnh;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
