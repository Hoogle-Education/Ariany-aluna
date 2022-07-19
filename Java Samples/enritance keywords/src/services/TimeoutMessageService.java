package services;

import services.enums.Status;

public class TimeoutMessageService extends MessageService {

  private int minutesToDelete;

  public TimeoutMessageService(int id, String message) {
    super(id, message);
    minutesToDelete = 3;
  }

  @Override
  public void deleteMessage(){
  }

  @Override
  public void advanceTime(){
    minutesToDelete--;
  }

  @Override
  public Status confirmMessage(){

    status = super.confirmMessage();

   if( status == Status.ENVIADA && minutesToDelete <= 0 ){
     status = Status.APAGADA;
   }

   return status;
  }
  
}
