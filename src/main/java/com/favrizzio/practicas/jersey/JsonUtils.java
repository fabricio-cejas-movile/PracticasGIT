/**
 * Movile S.A. | CONNECT > EVERYONE
 */
package com.favrizzio.practicas.jersey;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.MapUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * JSON Utils class. Provides several methods for JSON handling.
 * @author Ronaldo R. Nascimento (ronaldo.ronie@movile.com)
 * @author Andrew Willard Silva (andrew.silva@movile.com)
 * @author Fernando Matias Balieiro (fernando.balieiro@movile.com)
 */
public class JsonUtils {

    // private static final Logger EXCEPTIONS_LOGGER = LoggerFactory.getLogger("exceptions");
    // private static final Logger SYSTEM_LOGGER = LoggerFactory.getLogger("system");

    public static final Type STRING_STRING_TYPE = new TypeToken<Map<String, String>>() {//
    }.getType();

    private static final Gson GSON = new Gson();
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * Retrieves an element from a JSON using Google GSON API.
     * @param json
     * @param element
     * @return
     */
    public static String getElementValue(final String json, final String element) {

        Map<String, String> map = GSON.fromJson(json, STRING_STRING_TYPE);

        if (MapUtils.isEmpty(map)) {
            return null;
        }

        return map.get(element);
    }

    /**
     * Creates a JSON String based on the given key and value using Google GSON API.
     * @param key
     * @param value
     * @return
     */
    public static String createJson(final String key, final String value) {
        Map<String, String> map = new HashMap<>();
        map.put(key, value);

        return GSON.toJson(map);
    }

    /**
     * Verifies if the given JSON contains the given key using Google GSON API.
     * @param json
     * @param key
     * @return
     */
    public static Boolean containsKey(final String json, final String key) {

        Map<String, String> map = GSON.fromJson(json, STRING_STRING_TYPE);
        Boolean contains = Boolean.FALSE;

        if (MapUtils.isNotEmpty(map) && map.containsKey(key)) {
            contains = Boolean.TRUE;
        }

        return contains;

    }

    /**
     * Appends a key and a value to an existing JSON using Google GSON API.
     * @param json
     * @param key
     * @param value
     * @return
     */
    public static String appendJson(final String json, final String key, final String value) {

        Map<String, String> map = GSON.fromJson(json, STRING_STRING_TYPE);

        if (map == null) {
            map = new HashMap<>();
        }

        map.put(key, value);
        return GSON.toJson(map);
    }

    /**
     * Converts the given Object to a JSON String using Jackson API.
     * @param object
     * @return
     */
    public static String toJson(final Object object) {
        try {
            return MAPPER.writeValueAsString(object);
        } catch (IOException e) {
            // EXCEPTIONS_LOGGER.error("An Error has occurred when converting Object [{}] to JSON: {}", object, e.getMessage(), e);
        }
        return null;
    }

    /**
     * Converts the given Object to a JSON String using Google GSON API.
     * @param object
     * @return
     */
    public static String toJson(final Object object, final Type type) {
        try {
            return GSON.toJson(object, type);
        } catch (Exception e) {
            // EXCEPTIONS_LOGGER.error("An Error has occurred when converting Object [{}] to JSON: {}", object, e.getMessage(), e);
        }
        return null;
    }

    /**
     * Converts a JSON String to an Object using Jackson API.
     * @param json
     * @param typeRef
     * @return
     */
    public static <T> T fromJson(final String json, final TypeReference<T> typeRef) {
        try {
            return MAPPER.readValue(json, typeRef);
        } catch (IOException e) {
            System.out.println(e);
            // EXCEPTIONS_LOGGER.error("An Error has occurred when converting JSON [{}] to Object: {}", json, e.getMessage(), e);
        }
        return null;
    }

    /**
     * Converts a JSON String to an Object using Google GSON API.
     * @param json
     * @param type
     * @return
     */
    public static <T> T fromJson(final String json, final Type type) {
        try {
            return GSON.fromJson(json, type);
        } catch (Exception e) {
            System.out.println(e);
            // EXCEPTIONS_LOGGER.error("An Error has occurred when converting JSON [{}] to Object: {}", json, e.getMessage(), e);
        }
        return null;
    }

    /**
     * Converts a JSON String to an Object using Google GSON API. Invalid strings are not considered error.
     * @param json
     * @param type
     * @return
     */
    public static <T> T fromJsonSilent(final String json, final Type type) {

        try {
            return GSON.fromJson(json, type);
        } catch (Exception e) {
            // SYSTEM_LOGGER.warn("An Error has occurred when converting JSON [{}] to Object: {}", json, e.getMessage(), e);
        }
        return null;
    }

    /**
     * <p>
     * isValid.
     * </p>
     * @param json a {@link java.lang.String} object.
     * @return a {@link java.lang.Boolean} object.
     */
    @SuppressWarnings("unchecked")
    public static Boolean isValid(final String json) {
        Map<String, Object> map = new HashMap<>();
        try {
            map = MAPPER.readValue(json, Map.class);
            if (MapUtils.isEmpty(map)) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
