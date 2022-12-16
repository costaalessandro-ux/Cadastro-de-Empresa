package dao;

import java.util.ArrayList;
import java.util.List;
import model.Empresa;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();

    static {
        Empresa empresa = new Empresa();
        empresa.setName("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setName("Caelum");
        Banco.lista.add(empresa);
        Banco.lista.add(empresa2);
    }

    public void adicionar(Empresa empresa) {
        Banco.lista.add(empresa);
    }

    public List<Empresa> getEmpresas() {
        return Banco.lista;
    }

}
