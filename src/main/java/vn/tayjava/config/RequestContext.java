package vn.tayjava.config;

import vn.tayjava.model.LogInfo;

public class RequestContext {

    private static ThreadLocal<LogInfo> currentRequest = new ThreadLocal<>();

    public  static LogInfo getCurrentRequest(){
        return currentRequest.get();
    }

    public static void setCurrentRequest(LogInfo request){
        currentRequest.set(request);
    }

    public static void removeCurrentRequest(){
        currentRequest.remove();
    }
}
