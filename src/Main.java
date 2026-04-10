import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Alunos = 1;
        String Nome;
        int Contador = 0;
        String Nome_Aluno_Bom;
        Float Nota_Boa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos ");
        Alunos = sc.nextInt();
        sc.nextLine();
        Float[] Notas_Alunos = new Float[Alunos];
        String[] Alunos_Nome = new String[Alunos];
        Float[] Ordem_Notas = new Float[Alunos];

        while ( Contador < Alunos) {
            System.out.println("Digite o nome do aluno " + (Contador + 1));
            Alunos_Nome[Contador] = sc.nextLine();
            System.out.println("Digite a nota de " + Alunos_Nome[Contador]);
            Notas_Alunos[Contador] = sc.nextFloat();
            sc.nextLine();
            Contador = Contador + 1;
        }
        Contador = 1;
        Nota_Boa = Notas_Alunos[0];
        Nome_Aluno_Bom = Alunos_Nome[0];

        while (Contador < Alunos) {
            if (Notas_Alunos[Contador] > Nota_Boa) {
                Nota_Boa = Notas_Alunos[Contador];
                Nome_Aluno_Bom = Alunos_Nome[Contador];
            }
            Contador++;
        }
        System.out.println("Nome do aluno com a maior nota :" + Nome_Aluno_Bom + "\n Nota: " + Nota_Boa);
    }
}
