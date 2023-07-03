public class ayuda {
    public static void main(String[] args) {

    String jp = "hola";
        System.out.println("jp.toCharArray() = " + jp.toCharArray());
        char[] arreglo =jp.toCharArray();
        int longitud = arreglo.length;
        System.out.println("longitud = " + longitud);
        for (int i = 0; i <longitud ; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println(jp.split("a"));
        String [] array = jp.split("a");
        int f = array.length;
        for (int i = 0; i < f; i++) {
            System.out.println(array[i]);
            String documentopdf = "experimento.pdf";
            String [] arreglin =documentopdf.split("[.]");
            int large = arreglin.length;
            for (int j = 0; j <large ; j++) {
                System.out.println(arreglin[j]);
            }
            System.out.println(arreglin[large-1]);
        }
    }
}