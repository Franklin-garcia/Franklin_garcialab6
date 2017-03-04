/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

/**
 *
 * @author Franklin Garcia
 */
public class baleadas extends articulos{
    protected String ing1,ing2,ing3,ing4;

    public baleadas() {
        super();
    }

    public baleadas(String ing1, String ing2, String ing3, String ing4, int precio) {
        super(precio);
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
        this.ing4 = ing4;
    }

    public String getIng1() {
        return ing1;
    }

    public void setIng1(String ing1) {
        this.ing1 = ing1;
    }

    public String getIng2() {
        return ing2;
    }

    public void setIng2(String ing2) {
        this.ing2 = ing2;
    }

    public String getIng3() {
        return ing3;
    }

    public void setIng3(String ing3) {
        this.ing3 = ing3;
    }

    public String getIng4() {
        return ing4;
    }

    public void setIng4(String ing4) {
        this.ing4 = ing4;
    }

   
  
    
}
