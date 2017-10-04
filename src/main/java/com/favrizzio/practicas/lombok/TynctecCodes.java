package com.favrizzio.practicas.lombok;

import java.util.Arrays;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 * @author Fabricio Cejas - fabricio.cejas@movile.com
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@lombok.Getter
public enum TynctecCodes {

    SUCCESS(200, "Network information will be supplied within the response"),
    BAD_REQUEST(400, "Any of the provided parameters is invalid or callbackUrl is not reachable"),
    UNAUTHORIZED(401, "HTTP basic authentication parameters are invalid"),
    FORBIDDEN(403, "HTTP basic authentication parameters are missing"),
    METHOD_NOT_ALLOWED(405, "Request method is not support (this service only supports GET)"),
    NOT_ACCEPTABLE(415, "Media type is not supported."),
    INTERNAL_ERROR(500, "Internal server error"),
    UNKOWN_ERROR(0, "unkown error");

    private Integer code;

    private String description;

    public static TynctecCodes getValueByCode(Integer statusCode) {
        return Arrays.stream(TynctecCodes.values()).filter(_enum -> _enum.code.equals(statusCode)).findFirst().orElse(TynctecCodes.UNKOWN_ERROR);
    }
}
