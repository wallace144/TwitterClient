package co.distrital.ud.twitterclient.api;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterApiClient;

/**
 * Created by ASUS on 30/06/2016.
 */
public class CustomTwitterApiClient extends TwitterApiClient {
    public CustomTwitterApiClient(Session session) {
        super(session);
    }

    public TimeLineService getTimeLineService(){
     return getService(TimeLineService.class);
    }
}
