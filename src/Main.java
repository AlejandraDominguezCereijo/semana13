import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);

        Entidad[] array_entidad = new Entidad[2];
        Jugador _jugador = new Jugador();
        Enemigo _enemigo = new Enemigo();

        array_entidad[0] = _jugador;
        array_entidad[1] = _enemigo;

        for (int i = 0; i < 2; i++) {
        int salir = 1;
        do {
            System.out.println("");
            System.out.println("¿Quien va a realizar la accion ? \n1 Jugador \n2 Enemigo \n3 Salir");

            int accion= cubrir.nextInt();
            switch (accion) {

                case 1:
                    System.out.println("¿Que accion quieres realizar? \n0 Multiplicar ataque \n1 Multiplicar defensa");
                    _jugador.turno(accion);
                    break;
                case 2:
                    System.out.println("¿Que accion quieres realizar? \n0 Multiplicar ataque \n1 Mitad del ataque");
                    _enemigo.turno(accion);
                case 3:
                    salir = 0;
                    System.out.println("Aloha");
                    break;
            }
            array_entidad[i].turno(accion);
        } while (salir != 0);

//El ejercicio no es funcional como tal, es solo una pequeña muestra de posibilidades que podemos realizar, mediante el uso de
            //la herencia tenemos los constructores con los cuales podemos usar los atributos de la clase que estemos heredando,
            //de esta manera nos facilita el trabajo a la hora de usar varias clases y tambien es mas claro y organizado.

        }

    }


}
