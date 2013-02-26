package com.practicas.git.memory;

import java.util.Date;

public class WapInfoBO {

    private Integer idResultData;
    private String pixel;
    private Boolean conversion;
    private String statusError;
    private String pixelType;
    private String uuid;
    private String referenceId;
    private String exception;
    private String phone;
    private Date datetime;
    private String sbsStatus;
    private Long applicationId;
    private String carrier;
    private String url;
    private String page;
    private String origenIp;
    private String header;
    private String tematica;
    private String landingPage;
    private String keyWord;
    private String dayInserted;
    private String timeInserted;
    private String operator;
    private String country;
    private String op;
    private String userAgent;
    
    public WapInfoBO(Integer idResultData, String pixel, Boolean conversion,
			String statusError, String pixelType, String uuid,
			String referenceId, String exception, String phone, Date datetime,
			String sbsStatus, Long applicationId, String carrier, String url,
			String page, String origenIp, String header, String tematica,
			String landingPage, String keyWord, String dayInserted,
			String timeInserted, String operator, String country, String op,
			String userAgent) {
		super();
		this.idResultData = idResultData;
		this.pixel = pixel;
		this.conversion = conversion;
		this.statusError = statusError;
		this.pixelType = pixelType;
		this.uuid = uuid;
		this.referenceId = referenceId;
		this.exception = exception;
		this.phone = phone;
		this.datetime = datetime;
		this.sbsStatus = sbsStatus;
		this.applicationId = applicationId;
		this.carrier = carrier;
		this.url = url;
		this.page = page;
		this.origenIp = origenIp;
		this.header = header;
		this.tematica = tematica;
		this.landingPage = landingPage;
		this.keyWord = keyWord;
		this.dayInserted = dayInserted;
		this.timeInserted = timeInserted;
		this.operator = operator;
		this.country = country;
		this.op = op;
		this.userAgent = userAgent;
	}
	public void setIdResultData(Integer idResultData) {
        this.idResultData = idResultData;
    }
    public Integer getIdResultData() {
        return idResultData;
    }
    public String getPixel() {
        return pixel;
    }
    public void setPixel(String pixel) {
        this.pixel = pixel;
    }
    public Boolean isConversion() {
        return conversion;
    }
    public void setConversion(Boolean conversion) {
        this.conversion = conversion;
    }
    public String getStatusError() {
        return statusError;
    }
    public void setStatusError(String statusError) {
        this.statusError = statusError;
    }
    public String getPixelType() {
        return pixelType;
    }
    public void setPixelType(String pixelType) {
        this.pixelType = pixelType;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getReferenceId() {
        return referenceId;
    }
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
    public String getException() {
        return exception;
    }
    public void setException(String exception) {
        this.exception = exception;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Date getDatetime() {
        return datetime;
    }
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    public String getSbsStatus() {
        return sbsStatus;
    }
    public void setSbsStatus(String sbsStatus) {
        this.sbsStatus = sbsStatus;
    }
    public Long getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }
    public String getOrigenIp() {
        return origenIp;
    }
    public void setOrigenIp(String origenIp) {
        this.origenIp = origenIp;
    }
    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
    /**
     * @return the tematica
     */
    public String getTematica() {
        return tematica;
    }
    /**
     * @param tematica the tematica to set
     */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    /**
     * @return the landingPage
     */
    public String getLandingPage() {
        return landingPage;
    }
    /**
     * @param landingPage the landingPage to set
     */
    public void setLandingPage(String landingPage) {
        this.landingPage = landingPage;
    }
    /**
     * @return the keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }
    /**
     * @param keyWord the keyWord to set
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    /**
     * @return the dayInserted
     */
    public String getDayInserted() {
        return dayInserted;
    }
    /**
     * @param dayInserted the dayInserted to set
     */
    public void setDayInserted(String dayInserted) {
        this.dayInserted = dayInserted;
    }
    /**
     * @return the timeInserted
     */
    public String getTimeInserted() {
        return timeInserted;
    }
    /**
     * @param timeInserted the timeInserted to set
     */
    public void setTimeInserted(String timeInserted) {
        this.timeInserted = timeInserted;
    }
    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }
    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }
    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }
    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * @return the conversion
     */
    public Boolean getConversion() {
        return conversion;
    }
    /**
     * @return the op
     */
    public String getOp() {
        return op;
    }
    /**
     * @param op the op to set
     */
    public void setOp(String op) {
        this.op = op;
    }
    /**
     * @return the userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }
    /**
     * @param userAgent the userAgent to set
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        
        sb.append("{inserted-time: "+ datetime.toString() +"}");
        sb.append("{exception: "+ exception +"}");
        sb.append("{header: "+ header +"}");
        sb.append("{origenIp: "+ origenIp +"}");
        sb.append("{page: "+ page +"}");
        sb.append("{phone: "+ phone +"}");
        sb.append("{pixel: "+ pixel +"}");
        sb.append("{pixelType: "+ pixelType +"}");
        sb.append("{referenceId: "+ referenceId +"}");
        sb.append("{sbsStatus: "+ sbsStatus +"}");
        sb.append("{statusError: "+ statusError +"}");
        sb.append("{Url: "+ url +"}");
        sb.append("{uuid: "+ uuid +"}");
        sb.append("{user-agent: "+ userAgent +"}");
        
        sb.append("]");
        
        return sb.toString();
    }
}