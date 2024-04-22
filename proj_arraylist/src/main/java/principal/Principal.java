package principal;
import model.Aluno;
import java.util.*;
import javax.swing.JOptionPane;

public class Principal {
public static void main(String[] args) {
    
ArrayList<Aluno> listasimples = new ArrayList<>();

int opcao = -1;
while(opcao != 9){
    opcao = Integer.parseInt(JOptionPane.showInputDialog(
    "Menu Cadastro Aluno \n"
    +"1 - Inserir (Create)\n"
    +"2 - Consultar (Retrieve)\n"
    +"3 - Atualizar (Update)\n"
    +"4 - Deletar por Id (Delete)\n"
    +"5 - Listar tudo (List All)\n"
            + "9 - Sair\n"));
    switch(opcao){
        case 1:
            Aluno novo = new Aluno();
            novo.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno")));
            novo.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
            novo.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno")));
            novo.setCurso(JOptionPane.showInputDialog("Digite o curso do aluno"));
            novo.setFase(Integer.parseInt(JOptionPane.showInputDialog("Digite a fase do aluno")));
            
            listasimples.add(novo);
            System.out.println("Aluno inserido com sucesso");
            break;
            
        case 2:
            int idConsulta = (Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno a ser consultado")));
            
            int posicaoConsulta = -1;
            for(int i=0;i<listasimples.size();i++){
            if(listasimples.get(i).getId()==idConsulta){
                posicaoConsulta = i;
            }
        }
            if(posicaoConsulta==-1){
                System.out.println("Não existe o aluno com o id: "+idConsulta);
            }else{
                System.out.println("Aluno encontrado com sucesso");
                System.out.println("Id: "+listasimples.get(posicaoConsulta).getId());
                System.out.println("Nome: "+listasimples.get(posicaoConsulta).getNome());
                System.out.println("Idade: "+listasimples.get(posicaoConsulta).getIdade());
                System.out.println("Curso: "+listasimples.get(posicaoConsulta).getCurso());
                System.out.println("Fase: "+listasimples.get(posicaoConsulta).getFase());
            }
            break;
            
        case 3:
            int idAtt = (Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno a ser consultado")));
            
            int posicaoAtt = -1;
            for(int i=0;i<listasimples.size();i++){
            if(listasimples.get(i).getId()==idAtt){
                posicaoAtt = i;
            }
        }
            if(posicaoAtt==-1){
                System.out.println("Não existe o aluno com o id: "+idAtt);
            }else{
            Aluno att = new Aluno();
            att.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno")));
            att.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
            att.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno")));
            att.setCurso(JOptionPane.showInputDialog("Digite o curso do aluno"));
            att.setFase(Integer.parseInt(JOptionPane.showInputDialog("Digite a fase do aluno")));
            
            listasimples.set(posicaoAtt, att);
            System.out.println("Aluno inserido com sucesso");
            }
            break;
            
        case 4:
            
            int idExcluir = (Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno a ser excluido")));
            
            int posicaoExcluir = -1;
            for(int i=0;i<listasimples.size();i++){
            if(listasimples.get(i).getId()==idExcluir){
                posicaoExcluir = i;
            }
        }
            if(posicaoExcluir==-1){
                System.out.println("Não existe o aluno com o id: "+idExcluir);
            }else{
                listasimples.remove(posicaoExcluir);
                System.out.println("Aluno excluido com sucesso");
            }
            break;
            
        case 5:
            
            System.out.println("Listagem de todos os alunos: ");
            for(int i = 0;i<listasimples.size();i++){
                System.out.println("i: "+ i);
                System.out.println("Id: "+ listasimples.get(i).getId());
                System.out.println("Nome: "+ listasimples.get(i).getNome());
                System.out.println("Idade: "+ listasimples.get(i).getIdade());
                System.out.println("Curso: "+ listasimples.get(i).getCurso());
                System.out.println("Fase: "+ listasimples.get(i).getFase());
            }
            break;
            
        case 9:
            System.out.println("Fechando o sistema");
            break;
            
        default:
            System.out.println("Opção inválida");
    }//end switch
}//end while
}//end main
}//end class
