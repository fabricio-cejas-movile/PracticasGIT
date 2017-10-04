package com.favrizzio.practicas.jersey.bean;

import java.util.Map;

public class JsonSerialze {

    private String[] categories;

    private String urlWordpress;

    private String urlIral;

    private String defaultCategory;

    private Map<String, String> idCategories;

    /**
     * @return the categories
     */
    public String[] getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    /**
     * @return the urlWordpressDefault
     */
    public String getUrlWordpressDefault() {
        return urlWordpress;
    }

    /**
     * @param urlWordpressDefault the urlWordpressDefault to set
     */
    public void setUrlWordpressDefault(String urlWordpress) {
        this.urlWordpress = urlWordpress;
    }

    /**
     * @return the urlIral
     */
    public String getUrlIral() {
        return urlIral;
    }

    /**
     * @param urlIral the urlIral to set
     */
    public void setUrlIral(String urlIral) {
        this.urlIral = urlIral;
    }

    /**
     * @return the defaultCategory
     */
    public String getDefaultCategory() {
        return defaultCategory;
    }

    /**
     * @param defaultCategory the defaultCategory to set
     */
    public void setDefaultCategory(String defaultCategory) {
        this.defaultCategory = defaultCategory;
    }

    /**
     * @return the idCategories
     */
    public Map<String, String> getIdCategories() {
        return idCategories;
    }

    /**
     * @param idCategories the idCategories to set
     */
    public void setIdCategories(Map<String, String> idCategories) {
        this.idCategories = idCategories;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("[{categories: ").append(categories).append("},");

        sb.append("{urlWordpress: ").append(urlWordpress).append("},");

        sb.append("{urlIral: ").append(urlIral).append("},");

        sb.append("{defaultCategory: ").append(defaultCategory).append("},");

        sb.append("{idCategories: ").append(idCategories).append("}]");

        return sb.toString();
    }

}
