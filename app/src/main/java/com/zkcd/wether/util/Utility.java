package com.zkcd.wether.util;

import android.text.TextUtils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.zkcd.wether.db.Province;

/**
 * @author zzk
 */
public class Utility {
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JsonArray allProvince = new JsonArray(100);
                for (int i = 0; i < allProvince.size(); i++) {
                    JsonObject provinceObject = allProvince.getAsJsonObject();
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getAsString());
                    province.setProvinceCode(provinceObject.getAsInt());
                    province.save();
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponse() {
        return false;
    }

    public static boolean handleCountryResponse() {
        return false;
    }
}
