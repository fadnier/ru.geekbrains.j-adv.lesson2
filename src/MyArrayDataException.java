public class MyArrayDataException extends NumberFormatException {
    private int i;
    private int j;
    private String value;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public String getValue() {
        return value;
    }

    public MyArrayDataException(String s, int i, int j, String value) {
        super(s);
        this.i = i;
        this.j = j;
        this.value = value;
    }
}
