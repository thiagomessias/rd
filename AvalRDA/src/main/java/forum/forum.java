package forum;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label(value = "forum")
public class forum implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Assunto")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String assunto;

    @org.kie.api.definition.type.Label(value = "Categoria")
    @org.kie.api.definition.type.Position(value = 3)
    private java.util.List<java.lang.String> categoria;

    @org.kie.api.definition.type.Label(value = "Data da Solicita\u00E7\u00E3o")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String data_solicitacao;

    @org.kie.api.definition.type.Label(value = "Mensagem")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String mensagem;

    @org.kie.api.definition.type.Label(value = "Solicitante")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String solicitante;

    public forum() {
    }
    
    public forum(java.lang.String solicitante, java.lang.String data_solicitacao, java.lang.String assunto, java.util.List<java.lang.String> categoria, java.lang.String mensagem) {
        this.solicitante = solicitante;
        this.data_solicitacao = data_solicitacao;
        this.assunto = assunto;
        this.categoria = categoria;
        this.mensagem = mensagem;
    }

    public java.lang.String getAssunto() {
        return this.assunto;
    }
    
    public void setAssunto(java.lang.String assunto) {
        this.assunto = assunto;
    }

    public java.util.List<java.lang.String> getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(java.util.List<java.lang.String> categoria) {
        this.categoria = categoria;
    }

    public java.lang.String getData_solicitacao() {
        return this.data_solicitacao;
    }
    
    public void setData_solicitacao(java.lang.String data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }

    public java.lang.String getMensagem() {
        return this.mensagem;
    }
    
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }

    public java.lang.String getSolicitante() {
        return this.solicitante;
    }
    
    public void setSolicitante(java.lang.String solicitante) {
        this.solicitante = solicitante;
    }

}