public class ComputadorPedrinho {
    public static void main(String[] args) {
		//abrindo MSN Messenger
        System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

        System.out.println("Telegram");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();

        System.out.println("Messenger");
        FacebookMessenger messenger = new FacebookMessenger();
        messenger.enviarMensagem();
        messenger.receberMensagem();
	}
}
