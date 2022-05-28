
package SubSystem2;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {

        return instancia;

    }

    public String recuperaCidade(String cep) {

        return "Goiania";

    }

    public String recuperaEstado(String cep) {

        return "Go";

    }

}
