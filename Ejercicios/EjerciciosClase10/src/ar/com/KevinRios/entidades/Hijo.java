package ar.com.KevinRios.entidades;


public class Hijo extends Persona {

    public enum LUGAR_ESTUDIO {
        JARDIN,
        PRIMARIA,
        SECUNDARIA
    }
    
    
    private LUGAR_ESTUDIO lugarDeEstudio;


    public Hijo() {
    }

    public Hijo(String nombre, LUGAR_ESTUDIO lugar) {
        setNombre(nombre);
        setLugarDeEstudio(lugar);
    }

    public LUGAR_ESTUDIO getLugarDeEstudio() {
        return lugarDeEstudio;
    }

    public void setLugarDeEstudio(LUGAR_ESTUDIO lugarDeEstudio) {
        this.lugarDeEstudio = lugarDeEstudio;
    }

   

}
