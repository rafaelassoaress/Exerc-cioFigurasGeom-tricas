
public class Retangulo extends Figura {

	private double largura;
	private double comprimento;
	
	public Retangulo() {}
	public Retangulo(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	@Override
	public double calcularPerimetro(){
		double perimetro = (2.0*largura)+(2.0*comprimento);
		return perimetro;
	}
	
	@Override
	public double calcularArea() {
		double area = largura*comprimento;
		return area;
	}
	
	
	
}
