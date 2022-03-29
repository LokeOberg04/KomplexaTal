import java.util.Objects;

public class Komplex
{
    public Komplex(double a) {
        this.a = a;
    }

    double a;
    double b;

    public Komplex(double v, double v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return Double.compare(komplex.a, a) == 0 && Double.compare(komplex.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Komplex{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Komplex add(Komplex b)
    {
        Komplex z = new Komplex(a + b.a,this.b + b.b);
        return z;
    }

    public Komplex multiply(Komplex b)
    {
        Komplex z = new Komplex(a * b.a - this.b * b.b, this.b * b.a + a * b.b);
        return z;
    }

    public double arg()
    {
        double x = Math.atan(b/a);
        return x;
    }

}