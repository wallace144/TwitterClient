package co.distrital.ud.twitterclient.lib.base;

/**
 * Created by Karol on 14/06/2016.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
