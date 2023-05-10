package ExercicioConnection.principal;

import java.io.IOException;
import java.net.UnknownHostException;

import ExercicioConnection.constantes.Constantes;
import ExercicioConnection.entidades.Cliente;

public class PrincipalCliente {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		new Cliente("localHost", Constantes.PORT_JEYSEL).executa();
	}
}
