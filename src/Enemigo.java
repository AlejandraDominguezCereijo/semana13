public class Enemigo extends Entidad{
    int dificultad;

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public Enemigo() {
    }

    public Enemigo(int vida, int ataque, int defensa, String nombre, int dificultad) {
        super(vida, ataque, defensa, nombre);
        this.dificultad = dificultad;
    }
@Override
    public int turno(int accion){

        if (accion==0){
            accion=getAtaque()*getDificultad();
        }if (accion==1){
            accion=getAtaque()/2;
        }

        return accion;
    }
}
