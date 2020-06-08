package com.example.facebookfeed;

public class PostModel {
    int id, likeCounts, commentsCount, userProfilepic, postPic;
    String name, time, status;

    public PostModel(int id, int likeCounts, int commentsCount, int userProfilepic, int postPic,
                     String name, String time, String status) {
        this.id = id;
        this.likeCounts = likeCounts;
        this.commentsCount = commentsCount;
        this.userProfilepic = userProfilepic;
        this.postPic = postPic;
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikeCounts() {
        return likeCounts;
    }

    public void setLikeCounts(int likeCounts) {
        this.likeCounts = likeCounts;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public int getUserProfilepic() {
        return userProfilepic;
    }

    public void setUserProfilepic(int userProfilepic) {
        this.userProfilepic = userProfilepic;
    }

    public int getPostPic() {
        return postPic;
    }

    public void setPostPic(int postPic) {
        this.postPic = postPic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
