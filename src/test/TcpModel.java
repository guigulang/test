package test;

public class TcpModel {

	private Integer frameType;
	private String devSN;
	private Integer devType;
	
	private String devName;
	private String devMac;
	private String proKey;
	
	private Long devId;
	private Long connCount;
	
	private Long heartNum;
	
	private Long timeSynNum;
	private String timeSynInfo;
	
	private Long ctrlRespMsg;
	

	public Integer getFrameType() {
		return frameType;
	}

	public void setFrameType(Integer frameType) {
		this.frameType = frameType;
	}

	public String getDevSN() {
		return devSN;
	}

	public void setDevSN(String devSN) {
		this.devSN = devSN;
	}

	public Integer getDevType() {
		return devType;
	}

	public void setDevType(Integer devType) {
		this.devType = devType;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevMac() {
		return devMac;
	}

	public void setDevMac(String devMac) {
		this.devMac = devMac;
	}

	public String getProKey() {
		return proKey;
	}

	public void setProKey(String proKey) {
		this.proKey = proKey;
	}

	public Long getDevId() {
		return devId;
	}

	public void setDevId(Long devId) {
		this.devId = devId;
	}


	public Long getConnCount() {
		return connCount;
	}

	public void setConnCount(Long connCount) {
		this.connCount = connCount;
	}

	public Long getHeartNum() {
		return heartNum;
	}

	public void setHeartNum(Long heartNum) {
		this.heartNum = heartNum;
	}

	public Long getTimeSynNum() {
		return timeSynNum;
	}

	public void setTimeSynNum(Long timeSynNum) {
		this.timeSynNum = timeSynNum;
	}

	public String getTimeSynInfo() {
		return timeSynInfo;
	}

	public void setTimeSynInfo(String timeSynInfo) {
		this.timeSynInfo = timeSynInfo;
	}

	public Long getCtrlRespMsg() {
		return ctrlRespMsg;
	}

	public void setCtrlRespMsg(Long ctrlRespMsg) {
		this.ctrlRespMsg = ctrlRespMsg;
	}

	
}
