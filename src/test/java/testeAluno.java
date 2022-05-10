
import org.junit.Test;
import services.AlunoService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Administrador
 */
public class testeAluno {

    /**
     * @param args the command line arguments
     */


    @Test
    public void populate() {
        AlunoService as = new AlunoService();
        as.populate();

        System.out.println(as.getAll());

    }

}
