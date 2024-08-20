import java.util.List;
import java.util.ArrayList;

public class ColecaoPaciente {
    private List<Paciente> pacientes = new ArrayList<Paciente>();

    public void cadastrarPaciente(Paciente paci){
        pacientes.add(paci);  
    }
    
    public void procurarPaciente(int posi){
       
    if(posi >= 0 && posi < pacientes.size()){
         System.out.println("Paciente encontrado");
         System.out.println(pacientes.get(posi));
     }else{
        System.out.println("Paciente não encontrado");
     }

}

public void cadastrarPacientePorPosicao(int posi, Paciente paci){
    if (posi <0 || posi > pacientes.size()+1) {
        System.out.println("Posição invalida");
        return;
}
    if(posi >= 0 && posi <= pacientes.size()){
        pacientes.add(posi, paci);
    }
    
}

public void excluirPacientePorPosicao(int posi){
    if(posi >= 0 && posi < pacientes.size()){
        pacientes.remove(posi);
    }
    if(posi<0 || posi> pacientes.size()){
        System.out.println("Posição invalida");
            return;
    }
}
public void listarPaciente(){
    for(Paciente p: pacientes){
        System.out.println(p.toString());
    }
}

}
