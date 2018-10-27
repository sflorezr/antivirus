/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.virus;

/**
 *
 * @author sflorezr
 */
public class Analizador {
    private virus[] listaVirus=new virus[3];
    private byte [] contenidoArchivo;

    public Analizador(byte[] contanidoarchivo) {
        this.contenidoArchivo = contanidoarchivo;
    }
    public void cargarvirus(){
        byte [] usama={111,106,101,99};
        byte [] amtras={72,72,15,29};
        byte [] ebola={29,32,53,29};
        
        listaVirus[0]=new virus("Usama", usama);
        listaVirus[1]=new virus("amtras", amtras);
        listaVirus[2]=new virus("ebola", ebola);
    }
    
    public void Analizar(){
        cargarvirus();
        for (int i = 0; i < contenidoArchivo.length; i++) {
             if (contenidoArchivo [i] == listaVirus[0].getSecuenciaVirus()[0]) {
                if (contenidoArchivo [i+1] == listaVirus[0].getSecuenciaVirus()[1]) {
                    if (contenidoArchivo [i+2] == listaVirus[0].getSecuenciaVirus()[2]) {
                        if (contenidoArchivo [i+3] == listaVirus[0].getSecuenciaVirus()[3]) {
                            
                            System.out.println("Virus Usama detectado");
                        }
                        
                    }
                    
                }
                
            }
            
            if (contenidoArchivo [i] == listaVirus[1].getSecuenciaVirus()[0]) {
                if (contenidoArchivo [i+1] == listaVirus[1].getSecuenciaVirus()[1]) {
                    if (contenidoArchivo [i+2] == listaVirus[1].getSecuenciaVirus()[2]) {
                        if (contenidoArchivo [i+3] == listaVirus[1].getSecuenciaVirus()[3]) {
                            
                            System.out.println("Virus Antrax detectado");
                        }
                        
                    }
                    
                }
                
            }
            
            if (contenidoArchivo [i] == listaVirus[2].getSecuenciaVirus()[0]) {
                if (contenidoArchivo [i+1] == listaVirus[2].getSecuenciaVirus()[1]) {
                    if (contenidoArchivo [i+2] == listaVirus[2].getSecuenciaVirus()[2]) {
                        if (contenidoArchivo [i+3] == listaVirus[2].getSecuenciaVirus()[3]) {
                            
                            System.out.println("Virus éBola detectado");
                        }
                        
                    }
                    
                }
            }      
        }
                                    System.out.println("Analisis finalizado");
    }
}
