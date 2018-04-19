package cheggAugust;

import java.util.Date;

class Channel{ // New Class added
private Date date;
public void send(Date message){
this.date =message;
}
public Date receive(){
return date;
}
}