package Questão 0um;
import java.util.Scanner;

public class objenfermo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo;
        String nome, planoSaude, alergia, dataNascimento, tipoSanguineo, sexo, r;

        System.out.println("Informações do Paciente: ");
        System.out.println("Código: ");
        codigo = scan.nextInt();
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Data de Nascimento: ");
        dataNascimento = scan.next();
        System.out.println("Sexo [F/M]: ");
        sexo = scan.next().toUpperCase();
        System.out.println("Plano de Saúde: ");
        planoSaude = scan.next();
        System.out.println("Possui alergias? [S/N] ");
        r = scan.next().toUpperCase();
        if (r.equals("S")){
            System.out.println("Qual é a alergia do paciente? ");
            alergia = scan.next();
        }else{
            alergia = "Não possui";
        }
        System.out.println("Tipo Sanguíneo: ");
        tipoSanguineo = scan.next();

        Enfermo enfermo = new Enfermo (codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo);
        System.out.println("");
        paciente.mostPaciente();
        System.out.println("");

        System.out.println("DADOS DO(A) PAI(MÃE)");
        System.out.println("Código: ");
        codigo = scan.nextInt();
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Data de Nascimento: ");
        dataNascimento = scan.next();
        System.out.println("Sexo [F/M]: ");
        sexo = scan.next().toUpperCase();
        System.out.println("Plano de Saúde: ");
        planoSaude = scan.next();
        System.out.println("Possui alergias? [S/N] ");
        r = scan.next().toUpperCase();
        if (r.equals("S")){
            System.out.println("Qual é a alergia do paciente? ");
            alergia = scan.next();
        }else{
            alergia = "Não possui";
        }
        System.out.println("Tipo Sanguíneo: ");
        tipoSanguineo = scan.next();

        Enfermo paimae = new Enfermo (codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo);
        System.err.println("");
        paimae.mostPaiouMae();

        scan.close();

    }
}
