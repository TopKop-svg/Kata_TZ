public enum RomeNubers {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

    private int value;

    RomeNubers(int value) {
        this.value = value;
    }



    public int getValue() {
        return value;
    }

    public static int romanToDecimal(String roman) {
        try {
            return valueOf(roman).getValue();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid Roman numeral: " + roman);
        }
    }
}
