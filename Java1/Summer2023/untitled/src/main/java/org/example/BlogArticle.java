package org.example;

import java.util.Date;

public class BlogArticle {

    private String title;
    private String bannerImageLing;
    private String author;
    private Date publishDate;
    private String articleBody;

    // Getters retrieve private data

    // Setters change/modify private data
    // Also allow you to add functionality, like validation or formatting


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBannerImageLing() {
        return bannerImageLing;
    }

    public void setBannerImageLing(String bannerImageLing) {
        this.bannerImageLing = bannerImageLing;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }

    public String getFormattedString() {
        //This is different from an actual getter because you're not retrieving from a private field
        return "Title " + title + " Author" + author;
    }
}
