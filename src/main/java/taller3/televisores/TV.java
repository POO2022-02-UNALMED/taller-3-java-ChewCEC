package taller3.televisores;

public class TV {
// marca (Marca), canal(int), precio(int), estado(boolean), volumen(int) y
	private Marca marca;
	private int canal;
	private int precio;
	boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	
//Set y Get marca, control, precio, volumen y canal
	public Marca getMarca() {
	    return marca;
	  }

	public void setMarca(Marca newMarca) {
		this.marca = newMarca;
	  }
	
	public Control getControl () {
		return control;
	}
	
	public void setControl (Control control) {
		this.control = control;
		
	}
	
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (this.estado){
            if(canal >= 1 && canal <= 120){
                this.canal = canal;
            }
        }
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public static int getNumTV () {
		return numTV;
		
	}
	
	 public static void setNumTV(int numTV) {
	        TV.numTV = numTV;
	    } 
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado () {
		return estado;
	}
	
	//canalUp y canalDown
	public void canalUp () {
		if (this.getEstado()) {
			if (this.getCanal() < 120) {
				this.canal++;
				
			}
		}
	}
	
	public void canalDown () {
		if (this.getEstado()) {
			if (true && this.getCanal() > 1) {
			this.canal--;
			}
		}
	}
	
	
	//volumenUp, y volumenDown 
	
	public void volumenUp () {
		if (this.getVolumen() < 7 && this.getEstado() == true) {
			this.volumen++;
			
		}
	}
	
	public void volumenDown () {
		if (this.getVolumen() > 0 && this.getEstado() == true) {
			this.volumen--;
			
		}
	}
	
}














