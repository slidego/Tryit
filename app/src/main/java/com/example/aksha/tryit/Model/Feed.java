package com.example.aksha.tryit.Model;

/**
 * Created by Aksha on 27/06/2017.
 */

public class Feed {

    private String downloadUrl;
    private String uid;
    private String filePath;
    private String title;
    private String thumbnail;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Feed() {

    }


    public Feed(String downloadUrl, String uid, String filePath, String title) {

        this.downloadUrl = downloadUrl;
        this.uid = uid;
        this.filePath = filePath;
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
