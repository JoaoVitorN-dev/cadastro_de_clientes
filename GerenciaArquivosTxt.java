

/**
 *Aluno: João Vitor Nepomuceno de Souza RA:194546  
 *Aluno: João Afonso Moraes RA: 193387
 */
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class GerenciaArquivosTxt {
    private String nomeArquivo;
    private String urlPasta;

    public GerenciaArquivosTxt(String nomeArquivo, String urlPasta) {
        this.nomeArquivo = nomeArquivo;
        this.urlPasta = urlPasta;
    }
    
    public Path getArquivo(){
        Path caminhoArquivo = Paths.get(this.urlPasta+"\\"+this.nomeArquivo+".txt");
        return caminhoArquivo;
    }
    
    public boolean verificaArquivo(){
        boolean existe;
        existe = Files.exists(getArquivo());
        return existe;
        
    }
    
    public void gravaArquivo(String texto){
        byte[] meuTextoEmBytes=texto.getBytes();
        
        try{
            Files.write(getArquivo(),meuTextoEmBytes);
        }
        catch(Exception e){
            System.out.println("surgiu o seguinte erro durante a tentativa de escrita: ");
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList <String> leArquivo() {
        ArrayList <String> linhasArquivo = new ArrayList <String>();
        
        try{
           List <String> linhas =Files.readAllLines(getArquivo());
            linhasArquivo.addAll(linhas);
        }
        catch(Exception e){
            System.out.println("Retornou o seguinte erro ao ler o arquivo: ");
            System.out.println(e.getMessage());
        }
        return linhasArquivo;
    }
    
}
    
