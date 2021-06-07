/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author nguye
 */
public class ThuKho {
    private String sMaTK;
    private String sTenTK;
    private String sDiaChi;
    private String UserName;
    private String passWord;
    private String sSDT;
    private byte[] sHinhAnh;
    private String sMaKho;
    public ThuKho(String sMaTK, String sTenTK, String sDiaChi,String UserName,String passWord, String sSDT, byte[] sHinhAnh, String sMaKho)
    {
        this.sMaTK = sMaTK;
        this.sTenTK = sTenTK;
        this.sDiaChi = sDiaChi;
        this.UserName = UserName;
        this.passWord = passWord;
        this.sSDT = sSDT;
        this.sHinhAnh = sHinhAnh;
        this.sMaKho = sMaKho;
    }
    public String getsMaTK()
    {
        return sMaTK;
    }
    public void setsMaTK(String sMaTK)
    {
        this.sMaTK = sMaTK;
    }
    public String getsTenTK()
    {
        return sTenTK;
    }
    public void setsTenTK(String sTenTK)
    {
        this.sTenTK = sTenTK;
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
    public String getsMaKho() {
        return sMaKho;
    }
    public void setsMaKho(String sMaKho) {
        this.sMaKho = sMaKho;
    }
    
}
