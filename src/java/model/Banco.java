package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Empresa;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static List<Usuario> listaUsuario = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setName("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setName("Caelum");

        Usuario usuario = new Usuario();
        usuario.setLogin("Alessandro");
        usuario.setSenha("12345");

        Banco.lista.add(empresa);
        Banco.lista.add(empresa2);

        Banco.listaUsuario.add(usuario);
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

        while (it.hasNext()) {
            Empresa emp = it.next();
            if (emp.getId() == id) {
                it.remove();
            }
        }

    }

    public Empresa buscaEmpresaPeloId(Integer id) {
        for (Empresa empresa : lista) {
            if (empresa.getId() == id) {
                return empresa;
            }
        }
        return null;
    }

    public Usuario existeUsuario(String login, String senha) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.ehIgual(login, senha)) {
                return usuario;
            }
        }
        return null;
    }

}
