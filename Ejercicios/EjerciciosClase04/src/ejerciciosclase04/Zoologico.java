package ejerciciosclase04;

public class Zoologico {
    
    public static final int CANTIDAD_ANIMALES = 25;
    public static final int RACIONES_POR_ANIMAL = 5;
    private boolean estaAbierto;

    
    public boolean isEstaAbierto() {
        return estaAbierto;
    }

    public void setEstaAbierto(boolean estaAbierto) {
        this.estaAbierto = estaAbierto;
    }
    
    
    public void abrir(){
        estaAbierto = true;
    }
    
    public void cerrar(){
        estaAbierto = false;
    }
    
    public int alimentarAnimales(int cantidadDeRaciones){   
        Cuidador cuid1 = new Cuidador(3);    
        return cantidadDeRaciones;
    }
    
    
}
