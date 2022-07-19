package services;

import java.util.Random;

import services.enums.Status;

public class MessageService {
  
  private int id; 
  private String message;
  protected Status status;

  // to generate a random value
  private Random random = new Random();

  public MessageService(int id, String mess*age) {
    this.id = id;
    this.message = message;

    int randomValue = random.nextInt(7);

    if(randomValue == 3) 
      this.status = Status.ERRO_AO_ENVIAR;
    else 
      this.status = Status.ENVIADA;

  }  

  public void deleteMessage(){
    this.status = Status.APAGADA;
  }

  public Status confirmMessage(){
    if(status != Status.APAGADA && status != Status.ERRO_AO_ENVIAR) 
      this.status = Status.ENVIADA;

    return status;
  }

  public void advanceTime(){
  }

  public int getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }
  
}
