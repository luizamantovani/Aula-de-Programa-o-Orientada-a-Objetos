package Aula9.view;

import Aula9.dao.UsuarioDAO;
import Aula9.entity.Usuario;
import java.util.ArrayList;

public class UsuarioMain {
    public static void main(String[] args) {
        Usuario user = new Usuario(3, "Isabella", "111111");
        UsuarioDAO dao = new UsuarioDAO();
        
        dao.editar(user);

        ArrayList<Usuario> lstUsuarios = dao.getAllUsuarios();
        
        for(Usuario u: lstUsuarios){
            System.out.println(u.getLogin());       }
        Usuario u1 = dao.getUserById(3);
         System.out.println(u1.getLogin());
    }
    
}
