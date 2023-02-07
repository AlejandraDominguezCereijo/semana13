public class Jugador extends Entidad {
    private int experiencia;
    private int nivel;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Jugador() {
    }

    public Jugador(int vida, int ataque, int defensa, String nombre, int experiencia, int nivel) {
        super(vida, ataque, defensa, nombre);
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

@Override
    public int turno(int accion){

        if (accion==0){
            accion=getAtaque()*getNivel();
        }if (accion==1){
            accion= getDefensa()*getNivel();
        }
        return accion;
        }


}
