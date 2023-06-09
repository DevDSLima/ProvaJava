
package provapoo;

import java.time.LocalDate;

public class Advogado extends Funcionario{
    private String oab;

    @Override
    public String toString() {
        return "\n\nAdvogado: " + super.toString() 
                + "\nOab = " + oab;
    }

    
    
    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
    
    
    
    
}
