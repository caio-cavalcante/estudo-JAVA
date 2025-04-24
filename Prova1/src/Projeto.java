public class Projeto implements IEntity {
    public int codigo;
    public String nome;
    public String descricao;
    public String dataInicio;
    public String dataFim;
    public String responsavel;
    public String programador1;
    public String programador2;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Analista analista) {
        this.responsavel = analista.getNome();
    }

    public void setProgramador1(Programador prog1){
        this.programador1 = prog1.getNome();
    }

    public void setProgramador2(Programador prog2){
        this.programador2 = prog2.getNome();
    }

    @Override
    public Object getIdentificador() {
        return null;
    }

    @Override
    public String getConteudoBusca() {
        return this.nome;
    }

    @Override
    public void imprimeDados() {
        System.out.println(this.nome + ", " + this.responsavel + ", " + this.programador1 + ", " + this.programador2);
    }
}
