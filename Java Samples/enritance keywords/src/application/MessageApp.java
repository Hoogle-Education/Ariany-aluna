package application;

import services.MessageService;
import services.TimeoutMessageService;

public class MessageApp {
  
  public static void main(String[] args) throws InterruptedException {
    
    MessageService[] messages = new MessageService[10];

    messages[0] = new MessageService(1, "Mensagem 1");
    messages[1] = new MessageService(1, "Mensagem 1");
    messages[2] = new TimeoutMessageService(1, "Mensagem 1");
    messages[3] = new MessageService(1, "Mensagem 1");
    messages[4] = new MessageService(1, "Mensagem 1");
    messages[5] = new TimeoutMessageService(1, "Mensagem 1");
    messages[6] = new MessageService(1, "Mensagem 1");
    messages[7] = new MessageService(1, "Mensagem 1");
    messages[8] = new TimeoutMessageService(1, "Mensagem 1");
    messages[9] = new TimeoutMessageService(1, "Mensagem 1");

    System.out.println("----------------------------------------");

    while(true){
      for(int i=0; i<10; i++){
        messages[i].advanceTime();
        System.out.println("Message #" + i 
                            + "class = " + messages[i].getClass() 
                            + " || status = " + messages[i].confirmMessage());
        Thread.sleep(500);
      }

      System.out.println("----------------------------------------");
    }
      
  }

}
