package sistemaBiblioteca;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SalvarDados {

    public static void salvar(SistemaBiblioteca sistema) {

        try {
            FileOutputStream arquivo = new FileOutputStream("biblioteca_dados.txt");
            ObjectOutputStream salvar = new ObjectOutputStream(arquivo);

            salvar.writeObject(sistema);

            salvar.close();
            arquivo.close();

            System.out.println("Dados salvos em biblioteca_dados.txt");

        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }
}