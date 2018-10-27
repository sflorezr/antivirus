/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author sflorezr
 */
public class virus {
    private String nombre_virus;
    private byte[] secuenciaVirus;

    public virus(String nombre_virus, byte[] secuenciaVirus) {
        this.nombre_virus = nombre_virus;
        this.secuenciaVirus = secuenciaVirus;
    }



    public String getNombre_virus() {
        return nombre_virus;
    }

    public byte[] getSecuenciaVirus() {
        return secuenciaVirus;
    }


}
