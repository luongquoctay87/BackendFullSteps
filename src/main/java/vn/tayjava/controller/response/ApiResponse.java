package vn.tayjava.controller.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApiResponse {

    public ApiResponse() {
        // TODO document why this constructor is empty
    }

    public static String success(int status, String message, Object data) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("status", status);
        result.put("message", message);
        result.put("data", data);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        return gson.toJson(result);
    }

    public static String success(int status, String message) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("status", status);
        result.put("message", message);

        return new Gson().toJson(result);
    }
}
