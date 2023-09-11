package Problema3;

public class User implements Observer {
    private String name;

    private Actions channel;

    public User(String name, Channel channel) {
        this.name = name;
        this.channel = channel;
        channel.subscribe(this);
    }

    @Override
    public void update(String message) {
        System.out.println("User " + this.name + " a fost notificat/ă de aparatitia noului video, numit: " + message + "!");
    }
}

