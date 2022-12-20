package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Empresa;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setName("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setName("Caelum");
        Banco.lista.add(empresa);
        Banco.lista.add(empresa2);
    }

    public void adicionar(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        Banco.lista.add(empresa);
    }

    public List<Empresa> getEmpresas() {
        return Banco.lista;
    }

    public void removeEmpresa(Integer id) {
        
        Iterator<Empresa> it = lista.iterator();
        
        while(it.hasNext()){
            Empresa emp = it.next();
            if (emp.getId() == id){
                it.remove();
            }
        }
 
    }

}
