

/**
 *Aluno: João Vitor Nepomuceno de Souza RA:194546  
 *Aluno: João Afonso Moraes RA: 193387
 */
import java.util.Scanner;


public class ClasseData {
    Scanner leitor = new Scanner (System.in);
    private int dia;
    private int mes;
    private int ano;
    
    // === CONSTRUTOR ===
    
    public ClasseData() {
    }
    
    // === GET ===

    public int getDia() {
        return dia;
    }
    

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
     
        
    
    public void setData(int dia,int mes,int ano) {
        
        if ((mes>0)&&(mes<=12)){
            this.mes=mes;
        }
        
        else{
            while((mes<0)||(mes>12)){
                System.out.println("mes Invalido informado, informe outro mes: ");
                mes=leitor.nextInt();
            }
            this.mes=mes;
        }
        
        if (ano>=1){
            this.ano=ano;
        }
        
        else{
            while(ano<=0){
                System.out.println("Ano Invalido informado, informe outro ano: ");
                ano=leitor.nextInt();
            }
            this.ano=ano;
        } 
        
        
        if((mes==1)&&(dia>0 && dia<32)){
            this.dia=dia;
        }
        else if((mes==2)&&(dia>0 && dia<30)){
            this.dia=dia;
        }
        else if((mes==3)&&(dia>0 && dia<32)){
            this.dia=dia;
        }
        else if((mes==4)&&(dia>0 && dia<31)){
            this.dia=dia;
        }
        else if((mes==5)&&(dia>0 && dia<32)){
            this.dia=dia;
        }
        else if((mes==6)&&(dia>0 && dia<31)){
            this.dia=dia;
        }
        else if((mes==7)&&(dia>0 && dia<32)){
            this.dia=dia;
        }
        else if((mes==8)&&(dia>0 && dia<32)){
            this.dia=dia;
        }
        else if((mes==9)&&(dia>0 && dia<31)){
            this.dia=dia;
        }
        else if((mes==10)&&(dia>0 && dia<32)){
            this.dia=dia;
        }
        else if((mes==11)&&(dia>0 && dia<31)){
            this.dia=dia;
        }
        else if((mes==12)&&(dia>0 && dia<32)){
            this.dia=dia;
        }
        else{
            System.out.println("Dia invalido informado, Informe outro Dia: ");
            dia = leitor.nextInt();
            setData(dia,getMes(),getAno());
            
        }
                
    } // === FINAL SET DATA ===
    
    public String getData(){
        
        String Data;
        Data = String.format("%d/%d/%d",this.dia,this.mes,this.ano);
        return Data;
        
    } // === FINAL GET DATA ===
    
    
    
    
    
    
    
} // === FINAL ===
