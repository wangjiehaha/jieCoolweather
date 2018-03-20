package com.jiecoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WANGJIE on 2018/3/3.
 */

public class Basic {
    @SerializedName("city")//字段不合适时可以利用该方法来让JSON字段和java字段简历映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
