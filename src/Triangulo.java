
public class Triangulo extends Figura{

	private double altura;
	private double base;
	private double ladoB;
	private double ladoC;

	public Triangulo() {
	};

	public Triangulo(double altura, double base, double ladoB, double ladoC) {
		this.altura = altura;
		this.base = base;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	
	@Override
	public double calcularPerimetro() {
		double perimetro = base+ladoB+ladoC;
		return perimetro;
	}

	@Override
	public double calcularArea() {
		double area = (base*altura)/2.0;
		return area;
	}


}
