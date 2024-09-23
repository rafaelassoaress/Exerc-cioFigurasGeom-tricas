
public class Quadrado extends Figura {
	
	private double comprimento;
	private double largura;
	
	public Quadrado() {}
	public Quadrado(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	
	@Override
	public double calcularPerimetro() {
		double perimetro = 4.0*comprimento;
		return perimetro;
		
	}
	
	@Override
	public double calcularArea() {
		double area = comprimento*comprimento;
		return area;
	}
	
	

}
