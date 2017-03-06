/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franklin_garcia_lab6;

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

    private static ArrayList<Personas> listaPersonas = new ArrayList();
    private static File archivo = null,gente=null;

    public administrarPersonas(String Path) {
        archivo = new File(Path);
        
    }

    public ArrayList<Personas> getListaPersonas() {
        return listaPersonas;
    }

    public void setListapersonas(ArrayList<Personas> listapersonas) {
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
    public void setPersona(Personas p) {
        this.listaPersonas.add(p);
    }

    public void escribirPersonas() {
        FileWriter ft = null;
        BufferedWriter bw = null;
        try {
            for (Personas t : listaPersonas) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getLugar_nacimiento() + ";");
                bw.write(t.getNacionalidad() + ";");
               
                for (Familiares h : t.getFamiliar()) {
                    bw.write(h.getNombre() + ",");
                    bw.write(h.getLugar_nacimineto() + ",");
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
                String n,l,m,t;
                ArrayList<Familiares> temp = new ArrayList();
                c = sc.nextInt();
                n = sc.next();
                l = sc.next();
                m = sc.next();
                t = sc.next();
                Scanner s2 = new Scanner(sc.next());
                s2.useDelimiter(";");
//int edad, int ID, String nacionalidad, String lugar_nacimineto, String nombre, Color color, Familiares Padre, ArrayList hijos                
                while (s2.hasNext()) {
                    temp.add(new Familiares(s2.nextInt(),s2.nextInt(),s2.next(),s2.next(),s2.next(),s2.next(),null,null));
//int edad, int ID, String nacionalidad, String lugar_nacimiento, String nombre, String color
//, ArrayList<Familiares> familiar, DefaultTreeModel arbol
                e = sc.nextInt();
                listaPersonas.add(new Personas(c,e,n,l,m,t,null,null));
                listaPersonas.get(listaPersonas.size() - 1).setFamiliar(temp); 
                
                }
            }
        } catch (Exception ex) {
        } finally {
            sc.close();
        }

    }
}
