package Facade;

import SubSystem1.CrmService;
import SubSystem2.CepApi;

public class Facade {
    
    public void migrarCliente(String nome ,String cep) {
      
        String cidade = CepApi.getInstancia().recuperaCidade(cep);
        String estado = CepApi.getInstancia().recuperaEstado(cep);

       CrmService.gravarCliente(nome, cep, cidade, estado);
// edit
       System.out.println(nome);
       System.out.println(cep);
       System.out.println(cidade);
       System.out.println(estado);

    
}

     

}
