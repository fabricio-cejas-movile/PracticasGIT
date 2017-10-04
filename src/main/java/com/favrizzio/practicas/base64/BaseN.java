package com.favrizzio.practicas.base64;
/**
 * 
 * This class previously had no author. Please insert yourself here if you're the author of this class.
 * @author Lucas Yuji Suguinoshita Aciole (lucas.aciole@gmail.com)
 *
 */
public enum BaseN {

    BASE2(2),
    BASE8(8),
    BASE16(16),
    BASE36(36),
    BASE64(64);

    private static final String BASE_CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+-";

    int base = 0;

    private BaseN(int val) {
        base = val;
    }

    private int getBase() {
        return this.base;
    }

    /**
     * Transforms a given decimal base number to a given base
     * @param decimalNumber
     * @return the resulting number on this base
     */
    public String convertDecimal(Long decimalNumber) {
        if (decimalNumber < 0) {
            throw new IllegalArgumentException("decimalNumber < 0 ");
        }
        return fromDecimalToOtherBase(getBase(), decimalNumber);
    }

    /**
     * Transforms a given number on this base to a decimal base number
     * @param baseNumber
     * @return
     */
    public Long revertToDecimal(String baseNumber) {

        return fromOtherBaseToDecimal(getBase(), baseNumber);
    }

    private static String fromDecimalToOtherBase(int base, Long decimalNumber) {

        if (decimalNumber.equals(0L)) {
            return String.valueOf(BASE_CHARACTERS.charAt(0));
        }

        StringBuffer sb = new StringBuffer();

        int mod = 0;
        Long x = 0L;
        Long baseL = new Long(base);

        while (decimalNumber != 0) {
            x = decimalNumber % baseL;
            mod = x.intValue();
            sb.append(BASE_CHARACTERS.charAt(mod));
            decimalNumber = decimalNumber / baseL;
        }

        return sb.reverse().toString();
    }

    private static Long fromOtherBaseToDecimal(int base, String number) {

        int iterator = number.length();
        Long returnValue = 0L;
        Long multiplier = 1L;
        Long baseL = new Long(base);

        while (iterator > 0) {
            returnValue = returnValue + (BASE_CHARACTERS.indexOf(number.substring(iterator - 1, iterator)) * multiplier);
            multiplier = multiplier * baseL;
            --iterator;
        }
        return returnValue;
    }
}