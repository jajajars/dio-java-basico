import app.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
        validarConexao();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}
