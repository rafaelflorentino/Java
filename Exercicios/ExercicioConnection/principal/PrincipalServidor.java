package ExercicioConnection.principal;

import java.io.IOException;

import ExercicioConnection.constantes.Constantes;
import ExercicioConnection.entidades.Servidor;

public class PrincipalServidor {
	public static void main(String[] args) throws IOException {
		// inicia o servidor
		new Servidor(Constantes.PORT_JEYSEL).executa();
	}
}
