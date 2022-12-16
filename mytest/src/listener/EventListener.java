package listener;

/**
 * @Classname EventListener
 * @Description TODO
 * @Date 2022/12/13 2:15 PM
 * @Created by fuwk
 */
public interface EventListener extends java.util.EventListener {

    void handleEvent(EventObject event);
}
