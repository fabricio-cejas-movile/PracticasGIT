package com.practicas.git.builders;


public class ChannelsMoSubs {
	
	private String applicationId;
	private String referenceId;
	private String channelId;
	private String channelName;
	private String lastPublishTime;
	
	
	public ChannelsMoSubs(String applicationId, String referenceId,
			String channelId, String channelName, String lastPublishTime) {
		super();
		this.applicationId = applicationId;
		this.referenceId = referenceId;
		this.channelId = channelId;
		this.channelName = channelName;
		this.lastPublishTime = lastPublishTime;
	}
	
	public String getLastPublishTime() {
		return lastPublishTime;
	}
	public void setLastPublishTime(String lastPublishTime) {
		this.lastPublishTime = lastPublishTime;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	
	@Override
	public String toString(){
		StringBuffer sb  = new StringBuffer();
		sb.append("{");
		sb.append("applicationId: ").append(applicationId).append(", ");
		sb.append("referenceId: ").append(referenceId).append(", ");
		sb.append("channelId: ").append(channelId).append(", ");
		sb.append("channelName: ").append(channelName).append(", ");
		sb.append("lastPublishTime: ").append(lastPublishTime);
		sb.append("}");
		return sb.toString();
	}
}
