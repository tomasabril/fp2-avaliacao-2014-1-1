package utfpr.ct.dainf.if62c.avaliacao;
import java.util.*;

/**
 * Representa uma poligonal fechada.
* @author Tomás Abril <tomas.abril@gmail.com>
 */
public class Poligonal {
    private Ponto[] vertices;
    
    /**
     * Construtor que inicializa a poligonal com um vetor de vértices recebido.
     * @param vertices Os vértices da poligonal
     */
    public Poligonal(Ponto[] vertices) {
        this.vertices = vertices; }
    
    /**
     * Construtor que inicializa um vetor de n+1 vértices.
     * @param n O número de vértices da poligonal
     */
    public Poligonal(int n) {
	n++;
	vertices = new Ponto[n];
	for(int i=0; i<n; i++) {
	    this.vertices[i] = new Ponto(0,0); } }

    public Ponto getVertice(int i) {
        if(i>=0 && i<vertices.length) {
            return vertices[i]; }
        else {
            return null; } }
    
    public void setVertice(int i, double xn, double yn) {
        if(i>=0 && i<vertices.length) {
	    this.vertices[i].setXY(xn, yn); } }
    
    public void setVertice(int i, Ponto vertice) {
	if(i>=0 && i<vertices.length) {
		double x = vertice.getX();
		double y = vertice.getY();
		vertices[i].setXY(x, y); } }
    
    public double getArea() {
        double area=0;
        for(int i=1; i < this.vertices.length; i++) {
            area += ( this.vertices[i].getX() - this.vertices[i-1].getX() )
              *( this.vertices[i].getY() + this.vertices[i-1].getY() ); }
        area = Math.abs(area)/2;
        return area; }
    
    public double getPerimetro() {
        double per=0;
        for(int i=1; i < this.vertices.length; i++) {
            per += Math.pow((this.vertices[i].getX() - this.vertices[i-1].getX() ), 2)
              + Math.pow(( this.vertices[i].getY() - this.vertices[i-1].getY() ), 2);
            per= Math.sqrt(per); }
        return per; }
    
}































