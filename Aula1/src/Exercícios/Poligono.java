package Exercícios;

public abstract class Poligono extends Figura {
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	double base;
	double altura;
	
	@Override    
	  public double area(){
		  return this.area();
	  }

}
