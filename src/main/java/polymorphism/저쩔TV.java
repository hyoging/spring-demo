package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")

public class 저쩔TV implements TV {

    @Autowired
    private Speaker speaker;

    public void powerOn(){
        System.out.println("저쩔티비 ----전원켠다.");
    }
    public void powerOff(){
        System.out.println("저쩔티비 ----전원끈다.");
    }
    public void volumeUp(){
        speaker.volumeUp();
    }
    public void volumeDown(){
       speaker.volumeDown();
    }
}
