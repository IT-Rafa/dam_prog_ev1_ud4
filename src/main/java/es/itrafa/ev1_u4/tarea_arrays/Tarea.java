package es.itrafa.ev1_u4.tarea_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * En el juego del Risk se conquistan territorios con una estrategia basada en dados.
 * Las batallas empiezan cuando el atacante mueve un determinado número de tropas al
 * territorio que desea conquistar.
 * <p>
 * A continuación, la batalla se divide en oleadas. Para cada oleada, el atacante y
 * el defensor lanzan un determinado número de dados.
 * <p>
 * El número de dados que tira cada contrincante no puede ser mayor que el número de
 * tropas disponibles, ni mayor que el número de dados disponibles.
 * <p>
 * Tras tirar los dados cada bando ordena sus dados de mayor a menor y luego se alinean
 * con los dados del enemigo. Finalmente, para cada par de dados defensor-atacante el
 * atacante pierde una tropa si el valor de su dado es igual o menor que el valor del
 * dado del defensor. En caso contrario, es el defensor quien pierde una tropa.
 * Después de cada oleada, y si quedan tropas en ambos bandos, el atacante decide si
 * retirarse o continuar con la batalla.
 * <p>
 * Veamos un ejemplo en el que el defensor tiene 2 tropas y el atacante tiene 3.
 * El defensor tira dos dados y saca 4 y 5. El atacante tira tres dados y obtiene
 * 3, 4 y 2. Tras ordenarlos y emparejarlos, los dados quedan como en la figura:
 * <ul>
 *     <li>Defensa 5, 4</li>
 *     <li>Ataque: 4, 3, 2</li>
 * </ul>
 * <p>
 * En este caso, en la primera y segunda pareja de dados el defensor tiene un valor
 * mayor o igual que el atacante, por lo que este último pierde dos tropas.
 * El tercer dado del atacante se descarta ya que no está emparejado con ninguno del
 * defensor. Si el atacante continua para una segunda oleada, entonces el defensor lanza
 * dos dados y el atacante uno.
 * <p>
 * Si, por ejemplo, obtuvieran el defensor 1 y 5 y el
 * atacante 6 entonces, dado que 6 es mayor que 5, el defensor perdería una tropa.
 * En una tercera oleada cada bando lanza un único dado. Si ambos sacaran 5, entonces el
 * defensor ganaría y la batalla terminaría con una tropa sobreviviente en el bando defensor
 * y ninguna en el bando atacante.
 * <p>
 * Entrada
 * <p>
 * La entrada consiste en una serie de batallas.
 * <p>
 * Cada batalla se describe en dos líneas.
 * <p>
 * La primera línea tiene cinco números enteros con
 * la información siguiente:
 * <ul>
 *     <li>número de tropas de defensa (td)</li>
 *     <li>número de tropas de ataque (ta)</li>
 *     <li>máximo número de dados a usar por la defensa (dd)</li>
 *     <li>máximo número de dados a usar por el ataque (da)</li>
 *     <li>número de oleadas (no)</li>
 * </ul>
 * <p>
 * Los límites para estos valores son: 1 ≤ td ≤ 100.000, 1 ≤ ta ≤ 100.000,
 * 1 ≤ dd ≤ 1.000 y 1 ≤ da ≤ 1.000.
 * <p>
 * La segunda línea incluye toda la secuencia de tiradas de dados en la batalla como:
 * <ul>
 *   <li>valores obtenidos por la defensa en la primera oleada<li>
 *   <li>valores obtenidos por el ataque en la primera oleada
 *  (siempre se tira el máximo número de dados posible)</li>
 * </ul>
 * y a continuación de forma equivalente para las sucesivas oleadas.
 * Las oleadas están siempre completas, pero el atacante puede retirarse antes del final
 * de la batalla sin que haya un ganador. Siempre hay al menos una oleada.
 * <p>
 * El máximo número de lanzamientos de dados en una batalla es 200.000.
 * <p>
 * Salida
 * <p>
 * Para cada batalla, el programa debe imprimir una línea con el número de tropas que
 * sobreviven para el defensor y el número de tropas que sobreviven para el atacante.
 * <p>
 * Por ejemplo:
 * Entrada
 * <p>
 * <p>
 *  Defensor: 2 tropas: 2
 *  Atacante: 3 tropas: 3
 *  3 dados máximo para ambos jugadores: 3 3
 * <p>
 * 2 3 3 3 3
 * valores obtenidos por la defensa según oleada: 1ºol: 4 5   | 2ºol: 1 5 | 3ºol: 5
 * valores obtenidos por el ataque según oleada:  1ºol: 3 4 2 | 2ºol: 6   | 3ºol: 5
 * 4 5 3 4 2 1 5 6 5 5
 * <p>
 * Solucion: 1º Oleada
 *  Defensor: 5  4
 *  Atacante: 4  3  2
 *            Gana Defensor: Atacante 3 - 2 = 1
 * <p>
 * Solucion: 2º Oleada
 *  Defensor:  5  1 (Sigue con 2)
 *  Atacante:  6 (Solo le queda 1 tropa)
 *             Gana Atacante: Defensor 2 -1 = 1
 * <p>
 * Solucion: 3º Oleada
 *  Defensor:  5 (Solo le queda 1 tropa)
 *  Atacante:  5 (Solo le queda 1 tropa)
 *             Gana Defensor: Atacante 1 - 1 = 0
 * Resultado
 *      Defensor 2 (-1) = 1
 *      Atacante 3 (-2 -1) = 0
 * <p>
 * Tropas defensor y Tropas Atacante
 * 1 0
 * <p>
 * Entrada
 * 10 10 5 5 2
 * 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 3 3 3 3 3
 * <p>
 * Entrada
 * 4 4 1 4 5
 * 1 1 1 1 1 2 2 2 3 3 1 2 4 4 2 5 5 5 5 6 2
 *
 * <p>
 * Resultado
 * <p>
 * 1 0
 * 5 5
 * 0 3
 * <p>
 * Respuesta:(sistema de penalización: 0 %)
 */
public class Tarea {
    public static void main(String[] args) {
        final int MAX_TIRADAS = 200000;
        Scanner sc = new Scanner(System.in);
        // datos 1º línea enumerados
        enum Data {
            TD, TA, DD, DA, NO;
        }

        // PRIMERA LÍNEA ENTRADA (DATOS JUEGO Y JUGADORES)
        // 2 3 3 3 3
        // String unido

        // Capturamos y separamos string
        String[] input = sc.nextLine().split(" ");

        // Preparamos array gameData para los valores en int
        int[] gameData = new int[Data.values().length];

        // pasamos a int y lo guardamos
        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = Integer.parseInt(input[i]);
        }

        // Calculamos máximo tiradas Defensor
        int maxTiradaDefensor = gameData[Data.DD.ordinal()];
        if (gameData[Data.TD.ordinal()] < gameData[Data.DD.ordinal()]) {
            maxTiradaDefensor = gameData[Data.TD.ordinal()];
        }
        // Calculamos máximo tiradas Atacante
        int maxTiradaAtacante = gameData[Data.DA.ordinal()];
        if (gameData[Data.TA.ordinal()] < gameData[Data.DA.ordinal()]) {
            maxTiradaAtacante = gameData[Data.TA.ordinal()];
        }
        // total máximo tiradas ambos jugadores en esta oleada
        int maxTirada = maxTiradaDefensor;
        if (maxTirada < maxTiradaAtacante) {
            maxTirada = maxTiradaAtacante;
        }

        // Calculamos máximo tiradas totales
        int maxTiradaDefensorOleadas = maxTiradaDefensor * gameData[Data.NO.ordinal()];
        int maxTiradaAtacanteOleadas = maxTiradaAtacante * gameData[Data.NO.ordinal()];
        int tiradasTotales = maxTiradaDefensorOleadas + maxTiradaAtacanteOleadas;

        System.out.println("1º Tirada Defensor: " + maxTiradaDefensor);
        System.out.println("1º Tirada Atacante: " + maxTiradaAtacante);


        System.out.println("MAXIMO TIRADAS: " + maxTirada);
        // total max tiradas jugadores en todas oleadas
        System.out.println("Tiradas TOTALES: " + tiradasTotales);

        // SEGUNDA LÍNEA ENTRADA (TIRADAS)
        // 4 5 3 4 2 1 5 6 5 5
        // Cogemos input de tiradas y las separamos
        String[] inputTiradas = sc.nextLine().split(" ");

        // CALCULO POR OLEADAS
        int oleada = gameData[Data.NO.ordinal()];
        while (oleada != 0){
            int[] tiradasDefensor = new int[maxTirada];
            int[] tiradasAtacante = new int[maxTirada];

            // Convertimos en array tiradas para esta oleada del defensor
            for (int i = 0; i < maxTirada; i++) {
                if(i >= maxTiradaDefensor){
                    tiradasDefensor[i] = 0;
                }else{
                    tiradasDefensor[i] = Integer.parseInt(inputTiradas[i]);
                }
            }
            // Convertimos en array tiradas para esta oleada del Atacante
            int indice = 0;
            for (int i = maxTiradaDefensor; i < maxTiradaDefensor + maxTirada; i++) {
                if(i >= maxTiradaDefensor + maxTiradaAtacante){
                    tiradasAtacante[indice++] = 0;
                }else{
                    tiradasAtacante[indice++] = Integer.parseInt(inputTiradas[i]);
                }
            }
            // Ordenamos array tirador y atacante - creciente
            Arrays.sort(tiradasDefensor);
            Arrays.sort(tiradasAtacante);

            // Reordenamos defensor a decreciente
            for(int i = 0; i < maxTirada /2; i++){
                int cambio = tiradasDefensor[tiradasDefensor.length -i-1];
                tiradasDefensor[tiradasDefensor.length -i-1] = tiradasDefensor[i];
                tiradasDefensor[i] = cambio;
            }
            // Reordenamos atacante a decreciente
            for(int i = 0; i < maxTirada /2; i++){
                int cambio = tiradasAtacante[tiradasAtacante.length -i-1];
                tiradasAtacante[tiradasAtacante.length -i-1] = tiradasAtacante[i];
                tiradasAtacante[i] = cambio;
            }
            System.out.println("TIRADA");
            System.out.print("Defensor: ");
            for(int i = 0; i < maxTirada; i++){
                System.out.print(tiradasDefensor[i] + " ");
            }
            System.out.println();
            System.out.print("Atacante: ");
            for(int i = 0; i < maxTirada; i++){
                System.out.print(tiradasAtacante[i] + " ");
            }
            System.out.println();
            for(int i = 0; i < maxTirada; i++){
                if(tiradasDefensor[i] == 0 || tiradasAtacante[i] == 0){
                    System.out.println("Nulo");
                }else if(tiradasDefensor[i] >= tiradasAtacante[i]){
                    System.out.println("Defensor gana: Atacante tiene " + --gameData[Data.TA.ordinal()]);
                }else{
                    System.out.println("Atacante gana: Defensor tiene " + --gameData[Data.TD.ordinal()]);
                }
            }

            oleada--;
        }

    }
}
// 2 3 3 3 3
// 4 5 3 4 2 1 5 6 5 5