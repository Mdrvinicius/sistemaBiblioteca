package sistemaBiblioteca;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class CarregarDados {
    public static SistemaBiblioteca carregar() {

        try {

            FileInputStream arquivo = new FileInputStream("biblioteca_dados.ser");
            ObjectInputStream ler = new ObjectInputStream(arquivo);

            SistemaBiblioteca sistema = (SistemaBiblioteca) ler.readObject();

            ler.close();
            arquivo.close();

            System.out.println("Dados carregados com sucesso!");

            return sistema;

        } catch (Exception e) {
            System.out.println("Nenhum dado encontrado. Um novo sistema será criado.");
            return new SistemaBiblioteca();
        }
    }
}

