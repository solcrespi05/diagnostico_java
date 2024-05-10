import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {
    List<Integer> miLista = new ArrayList<>();

    public static int contadorImpares(List<Integer> miLista){
        int contador = 0;
        for (int numero : miLista){
            if (numero % 2 != 0){
                contador++;
            }
        }
        return contador;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> miLista){
        List<Integer> nuevaLista  = new ArrayList<>();
        for( int i = 1; i< miLista.size(); i++  ){
            if (miLista.get(i) == miLista.get(i-1)+1){
                nuevaLista.add(miLista.get(i-1));
                nuevaLista.add(miLista.get(i));
            }

        }return nuevaLista;

    }

}
