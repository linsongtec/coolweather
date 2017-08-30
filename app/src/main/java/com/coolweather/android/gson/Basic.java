package com.coolweather.android.gson.;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/27.
 */

public class Basic {
    @SerializedName("name")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
