package core;

public class DefaultMessageService implements MessageService {
MessageSource src;
MessageDestination des;

public void setSrc(MessageSource source){
	this.src=source;
}
public void setDes(MessageDestination destination){
	this.des=destination;
}
@Override
public void execute() {
	des.write(src.getMessage());
	
}

}
