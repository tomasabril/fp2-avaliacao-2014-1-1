package utfpr.ct.dainf.if62c.avaliacao;

/**
 * Representa um ponto no plano.
 * @author Tomás Abril <tomas.abril@gmail.com>
 */
public class Ponto {
    
    // as coordenadas do ponto
    private double x;
    private double y;
    
    /**
     * Construtor que inicializa as coordenadas do ponto.
     * @param x A coordenada x do ponto
     * @param y A coordenada y do ponto
     */
    public Ponto(double x, double y) {
        // TODO: inicialize as coordenadas do ponto
        this.x = x;
        this.y = y; }
    
    public double getX() {
        return this.x; }
    public double getY() {
        return this.y; }
    public void setXY(double xn, double yn) {
        this.x = xn;
        this.y = yn; }
    /**
     * Retorna uma representação textual do ponto no formato (x, y).
     * @return 
     */
    @Override
    public String toString() {
        // TODO: retona um String com as coordenadas do ponto no formato (x, y),
        // por exemplo, (1,11, 2,22) para um ponto com coordenadas x = 1.11 e
        // y = 2.22
        StringBuilder s = new StringBuilder();
        s.append("(");
        s.append(this.x);
        s.append(", ");
        s.append(this.y);
	s.append(")");
        return s.toString(); }   
}
