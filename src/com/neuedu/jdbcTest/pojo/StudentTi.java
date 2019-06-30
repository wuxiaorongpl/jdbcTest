package com.neuedu.jdbcTest.pojo;

public class StudentTi {
//    创建一个学生对象
    private Integer id;
    private int sno;
    private String sname;
    private String spsw;
    private String sage;
    private String ssex;
    private int sheight;
    private int sweight;
    private String sbirthday;
    private Integer sflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpsw() {
        return spsw;
    }

    public void setSpsw(String spsw) {
        this.spsw = spsw;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSheight() {
        return sheight;
    }

    public void setSheight(int sheight) {
        this.sheight = sheight;
    }

    public int getSweight() {
        return sweight;
    }

    public void setSweight(int sweight) {
        this.sweight = sweight;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public Integer getSflag() {
        return sflag;
    }

    public void setSflag(Integer sflag) {
        this.sflag = sflag;
    }

    @Override
    public String toString() {
        return "StudentTi{" +
                "id=" + id +
                ", sno=" + sno +
                ", sname='" + sname + '\'' +
                ", spsw='" + spsw + '\'' +
                ", sage='" + sage + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sheight=" + sheight +
                ", sweight=" + sweight +
                ", sbirthday='" + sbirthday + '\'' +
                ", sflag=" + sflag +
                '}';
    }

    public StudentTi(int id, int sno, String sname, String spsw, String sage, String ssex, int sheight, int sweight, String sbirthday, int sflag) {
        this.id = id;
        this.sno = sno;
        this.sname = sname;
        this.spsw = spsw;
        this.sage = sage;
        this.ssex = ssex;
        this.sheight = sheight;
        this.sweight = sweight;
        this.sbirthday = sbirthday;
        this.sflag = sflag;
    }

    public StudentTi() {
    }
}
