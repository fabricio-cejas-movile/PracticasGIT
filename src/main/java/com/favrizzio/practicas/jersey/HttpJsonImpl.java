package com.favrizzio.practicas.jersey;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.type.TypeReference;

public class HttpJsonImpl {

    // private static final TypeReference<List<Object>> typeReference = new TypeReference<List<Object>>() {//
    // };

    private static final TypeReference<List<Map<String, Map<String, String>>>> typeReference = new TypeReference<List<Map<String, Map<String, String>>>>() {//
    };

    public static void main(String[] args) throws Exception {

        String url_posts = "http://movilesc.com/mibebe/wp-json/wp/v2/posts?filter[posts_per_page]=200&filter[order]=DESC&filter[category_name]=xmi-embarazo-sms&fields=title,content";

        String response = HttpUtils.doGet(url_posts, "application/json");

        System.out.println(response);

        List<Map<String, Map<String, String>>> listi = JsonUtils.fromJson(response, typeReference);

        System.out.println(listi.size());

        // for (Map<String, Map<String, String>> a : listi) {
        // System.out.println(a.get("title").get("rendered"));
        // System.out.println(a.get("content").get("rendered").replaceAll("\\n", "").replaceAll("\\<.*?>", ""));
        //
        // }

        // System.out.println(listi.get(0).get("title").get("rendered"));
    }

}
