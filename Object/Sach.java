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
public class Sach {
    private String sMaSach;
    private String sTenSach;
    private String sSoLuong;
    private String sGiatien;
    private byte[] sHinhAnh;
    private String sNamXuatBan;
    private String sMaLoai;
    private String sTenLoai;
    
    public Sach( String sTenSach, String sSoLuong,String sGiaTien, byte[] sHinhAnh, String sNamXuatBan,String sMaLoai, String sTenLoai)
    {
        this.sTenSach = sTenSach;
        this.sSoLuong = sSoLuong;
        this.sGiatien = sGiaTien;
        this.sHinhAnh = sHinhAnh;
        this.sNamXuatBan = sNamXuatBan;
        this.sMaLoai = sMaLoai;
        this.sTenLoai = sTenLoai;
    }

    public Sach() {
    }
    public String getsMaSach()
    {
        return sMaSach;
    }
    public void setsMaSach(String sMaSach)
    {
        this.sMaSach = sMaSach;
    }
    public String getsTenSach()
    {
        return sTenSach;
    }
    public void setsTenSach(String sTenSach)
    {
        this.sTenSach = sTenSach;
    }
    
    public String getsSoLuong()
    {
        return sSoLuong;
    }
    public void setsSoLuong(String sSoLuong)
    {
        this.sSoLuong = sSoLuong;
    }
    public String getsGiaTien() {
        return sGiatien;
    }
    
    public void setsGiaTien(String sGiaTien) {
        this.sGiatien = sGiaTien;
    }
    public byte[] getsHinhAnh()
    {
        return sHinhAnh;
    }
    public void setsHinhAnh(byte[] sHinhAnh)
    {
        this.sHinhAnh = sHinhAnh;
    }
    public String getsNamXuatBan()
    {
        return sNamXuatBan;
    }
    public void setsNamXuatBan( String sNamXuatBan)
    {
        this.sNamXuatBan = sNamXuatBan;
    }
    public String getsMaLoai()
    {
        return sMaLoai;
    }
    public void setsMaLoai(String sMaLoai)
    {
        this.sMaLoai = sMaLoai;
    }
    public String getsTenLoai()
    {
        return sTenLoai;
    }
    public void setsTenLoai(String sTenLoai)
    {
        this.sTenLoai = sTenLoai;
    }
}

