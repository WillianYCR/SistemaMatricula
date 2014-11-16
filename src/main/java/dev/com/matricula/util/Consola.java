package dev.com.matricula.util;

public class Consola {

  public static void escribir(String texto) {
    System.out.println(texto);
  }

  public static void objetoNull(String nombreObjeto) {
    escribir("El objeto ".concat(nombreObjeto).concat(" es null."));
  }

  public static void listaVaciaONull(String nombreObjeto) {
    escribir("La lista de objetos ".concat(nombreObjeto).concat(" está vacía o es null."));
  }
  
}
