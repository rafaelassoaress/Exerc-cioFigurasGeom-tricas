
public class Circulo extends Figura {

	private double raio;
public Circulo() {}
	public Circulo(double raio) {
		this.raio=raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		double area = Math.PI * (raio*raio);
		return area;
	}
	@Override
	public double calcularPerimetro() {
		double perimetro = 2.0*Math.PI*raio;
		return perimetro;
	}
	
}



