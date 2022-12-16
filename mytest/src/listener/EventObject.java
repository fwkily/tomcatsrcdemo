package listener;
/**
 * @Classname EnentObject
 * @Description TODO
 * @Date 2022/12/13 2:16 PM
 * @Created by fuwk
 */
public class EventObject extends java.util.EventObject {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public EventObject(Object source) { super(source); }

    public void doEvent(){
        System.out.println("通知一个事件源：" + this.getSource());
    }

}
