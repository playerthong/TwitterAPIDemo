package net.thinktodo.demowithtwitter.api;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterApiClient;
import com.twitter.sdk.android.core.models.User;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by nmthong on 2/16/2016.
 */
public class MyTwitterApiClient extends TwitterApiClient {
    public MyTwitterApiClient(Session session) {
        super(session);
    }

}
interface CustomService {
    @GET("/1.1/users/show.json")
    void show(@Query("user_id") long id, Callback<User> cb);
}