/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

/**
 *
 * @author Besso
 */
public class Java2 {
    private String ciudad;
    private String matricula;
    private String distrito;
    private int tipoMotor;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public Java2 (String valorMatricula, String valorDistrito, int valorTipoMotor){
        ciudad = "México D.F";
        matricula = valorMatricula;
        distrito = valorDistrito;
        tipoMotor = valorTipoMotor;
    }
    public String getMatricula () { return matricula; }
    public String getDistrito () { return distrito; }
    public int getTipoMotor () { return tipoMotor; }
    
}
