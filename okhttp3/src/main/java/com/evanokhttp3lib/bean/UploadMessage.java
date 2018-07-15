package com.evanokhttp3lib.bean;

import com.evanokhttp3lib.HttpInfo;
import com.evanokhttp3lib.callback.ProgressCallback;

/**
 * 上传响应回调信息体
 * @author zhousf
 */
public class UploadMessage extends OkMessage{

    public String filePath;
    public HttpInfo info;
    public ProgressCallback progressCallback;

    public UploadMessage(int what, String filePath, HttpInfo info, ProgressCallback progressCallback, String requestTag) {
        this.what = what;
        this.filePath = filePath;
        this.info = info;
        this.progressCallback = progressCallback;
        super.requestTag = requestTag;
    }
}