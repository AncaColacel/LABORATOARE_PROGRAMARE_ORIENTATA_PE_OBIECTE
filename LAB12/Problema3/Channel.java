package Problema3;

import java.util.ArrayList;

// clasa ce implementeaza interfata subiect
// deoarece canalul este obiectul observat
public class Channel implements Actions {
    // intotdeauna are un vector cu obiecte care observa
    // aici fiind Useri
    private ArrayList<User> subscribers;

    public Channel() {
        subscribers = new ArrayList<User>();
    }

    public void newVideoUploaded(String title) {
        notify(title);
    }

    @Override
    public void subscribe(User user) {
        subscribers.add(user);
    }

    @Override
    public void unsubscribe(User user) {
        subscribers.remove(user);
    }

    @Override
    public void notify(String notification) {
        for(User u : subscribers)
            u.update(notification);
    }
}
