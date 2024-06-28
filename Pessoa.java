

/**
 *Aluno: João Vitor Nepomuceno de Souza RA:194546  
 *Aluno: João Afonso Moraes RA: 193387
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String email;
    
    public Pessoa (String cpf){
        this.cpf=cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
