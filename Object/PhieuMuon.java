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
public class PhieuMuon {
    private String sMaPM;
    private String sMaSach;
    private String sMaDG;
    private String sNgayMuon;
    private String sNgayTra;
    public PhieuMuon(String sMaPM, String sMaSach, String sMaDG, String sNgayMuon, String sNgayTra)
    {
        this.sMaPM = sMaPM;
        this.sMaDG = sMaDG;
        this.sMaSach = sMaSach;
        this.sNgayMuon = sNgayMuon;
        this.sNgayTra = sNgayTra;
    }
    public String getsMaPM()
    {
        return sMaPM;
    }
    public void setsMaPM(String sMaPM)
    {
        this.sMaPM = sMaPM;
    }
    public String getsMaSach()
    {
        return sMaSach;
    }
    public void setsMaSach(String sMaSach)
    {
        this.sMaSach = sMaSach;
    }
    public String getsMaDG()
    {
        return sMaDG;
    }
    public void setsMaDG(String sMaDG)
    {
        this.sMaDG = sMaDG;
    }
    public String getsNgayMuon()
    {
        return sNgayMuon;
    }
    public void setsNgayMuon(String sNgayMuon)
    {
        this.sNgayMuon = sNgayMuon;
    }
    public String getsNgayTra()
    {
        return sNgayTra;
    }
    public void setsNgayTra(String sNgayTra)
    {
        this.sNgayTra = sNgayTra;
    }
}
