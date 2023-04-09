import java.util.ArrayList;
import java.util.List;

class Usersub {
    private static Usersub instance;
    private List<Subscriber> subscribers;

    private Usersub() {
        subscribers = new ArrayList<>();
    }

    public static Usersub getInstance() {
        if(instance == null) {
            instance = new Usersub();
        }
        return instance;
    }

    public void addSubscriber(Subscriber subscriber) {

        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {

        subscribers.remove(subscriber);
    }

    public void pushSubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}

