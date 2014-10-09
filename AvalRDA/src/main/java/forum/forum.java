package forum;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("forum")
public class forum implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Assunto")
   @org.kie.api.definition.type.Position(2)
   private java.lang.String assunto;

   @org.kie.api.definition.type.Label("Categoria")
   @org.kie.api.definition.type.Position(3)
   private String categoria;

   @org.kie.api.definition.type.Label("Data da Solicita\u00E7\u00E3o")
   @org.kie.api.definition.type.Position(1)
   private java.lang.String data_solicitacao;

   @org.kie.api.definition.type.Label("Mensagem")
   @org.kie.api.definition.type.Position(4)
   private java.lang.String mensagem;

   @org.kie.api.definition.type.Label("Solicitante")
   @org.kie.api.definition.type.Position(0)
   private java.lang.String solicitante;

   public java.lang.String getAssunto()
   {
      return this.assunto;
   }

   public void setAssunto(java.lang.String assunto)
   {
      this.assunto = assunto;
   }

   public java.lang.String getData_solicitacao()
   {
      return this.data_solicitacao;
   }

   public void setData_solicitacao(java.lang.String data_solicitacao)
   {
      this.data_solicitacao = data_solicitacao;
   }

   public java.lang.String getMensagem()
   {
      return this.mensagem;
   }

   public void setMensagem(java.lang.String mensagem)
   {
      this.mensagem = mensagem;
   }

   public java.lang.String getSolicitante()
   {
      return this.solicitante;
   }

   public void setSolicitante(java.lang.String solicitante)
   {
      this.solicitante = solicitante;
   }

   public java.lang.String getCategoria()
   {
      return this.categoria;
   }

   public void setCategoria(java.lang.String categoria)
   {
      this.categoria = categoria;
   }

   public forum()
   {
   }

   public forum(java.lang.String solicitante,
         java.lang.String data_solicitacao, java.lang.String assunto,
         java.lang.String categoria, java.lang.String mensagem)
   {
      this.solicitante = solicitante;
      this.data_solicitacao = data_solicitacao;
      this.assunto = assunto;
      this.categoria = categoria;
      this.mensagem = mensagem;
   }

}