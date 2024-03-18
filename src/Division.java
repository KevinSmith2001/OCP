
public class Division implements Operation {
    @Override
    public double doOperation(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Divider cannot be 0.");
        return a / b;
    }
}