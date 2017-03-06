/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoz_clase2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Franklin Garcia
 */
public class administrarPersonas {

    private static ArrayList<Persona> listaPersonas = new ArrayList();
    private static File archivo = null,gente=null;

    public administrarPersonas(String Path) {
        archivo = new File(Path);
        
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListapersonas(ArrayList<Persona> listapersonas) {
        this.listaPersonas = listapersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listapersonas=" + listaPersonas;
    }

    //extra mutador
    public void setPersona(Persona p) {
        this.listaPersonas.add(p);
    }

    public void escribirPersonas() {
        FileWriter ft = null;
        BufferedWriter bw = null;
        try {
            for (Persona t : listaPersonas) {
                bw.write(t.getCodigo() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                for (Hobbie h : t.getHobbies()) {
                    bw.write(h.getId() + ",");
                    bw.write(h.getDescripcion() + ",");
                }
                bw.write(",");
                bw.write(t.getEdad() + ",");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                ft.close();
            } catch (Exception e) {

            }
        }

    }

    public static void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                int c, e;
                String n;
                ArrayList<Hobbie> temp = new ArrayList();
                c = sc.nextInt();
                n = sc.next();
                Scanner s2 = new Scanner(sc.next());
                s2.useDelimiter(";");
                while (s2.hasNext()) {
                    temp.add(new Hobbie(s2.nextInt(), s2.next()));
                }
                e = sc.nextInt();
                listaPersonas.add(new Persona(c, n, e));
                listaPersonas.get(listaPersonas.size() - 1).setHobbies(temp); 
                
                }
        } catch (Exception ex) {
        } finally {
            sc.close();
        }

    }
}
