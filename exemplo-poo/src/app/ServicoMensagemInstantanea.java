package app;
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
	public abstract void receberMensagem();

    protected void validarConexao(){
        System.out.println("Validando conexão");
    }
}
