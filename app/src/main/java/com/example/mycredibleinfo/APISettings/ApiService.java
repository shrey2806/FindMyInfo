package com.example.mycredibleinfo.APISettings;

import com.example.mycredibleinfo.EducationDetailPOJOS.EducationDetails;
import com.example.mycredibleinfo.EducationDetailPOJOS.EducationDetailsData;
import com.example.mycredibleinfo.PersonalDetailPOJOS.PersonalDetails2;
import com.example.mycredibleinfo.PersonalDetails;
import com.example.mycredibleinfo.PojoClasses.LoginAndSignup;
import com.example.mycredibleinfo.PojoClasses.ServerTest;
import com.example.mycredibleinfo.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {



    @GET("test")
    Call<ServerTest> getServerStatus();

    @POST("user/login")
    Call<LoginAndSignup> loginUser(@Body User user);

    @POST("user/signup")
    Call<LoginAndSignup> addNewUser(@Body User user);


    @POST("user/personaldetail/{id}")
    Call<PersonalDetails> addPesonalDetails(@Path("id")int id, @Body PersonalDetails2 personalDetails2);


    @POST("user/educationdetail/{id}")
    Call<EducationDetailsData> addEducationDetails(@Path("id")int id,@Body EducationDetails educationDetails);



}