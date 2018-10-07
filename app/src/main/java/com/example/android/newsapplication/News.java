package com.example.android.newsapplication;

public class News {
    /**
     * news Name
     */
    private String msectionName;

    /**
     * Title
     */
    private String mWebTitle;

    /**
     * Time of news
     */
    private String mWebPublicationDate;

    /**
     * Website URL of the earthquake
     */
    private String mWebUrl;

    private String mAuthorname;

    /**
     * Constructs a new {@link News} object.
     *
     * @param sectionName        is the name of the news
     * @param webTitle           is the function of the news that is happening
     * @param webPublicationDate is the time
     * @param webUrl             is the website URL to find more details about the news
     */
    public News(String sectionName, String webTitle, String webPublicationDate, String webUrl, String authorName) {
        msectionName = sectionName;
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mWebUrl = webUrl;
        mAuthorname = authorName;
    }

    /**
     * Returns the title of news, function name, url and time
     */
    public String getSectionName() {
        return msectionName;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

    public String getAuthorName() {
        return mAuthorname;
    }
}
