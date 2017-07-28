package less8;

public class BadStartBallada implements Ballada {
	private final Ballada ballada;

	public BadStartBallada(Ballada ballada){
		this.ballada = ballada;
	}
	
	@Override
	public void song() {
		System.out.println("People: foo-foo");
		ballada.song();
	}
	
}
