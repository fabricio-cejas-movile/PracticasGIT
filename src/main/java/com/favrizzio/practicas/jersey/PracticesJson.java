package com.favrizzio.practicas.jersey;

import java.lang.reflect.Type;

import practicas.jersey.beans.JsonSerialze;

import com.google.gson.reflect.TypeToken;

public class PracticesJson {

    private Long id;
    private String atlasProfile;
    private Integer carrierId;
    private String extraInfo;

    private static final Type EXTRA_INFO_TYPE = new TypeToken<JsonSerialze>() {
    }.getType();

    public static void main(String[] args) {

        PracticesJson json = PracticesJson.getConfigurationDefault();

        JsonSerialze tu = JsonUtils.fromJson(json.getExtraInfo(), EXTRA_INFO_TYPE);

        System.out.println(tu);

        for (String cat : tu.getCategories()) {
            System.out.println(cat);
            System.out.println(tu.getIdCategories().get(cat));
        }

    }

    public static PracticesJson getConfigurationDefault() {

        PracticesJson incentive = new PracticesJson();
        incentive.setId(1L);
        incentive.setAtlasProfile("");
        incentive.setCarrierId(0);
        incentive
                .setExtraInfo("{\"appId\":855, \"urlIral\":\"http://iral.ch/DN/?\", \"urlwordpress\":\"http://movilesc.com/mibebe/wp-json/wp/v2/posts?filter[posts_per_page]=500&filter[order]=DESC&filter[category_name]={0}-sms&filter[tag]=sms&fields=title,content\", \"categories\":[\"mi-embarazo\",\"mi-bebe\",\"sin-categoria\"], \"idCategories\":{\"mi-embarazo\":\"100001\",\"mi-bebe\":\"100002\",\"sin-categoria\":\"100000\"},\"defaultCategory\":\"sin-categoria\"}");

        return incentive;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the atlasProfile
     */
    public String getAtlasProfile() {
        return atlasProfile;
    }

    /**
     * @param atlasProfile the atlasProfile to set
     */
    public void setAtlasProfile(String atlasProfile) {
        this.atlasProfile = atlasProfile;
    }

    /**
     * @return the carrierId
     */
    public Integer getCarrierId() {
        return carrierId;
    }

    /**
     * @param carrierId the carrierId to set
     */
    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    /**
     * @return the extraInfo
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * @param extraInfo the extraInfo to set
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

}
