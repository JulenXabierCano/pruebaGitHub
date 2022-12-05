package clases;

import java.io.FileNotFoundException;

/**
 * @author Eñaut Agirre
 *
 */
public class Main {
	/**
	 * @param args
	 * @throws FileNotFoundException
	 * el programa principal que lanza la aplicacion
	 */
	public static void main(String[] args) throws FileNotFoundException {
		GestorUsuariosApp gua = new GestorUsuariosApp();
		gua.run();
	}

}
