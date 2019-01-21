package com.runvision.bean;

public class Ticket {

    /**
     * 身份证
     */
    private String sfz;

    /**
     * 车次
     */
    private String cc;

    /**
     * 是否成功
     */
    private String statusInfo;

    /**
     * 票号
     */
    private String ph;

    /**
     * 发车时间
     */
    private String fcsj;

    /**
     * 上车站名称
     */
    private String scz;

    /**
     * 下车站名称
     */
    private String ddz;

    /**
     * 成功：1 失败：2
     */
    private int status;

    /**
     * 身份证号码提交查询
     * @param sfz
     */
    public Ticket(String sfz) {
        this.sfz = sfz;
    }

    /**
     * 查询返回结果
     * @param cc
     * @param statusInfo
     * @param ph
     * @param fcsj
     * @param scz
     * @param ddz
     * @param status
     */
    public Ticket(String cc, String statusInfo, String ph, String fcsj, String scz, String ddz, int status) {
        this.cc = cc;
        this.statusInfo = statusInfo;
        this.ph = ph;
        this.fcsj = fcsj;
        this.scz = scz;
        this.ddz = ddz;
        this.status = status;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getFcsj() {
        return fcsj;
    }

    public void setFcsj(String fcsj) {
        this.fcsj = fcsj;
    }

    public String getScz() {
        return scz;
    }

    public void setScz(String scz) {
        this.scz = scz;
    }

    public String getDdz() {
        return ddz;
    }

    public void setDdz(String ddz) {
        this.ddz = ddz;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "cc='" + cc + '\'' +
                ", statusInfo='" + statusInfo + '\'' +
                ", ph='" + ph + '\'' +
                ", fcsj='" + fcsj + '\'' +
                ", scz='" + scz + '\'' +
                ", ddz='" + ddz + '\'' +
                ", status=" + status +
                '}';
    }
}
