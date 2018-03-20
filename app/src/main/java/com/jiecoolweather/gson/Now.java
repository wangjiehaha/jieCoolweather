package com.jiecoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WANGJIE on 2018/3/3.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
