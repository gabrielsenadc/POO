

public class Ponto {
    private double x, y;

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto p){
        double x_diff = p.getX() - this.getX();
        double y_diff = p.getY() - this.getY();

        return Math.sqrt((x_diff * x_diff) + (y_diff * y_diff));
    }

}