package javamtkompleksnibroj;

class KompleksniBroj {

    private double r, i;

    public KompleksniBroj() {
    }

    public KompleksniBroj(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double Re() {
        return r;
    }

    public double Im() {
        return i;
    }

    public double moduo() {
        return Math.sqrt(r * r + i * i);
    }

    //staticki metod za konjugovan kompleksni broj
    //KompleksniBroj z = x.konjugovanBroj();
    public KompleksniBroj konjugovaniBroj() {
        return new KompleksniBroj(this.r, -this.i);
    }

    public static KompleksniBroj zbir(
            KompleksniBroj a, KompleksniBroj b) {
        return new KompleksniBroj(a.r + b.r, a.i + b.i);

    }

    public KompleksniBroj dodaj(KompleksniBroj a) {
        return new KompleksniBroj(this.r + a.r, this.i + a.i);
    }

    public static KompleksniBroj proizvod(
            KompleksniBroj a, KompleksniBroj b) {
        return new KompleksniBroj(a.r * b.r - a.i * b.i, a.r * b.i + a.i * b.r);

    }

    public KompleksniBroj pomnozi(KompleksniBroj a) {
        return new KompleksniBroj(this.r * a.r - this.i * a.i, this.r * a.i + this.i * a.r);
    }

    @Override
    public String toString() {
        return "KompleksniBroj{" + "r=" + r + ", i=" + i + '}';
    }

}
