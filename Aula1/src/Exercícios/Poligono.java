package Exercícios;

public abstract class Poligono extends Figura {
	double base;
	double altura;
	
	public Poligono(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
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

	@Override    
	  public double area(){
		  return this.area();
	  }
	
	@Override    
	  public double perimetro(){
		  return this.perimetro();
	  }

}
