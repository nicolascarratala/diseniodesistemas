package clases;

public abstract class Poligono extends Figura{

	private Lados m_Lados;

	public Poligono(Lados m_Lados) {
		super();
		this.m_Lados = m_Lados;
	}

	public Poligono(){

	}
	
	public Lados getM_Lados() {
		return m_Lados;
	}

	public void setM_Lados(Lados m_Lados) {
		this.m_Lados = m_Lados;
	}

}