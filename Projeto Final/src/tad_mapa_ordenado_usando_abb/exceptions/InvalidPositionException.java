
package tad_mapa_ordenado_usando_abb.exceptions;

@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {
	public InvalidPositionException(String error) {
		super(error);
	}
}
  