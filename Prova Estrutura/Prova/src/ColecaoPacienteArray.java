public class ColecaoPacienteArray {
    int tamanho=1;
    private Paciente[] pacientes = new Paciente[tamanho] ;
    int cont=0;

    public void aumentaVetor(){
        tamanho++;
        
        Paciente [] novVetor = new Paciente[tamanho];
        System.arraycopy(pacientes, 0, novVetor, 0, pacientes.length);
        pacientes = novVetor;
        
    }

    public void cadastrarPaciente(Paciente paci){
        if (pacientes.length == tamanho) {
            aumentaVetor();
            }
        if(cont<tamanho){
                pacientes[cont]=paci;
                cont++;
            }
        if(cont==tamanho){
                pacientes[cont]=paci;
                cont++;
            }
            
    }

    public void procurarPaciente(int posi){
        if (posi <0 || posi > tamanho) {
            System.out.println("Paciente não encontrado");
            return;
    }
        else{
            System.out.println("Paciente encontrado");
            System.out.println(pacientes[posi].toString());
            
        }
        
         
     }

    public void cadastrarPacientePorPosicao(int posi, Paciente paci){
        if (posi <0 || posi > tamanho) {
            System.out.println("Posição invalida");
            return;
    }
    Paciente[] novoPaciente =  new Paciente[tamanho+1];
    
    for(int i=0;i<posi;i++){
        novoPaciente[i] = pacientes[i];
    }
    
    novoPaciente[posi] = paci;

    for(int j=posi;j<tamanho;j++){
        novoPaciente[j+1] = pacientes[j];
    }
    pacientes = novoPaciente;
    tamanho++;
}

public void excluirPacientePorPosicao(int posi){
    if(posi<0 || posi> tamanho){
        System.out.println("Posição invalida");
            return;
    }
    for(int i = posi;i<tamanho-1;i++){
    pacientes[i] = pacientes[i+1];
    }
    pacientes[tamanho-1] = null;
    tamanho--;
    
}

public void listarPaciente(){
    for(Paciente paci : pacientes){
        if(paci != null){
            System.out.println(paci.toString());
        }
    }
}
    
}
