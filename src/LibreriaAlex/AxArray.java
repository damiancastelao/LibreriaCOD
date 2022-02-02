package LibreriaAlex;

public class AxArray {

    public static float[] generateArray(int tamaño) {

        float[] array = new float[tamaño];

        for (int i = 0; i < tamaño; i++) {

            array[i] = AxAsk.askFloat();

        }

        return array;
    }



    public static float calculateMedia(float[] array) {

        float media = 0;
        for (int i = 0; i < array.length; i++) {

            media += array[i];
        }

        return media / array.length;
    }

    public static float getLargest(float[] array) {

        float mayor = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > mayor) mayor = array[i];
        }

        return mayor;
    }




}
