package com.example.android.newsapp;

/**
 * Created by tyrone3 on 18.11.16.
 */
public class News {
    private String mTitle;
    private String mSection;
    private String mPublishDate;
    private String mUrl;

    public News(String title, String section, String published, String url) {
        mTitle = title;
        mSection = section;
        mPublishDate = published.split("T")[0];;
        mUrl = url;
    }

    public String getTitle() {return mTitle;}
    public String getSection() {return mSection;}
    public String getPublishDate() {return mPublishDate;}
    public String getUrl() {return mUrl;}
}
