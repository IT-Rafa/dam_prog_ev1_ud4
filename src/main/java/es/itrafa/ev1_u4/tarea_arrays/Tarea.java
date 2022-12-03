package es.itrafa.ev1_u4.tarea_arrays;

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
 * 2 3 3 3 3
 * 4 5 3 4 2 1 5 6 5 5
 * 10 10 5 5 2
 * 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 3 3 3 3 3
 * 4 4 1 4 5
 * 1 1 1 1 1 2 2 2 3 3 1 2 4 4 2 5 5 5 5 6 2
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
}
