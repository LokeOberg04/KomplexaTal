public class Komplex
{
    double a;
    double b;

    public Komplex(double v, double v1) {
    }

    public Komplex add(Komplex b)
    {
        Komplex z3 = new Komplex(a + b.a,this.b + b.b);
        return z3;
    }

    public Komplex multiply(Komplex b)
    {
        return b;
    }

    public double arg()
    {
        return a;
    }

}