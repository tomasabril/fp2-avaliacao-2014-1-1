/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* @author Tomás Abril <tomas.abril@gmail.com>
 */

package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1013343
 */
public class Avaliacao1 {
    
    public static void main(String[] args) {
        /*Ponto[] poligo;
        poligo = new Ponto[3]; //{(3,3),(1,1),(9,1),(6,3)};
        poligo[0].setXY(3, 3);
        poligo[1].setXY(1, 1);
        poligo[2].setXY(9, 1);
        poligo[3].setXY(6, 3);
        
        Poligonal poligonal = new Poligonal(poligo);
        */
        Poligonal polig = new Poligonal(4);
        polig.setVertice(0, 3, 3);
        polig.setVertice(1, 1, 1);
        polig.setVertice(2, 9, 1);
        polig.setVertice(3, 6, 3);
        
	
        System.out.println("area: " + polig.getArea() );
        System.out.println("perimetro: " + polig.getPerimetro() );
        
    }
}
