package test;

import java.io.Serializable;
import java.util.Date;

public class TcpLogOta implements Serializable {
    private Long otaId;

    private Long devId;

    private Integer frameType;

    private String devSn;

    private Integer devType;

    private String oldHardversion;

    private Float oldSoftversion;

    private Integer versionCheck;

    private Float newSoftversion;

    private Long sizeSoftversion;

    private Integer sizePacket;

    private Long fwId;

    private Integer fwType;

    private Integer seqPacket;

    private Integer readySeq;

    private Integer reCode;

    private Date otaCreate;

    private String otaBak;

    private static final long serialVersionUID = 1L;

    public Long getOtaId() {
        return otaId;
    }

    public void setOtaId(Long otaId) {
        this.otaId = otaId;
    }

    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public Integer getFrameType() {
        return frameType;
    }

    public void setFrameType(Integer frameType) {
        this.frameType = frameType;
    }

    public String getDevSn() {
        return devSn;
    }

    public void setDevSn(String devSn) {
        this.devSn = devSn == null ? null : devSn.trim();
    }

    public Integer getDevType() {
        return devType;
    }

    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    public String getOldHardversion() {
        return oldHardversion;
    }

    public void setOldHardversion(String oldHardversion) {
        this.oldHardversion = oldHardversion == null ? null : oldHardversion.trim();
    }

    public Float getOldSoftversion() {
        return oldSoftversion;
    }

    public void setOldSoftversion(Float oldSoftversion) {
        this.oldSoftversion = oldSoftversion;
    }

    public Integer getVersionCheck() {
        return versionCheck;
    }

    public void setVersionCheck(Integer versionCheck) {
        this.versionCheck = versionCheck;
    }

    public Float getNewSoftversion() {
        return newSoftversion;
    }

    public void setNewSoftversion(Float newSoftversion) {
        this.newSoftversion = newSoftversion;
    }

    public Long getSizeSoftversion() {
        return sizeSoftversion;
    }

    public void setSizeSoftversion(Long sizeSoftversion) {
        this.sizeSoftversion = sizeSoftversion;
    }

    public Integer getSizePacket() {
        return sizePacket;
    }

    public void setSizePacket(Integer sizePacket) {
        this.sizePacket = sizePacket;
    }

    public Long getFwId() {
        return fwId;
    }

    public void setFwId(Long fwId) {
        this.fwId = fwId;
    }

    public Integer getFwType() {
        return fwType;
    }

    public void setFwType(Integer fwType) {
        this.fwType = fwType;
    }

    public Integer getSeqPacket() {
        return seqPacket;
    }

    public void setSeqPacket(Integer seqPacket) {
        this.seqPacket = seqPacket;
    }

    public Integer getReadySeq() {
        return readySeq;
    }

    public void setReadySeq(Integer readySeq) {
        this.readySeq = readySeq;
    }

    public Integer getReCode() {
        return reCode;
    }

    public void setReCode(Integer reCode) {
        this.reCode = reCode;
    }

    public Date getOtaCreate() {
        return otaCreate;
    }

    public void setOtaCreate(Date otaCreate) {
        this.otaCreate = otaCreate;
    }

    public String getOtaBak() {
        return otaBak;
    }

    public void setOtaBak(String otaBak) {
        this.otaBak = otaBak == null ? null : otaBak.trim();
    }
}