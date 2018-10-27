/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
/**
 *
 * @author sflorezr
 */
public class Administrador_Archivos {
    private byte[] archivoleido;

    public byte[] getArchivoleido() {
        return archivoleido;
    }
    public void NewFile(File archivo) throws IOException{
            archivoleido = Files.readAllBytes(archivo.toPath());                  
    }
}
