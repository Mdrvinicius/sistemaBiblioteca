package sistemaBiblioteca;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarregarDados {

    public static SistemaBiblioteca carregar() {

        try {
            FileInputStream arquivo = new FileInputStream("biblioteca_dados.txt");
            ObjectInputStream ler = new ObjectInputStream(arquivo);

            SistemaBiblioteca sistema = (SistemaBiblioteca) ler.readObject();

            ler.close();
            arquivo.close();

            System.out.println("Dados carregados do arquivo .txt!");
            return sistema;

        } catch (Exception e) {
            System.out.println("Nenhum arquivo encontrado. Criando sistema com dados iniciais.");

            SistemaBiblioteca sistema = new SistemaBiblioteca();
            DadosSeisMeses.gerar(sistema);   // ⬅ AQUI!!!!

            return sistema;
        }
    }
}