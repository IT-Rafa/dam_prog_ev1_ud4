package es.itrafa.ev1_u4.tarea_arrays;

import java.util.Arrays;
import java.util.Scanner;

enum Data { // Ordena line1
    TD, // número de tropas de defensa
    TA, // número de tropas de ataque
    DD, // máximo número de dados a usar por la defensa
    DA, // máximo número de dados a usar por el ataque
    NO  // Número oleadas
}

public class Derk {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CAPTURAMOS LÍNEAS
        // 2 3 3 3 3
        // 4 5 3 4 2 1 5 6 5 5

        // Convertimos lineas a array int
        String input = sc.nextLine();
        int[] datos = getIntLine(input);
        input = sc.nextLine();
        int[] tiradas = getIntLine(input);

        while (datos.length != 0) {
            //System.out.println(datos[Data.TD.ordinal()] + " " + datos[Data.TA.ordinal()]);

            // OLEADAS

            int inicioTiradaDefensor = 0;

            for (int oleadaIndex = 1; oleadaIndex <= datos[Data.NO.ordinal()]; oleadaIndex++) {
                //System.out.println("OLEADA " + oleadaIndex);

                // Capturamos tiradas defensor
                int finTiradaDefensor = inicioTiradaDefensor + getTiradaMax(datos, 'd') - 1;
                int[] tiradasDefensor = getTiradasOrdenadas(tiradas, inicioTiradaDefensor, finTiradaDefensor);

                // Capturamos tiradas atacante
                finTiradaDefensor++;
                int finTiradaAtacante = finTiradaDefensor + getTiradaMax(datos, 'a') - 1;
                int[] tiradasAtacante = getTiradasOrdenadas(tiradas, finTiradaDefensor, finTiradaAtacante);

                inicioTiradaDefensor = finTiradaAtacante + 1;

                // Comparamos tiradas
                // capturamos quien hizo menos tiradas
                int lengthTiradas = tiradasDefensor.length;
                if (tiradasDefensor.length > tiradasAtacante.length) {
                    lengthTiradas = tiradasAtacante.length;
                }
                // Calculo ganador tiradas
                for (int i = 0; i < lengthTiradas; i++) {
                    // System.out.print("\tDefensor: " + tiradasDefensor[i] + "; Atacante: " + tiradasAtacante[i]);
                    if (tiradasDefensor[i] >= tiradasAtacante[i]) {
                        // System.out.println("; Gana defensor");
                        datos[Data.TA.ordinal()]--;
                    } else {
                        // System.out.println("; Gana atacante");
                        datos[Data.TD.ordinal()]--;
                    }

                }
                // System.out.println("\t" + datos[Data.TD.ordinal()] + " " + datos[Data.TA.ordinal()]);

            }
            System.out.println(datos[Data.TD.ordinal()] + " " + datos[Data.TA.ordinal()]);

            if(sc.hasNextLine()){
                input = sc.nextLine();
                datos = getIntLine(input);

                input = sc.nextLine();
                tiradas = getIntLine(input);
            }else{
                return;
            }

        }
    }

    private static int[] getTiradasOrdenadas(int[] tiradas, int inicio, int fin) {
        int sizeArray = lengthIndex(inicio, fin);
        int[] tiradasJugadorOleada = new int[sizeArray];

        System.arraycopy(tiradas, inicio, tiradasJugadorOleada, 0, tiradasJugadorOleada.length);

        Arrays.sort(tiradasJugadorOleada);

        for (int i = 0; i < tiradasJugadorOleada.length / 2; i++) {
            int change = tiradasJugadorOleada[i];
            tiradasJugadorOleada[i] = tiradasJugadorOleada[tiradasJugadorOleada.length - 1];
            tiradasJugadorOleada[tiradasJugadorOleada.length - 1] = change;
        }

        return tiradasJugadorOleada;
    }

    private static int lengthIndex(int inicio, int fin) {
        int sum = 0;
        for (int index = inicio; index < fin; index++) {
            sum++;
        }
        return sum + 1;
    }

    private static int getTiradaMax(int[] datos, char c) {
        int indexTropas;
        int indexDados;
        if (c == 'd') {
            indexTropas = Data.TD.ordinal();
            indexDados = Data.DD.ordinal();
        } else {
            indexTropas = Data.TA.ordinal();
            indexDados = Data.DA.ordinal();
        }

        int finTirada = datos[indexTropas];
        if (finTirada > datos[indexDados]) {
            finTirada = datos[indexDados];
        }
        return finTirada;
    }

    private static int[] getIntLine(String line) {
        if (line.isEmpty()){
            return new int[0];
        }
        String[] stLines = line.split(" ");
        int[] result = new int[stLines.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(stLines[i]);
        }
        return result;
    }
}
