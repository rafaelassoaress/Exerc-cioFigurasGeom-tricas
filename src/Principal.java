import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op=0;
		do {

			String menu = "1.Triangulo. \n 2.Quadrado. \n 3.Retangulo. \n 4.Circulo. \n 0. Sair. \n Escolha a opção desejada:";

			System.out.println(menu);

			op = entrada.nextInt();

			switch(op){
			case 1:{
				Triangulo t = new Triangulo();
				System.out.println("Insira o valor da base:");
				double base = entrada.nextDouble();
				t.setBase(base);

				System.out.println("Insira o valor do lado do triangulo");
				double ladoB = entrada.nextDouble();
				t.setLadoB(ladoB);

				System.out.println("Insira o valor do outro lado do triangulo");
				double ladoC = entrada.nextDouble();
				t.setLadoC(ladoC);

				System.out.println("Insira o valor da altura do triangulo");
				double altura = entrada.nextDouble();
				t.setAltura(altura);

				double area=t.calcularArea();
				System.out.println("Área do triângulo:"+ area);

				double perimetro = t.calcularPerimetro();
				System.out.println("Perímetro do triângulo"+perimetro);

				break;
			}
			case 2:{

				Quadrado q = new Quadrado();
				System.out.println("Insira o valor do comprimento do quadrado:");
				double comprimento = entrada.nextDouble();
				q.setComprimento(comprimento);

				double area = q.calcularArea();
				System.out.println("Área do Quadrado:"+area);

				double perimetro = q.calcularPerimetro();
				System.out.println("Perímetro do quadrado"+perimetro);
				break;
			}

			case 3:{
				Retangulo r = new Retangulo();
				System.out.println("Insira o valor do comprimento do retângulo:");
				double comprimento = entrada.nextDouble();
				r.setComprimento(comprimento);

				System.out.println("Insira o valor da largura do retângulo:");
				double largura = entrada.nextDouble();
				r.setLargura(largura);

				double area = r.calcularArea();
				System.out.println("Área do Retângulo:"+area);

				double perimetro = r.calcularPerimetro();
				System.out.println("Perímetro do retângulo"+perimetro);
				break;
			}
			case 4:{
				Circulo c = new Circulo();
				System.out.println("Insira o valor do raio do circulo");
				double raio = entrada.nextDouble();
				c.setRaio(raio);

				double area = c.calcularArea();
				System.out.println("Área do circulo:" + area);

				double perimetro = c.calcularPerimetro();
				System.out.println("Perímetro do círculo"+perimetro);
				break;
			}
			case 0:{
				System.out.println("Você escolheu sair, até mais!");
				break;
			}

			default:{
				System.out.println("Opção inválida!");
				break;
			} 

			}
		} while(op!=0);
		entrada.close();
	}
}

