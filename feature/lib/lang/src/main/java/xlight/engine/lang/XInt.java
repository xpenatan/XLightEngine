package xlight.engine.lang;

public class XInt extends XPrimitive {
    private int value;

    public XInt() {
    }

    public XInt(int value) {
        this.value = value;
    }

    @Override
    public void onReset() {
        value = 0;
        super.onReset();
    }

    @Override
    public TYPE getType() {
        return TYPE.Integer;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public void intValue(int value) {
        this.value = value;
    }

    @Override
    public void longValue(long value) {
        this.value = (int)value;
    }

    @Override
    public void floatValue(float value) {
        this.value = (int)value;
    }

    @Override
    public void doubleValue(double value) {
        this.value = (int)value;
    }

    @Override
    public void byteValue(byte value) {
        this.value = value;
    }

    @Override
    public void shortValue(short value) {
        this.value = value;
    }

    @Override
    public boolean booleanValue() {
        return value == 0 ? false : true;
    }

    @Override
    public void booleanValue(boolean value) {
        this.value = (value ? 1 : 0);
    }

    @Override
    public char charValue() {
        return 0;
    }

    @Override
    public void charValue(char value) {
    }

    @Override
    public boolean equals(int value) {
        if(this.value == value)
            return true;
        return false;
    }

    @Override
    public boolean equals(long value) {
        if(this.value == value)
            return true;
        return false;
    }

    @Override
    public boolean equals(float value) {
        if(this.value == value)
            return true;
        return false;
    }

    @Override
    public boolean equals(double value) {
        if(this.value == value)
            return true;
        return false;
    }

    @Override
    public boolean equals(byte value) {
        if(this.value == value)
            return true;
        return false;
    }

    @Override
    public boolean equals(short value) {
        if(this.value == value)
            return true;
        return false;
    }

    @Override
    public boolean equals(boolean value) {
        try {
            throw new Exception("Cannot compare int with boolean");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean equals(char value) {
        if(this.value == value)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
