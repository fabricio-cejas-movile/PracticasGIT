package com.favrizzio.practicas.lombok;

/**
 * @author Fabricio Cejas - fabricio.cejas@movile.com
 */
@lombok.Getter
@lombok.Setter
@lombok.ToString
public class TyntecResponse {

    private String userName;

    private String password;

    /**
     * Possible Value: UUID according to RFC 4122
     * Description: The unique identifier provided for each request.
     */
    private String requestId;

    /**
     * Possible Value: Phone number according to ITU E.164
     * Description: The phone number of interest given in international format.
     */
    private String msisdn;

    /**
     * Possible Value: UTF-8 encoded string according to ITU E.212
     * Description: A representative MCC (Mobile Country Code) of the operator.
     */
    private String mcc;

    /**
     * Possible Value: UTF-8 encoded strong according to ITU E.212
     * Description: A representative MNC (Mobile Network Code) of the operator.
     */
    private String mnc;

    /**
     * Possible Value: Integer
     * Description: The tyntec ID of the operator. The mapping can be found in the Customer Lounge (https://customerlounge.tyntec.com/resource-center.html)
     */
    private Integer ttId;

    /**
     * Possible Value: String
     * Description: The human readable name of the operator.
     */
    private String operator;

    /**
     * Possible Value: Country code following ISO 3166-1 alpha-3
     * Description: The three-letter country code where the operator is located.
     */
    private String country;

    /**
     * Possible Value: +HH:mm (according to ISO 8601)
     * Description: The operator’s local time zone relative to UTC.
     */
    private String timeZone;

    /**
     * Possible Value: UTF-8 encoded string
     * Description: Technology used by the operator’s network. Possible values are: GSM, MVNO GSM, GSM/CDMA, Satellite, CDMA, iDen, iDen/GSM, Pager, Fixed.
     */
    private String technology;

    /**
     * Possible Value: boolean
     * Description: An indication of the porting status (yes/no).
     */
    private String ported;

    /**
     * Possible Value: float
     * Description: The price for the query.
     */
    private Float price;

    /**
     * Possible Value: Currency code following ISO 4217
     * Description: The currency in which the pricing is given; corresponding to the currency of the invoice.
     */
    private String currency;

    /**
     * Possible Value: Date in the format “yyyy-MM-ddTHH:mm:ss” (according to ISO 8601)
     * Description: The date when “price” became effective.
     */
    private String priceEffective;

    /**
     * Possible Value: Possible values for “errorCode” can be found in the document “Error Codes”
     * Description: See in Enum Class com.movile.pele.entity.TynctecResponseCodes
     */
    private String errorCode;

}
