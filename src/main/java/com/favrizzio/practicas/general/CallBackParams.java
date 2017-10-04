package com.favrizzio.practicas.general;

/**
 * Enum class for manage Error and Success Codes.
 * @author Fabricio Cejas - fabricio.cejas@movile.com
 */
public enum CallBackParams {

    SUCCESS_TRANSACTION(0, "La operación fue realizada de forma exitosa sin ningún error", "S"),
    SOME_INVALID_PARAM(3001, "Existe algún parámetro inválido", "P"),
    INVALID_AUTHENTICATE(3002, "Los parámetros de Usuario o contraseña son inválidos", "P"),
    EXPIRED_DATE(3003, "La fecha de validación caduco", "P"),
    FAIL_TRANSACTION(3004, "La operación no fue realizada de forma exitosa", "T"),
    SYSTEM_ERROR(3005, "Ocurrió un error en la plataforma", "T"),
    INVALID_SSO_TOKEN(3006, "El token no se validó como correcto", "P"),
    UNKOWN_CSP(1, "Error de sistema. CSP no está autenticado", "P"),
    DISABLED_CSP(2, "Error de sistema. CSP no tiene suficiente autorización", "P"),
    UNKOWN_CLIENT(3, "No es un cliente de Personal", "P"),
    UNKOWN_SERVICE(4, "Error de sistema. El id de servicio no está relacionado a ningún servicio", "P"),
    DISABLED_USER(5, "El usuario no se suscribió al cobro del servicio (No es aplicable en esta versión)", "P"),
    INSUFFICIENT_CREDIT(6, "El cliente no tiene crédito suficiente para realizar el pago.", "P"),
    UNAVAILABLE_ASSESSOR(7, "Error de sistema. El sistema de tasación de Personal no está disponible.", "T"),
    UNABILITY_CALCULATE_COST_RATE(9, "Error de sistema. El sistema no pudo calcular el costo de la tarifa para este servicio", "P"),
    FORBIDDEN_SERVICE(10, "Error de sistema. La cantidad de clientes destinos es mayor a la cantidad permitida", "P"),
    MANDATORY_SCP(16, "Error de sistema. El campo PDC P está vacío", "P"),
    MANDATORY_SCP_USER(17, "Error de sistema. No se pudo hacer el cobro. No se pudo hacer el cobro. El campo USER está vacío", "P"),
    MANDATORY_SCP_PASSWORD(18, "Error de sistema. No se pudo hacer el cobro. El campo PASSWORD está vacío", "P"),
    MANDATORY_DESTINATION(19, "Error de sistema. No se pudo hacer el cobro. El campo Usuario Destino está vacío", "P"),
    MANDATORY_MSISDN(20, "Error de sistema. No se pudo hacer el cobro. El campo MSISDN está vacío", "P"),
    MANDATORY_SERVICE_ID(21, "Error de sistema. No se pudo hacer el cobro. El campo service_id está vacío", "P"),
    INVALID_REQUEST(24, "Error de sistema. La solicitud enviada es errónea", "P"),
    UNKOWN_FUNCTION(25, "Error de sistema. La función solicitada no está dentro de las disponibles en el sistema", "P"),
    INVALID_MSISDN_FORMAT(27, "El formato del MSISDN no pertenece al plan numérico de Argentina", "T"),
    INVALID_AUTHENTICATION(28, "Error de sistema. Usuario o Password inválidos.", "P"),
    BLOCKED_USER(49, "El usuario esta en estado bloqueado", "P"),
    DISABLED_SERVICE_FOR_USER(55, "El tipo de usuario (TOU) no está P habilitado para la lógica de detección", "P"),
    DISABLED_SERVICE_FOR_UNCERTIFICATED_USER(56, "Error de sistema. Servicio no habilitado para usuarios sin un certificado de identidad", "P"),
    DISABLED_SERVICE_FOR_PREACTIVATED_USER(57, "Servicio no habilitado para usuarios en un estado de pre-activación", "P"),
    PREPAID_USER_UNABILITY_IN_NETWORK(58, "EL usuario está en un estado de red no habilitado para utilizar el servicio", "P"),
    FORBIDDEN_BILLING(68, "Error de sistema. Solicitud de billing no permitida", "P"),
    FORBIDDEN_COMMAND_FOR_PIN_SERVICE(106, "Error de sistema. Los servicios configurados para PIN Billing no permiten el comando Check And Bill", "P"),
    SUCCESS_PARTIAL_BILLING(201, "Servicio contratado OK y cobrado parcialmente", "P"),
    SUCCESS_POST_BILLING(202, "Servicio contratado OK. Se reintentara el cobro posteriormente", "P"),
    CHARGE_FREE(1000, "No se realizó el cobro. Se toma como tarifa gratuita. No se debe reintentar", "S"),
    SYSTEM_ERROR_1001(
            1001,
            "Fallas ocasionadas por problemas dentro de la plataforma. Se debe reintentar 3 veces máximo y si no responde, descartar la transacción",
            "T"),
    NO_VALIDATE_TRAFFIC(1002, "No se pudo validar el punto de tráfico. Se puede reintentar hasta 3", "P"),
    SERVICE_NOT_FOUND(1010, "El usuario no contrató el servicio y se está intentando consumir algún contenido del mismo.", "P"),
    PRESENT_OPTIN(1011, "Se requiere que se re-direccione a la página de Optin. Incluye además el TOKEN de OPTIN en Ret_Msg", "P"),
    USER_NOT_SUBSCRIBED(1101, "Se intenta realizar una de descarga a un servicio y el usuario no está suscripto", "P"),
    REQUEST_NO_AUTHORIZED(1102, "Excedió el límite de contenidos", "P"),
    NOT_FOUND(9999, "", "P");

    private Integer code;
    private String description;
    private String type;

    private CallBackParams(Integer code, String description, String type) {
        this.code = code;
        this.description = description;
        this.type = type;
    }

    /**
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    static CallBackParams getStatusById(int idi) {

        CallBackParams param = null;
        
        int i = idi;

        for (CallBackParams callBackParam : CallBackParams.values()) {
            System.out.println(callBackParam.code);
            if (callBackParam.code == idi) {
                param = callBackParam;
            }
        }
        
        if (param == null){
            param = NOT_FOUND;
        }

        return param;
    }

}
