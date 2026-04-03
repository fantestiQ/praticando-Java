package padroes_de_projeto.padroes_criacao.abstract_factory;

public class Cliente {
    private String gradeRequest;
    private boolean hasCompanyContract;

    public Cliente (String gradeRequest,boolean hasCompanyContract){
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }
    public boolean hasCompanyContract(){
        return hasCompanyContract;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}
