package es.itrafa.ev1_u4.fase3_b12.prog_ev1_u3_b12_e1;

/**
 * EJERCICIO U3_B12_E1:
 * El siguiente código crea una baraja utilizando el String palo. Reforma el código para que
 * haga lo mismo pero utilizando una enumeración Palo.
 *
 * <pre>{@code
 *
 * class Carta {
 *      private String palo;
 *      private int numero;
 *
 *      public Carta(String palo, int numero) {
 *          this.palo = palo;
 *          this.numero = numero;
 *      }
 *
 *      public String toString() {
 *          return "(" + palo + ", " + numero + ')';
 *      }
 * }
 *
 * class Baraja {
 *      //baraja española de 40 cartas. No hay 8 y 9.
 *      final int NUM_CARTAS = 40;
 *      Carta[] cartas = new Carta[NUM_CARTAS];
 *
 *      public Baraja() {
 *          //crea una baraja ordenada por palos y números
 *          String[] palos = {"Bastos", "Copas", "Oros", "Espadas"};
 *          int ultimaCarta=0;
 *          for (int i = 0; i < 4; i++) {
 *              for (int j = 0; j < 12; j++) {
 *                  if(j==7 || j==8){
 *                      continue;
 *                  }
 *                  cartas[ultimaCarta] = new Carta(palos[i], j+1);
 *                  ultimaCarta++;
 *              }
 *          }
 *      }
 * }
 *
 * public class Unidad4{
 *      public static void main(String[] args) {
 *          Baraja baraja= new Baraja();
 *          for(Carta c:baraja.cartas){
 *              System.out.println(c);
 *          }
 *      }
 * }
 *
 * }</pre>
 */
class Carta {
    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String toString() {
        return "(" + palo + ", " + numero + ')';
    }
}

class Baraja {
    //baraja española de 40 cartas. No hay 8 y 9.
    final int NUM_CARTAS = 40;
    Carta[] cartas = new Carta[NUM_CARTAS];

    public Baraja() {
        //crea una baraja ordenada por palos y números
        String[] palos = {"Bastos", "Copas", "Oros", "Espadas"};
        int ultimaCarta = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                if (j == 7 || j == 8) {
                    continue;
                }
                cartas[ultimaCarta] = new Carta(palos[i], j + 1);
                ultimaCarta++;
            }
        }
    }
}

public class Unidad4 {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        for (Carta c : baraja.cartas) {
            System.out.println(c);
        }
    }
}