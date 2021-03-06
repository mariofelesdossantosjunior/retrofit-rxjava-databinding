package br.com.hussan.githubapi.api;

import java.util.List;

import br.com.hussan.githubapi.models.Repository;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by hussan on 4/11/16.
 */
public interface ApiInterface {

    @GET("/users/{user}/repos")
    Observable<List<Repository>> repositories(
            @Path("user") String user
    );
}
