public class Example {
    private int number1;
    private int number2;

    public Example(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example integer = (Example) o;
        return number1 == integer.number1 && number2 == integer.number2 || number2 == integer.number1 && number1 == integer.number2;
    }

    @Override
    public int hashCode() {
        return (number1 * number2);
    }

    @Override
    public String toString() {
        return (number1 + " * " + number2 + " = ");

    }
}
