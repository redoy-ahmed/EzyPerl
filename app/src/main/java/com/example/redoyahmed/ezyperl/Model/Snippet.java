package com.example.redoyahmed.ezyperl.Model;

/**
 * Created by redoy.ahmed on 20-Feb-2018.
 */

public class Snippet {

    private String position;

    private String publishedAt;

    private ResourceId resourceId;

    private String playlistId;

    private String title;

    private String channelId;

    private String description;

    private String channelTitle;

    private Thumbnails thumbnails;

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public String getPublishedAt ()
    {
        return publishedAt;
    }

    public void setPublishedAt (String publishedAt)
    {
        this.publishedAt = publishedAt;
    }

    public ResourceId getResourceId ()
    {
        return resourceId;
    }

    public void setResourceId (ResourceId resourceId)
    {
        this.resourceId = resourceId;
    }

    public String getPlaylistId ()
    {
        return playlistId;
    }

    public void setPlaylistId (String playlistId)
    {
        this.playlistId = playlistId;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getChannelId ()
    {
        return channelId;
    }

    public void setChannelId (String channelId)
    {
        this.channelId = channelId;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getChannelTitle ()
    {
        return channelTitle;
    }

    public void setChannelTitle (String channelTitle)
    {
        this.channelTitle = channelTitle;
    }

    public Thumbnails getThumbnails ()
    {
        return thumbnails;
    }

    public void setThumbnails (Thumbnails thumbnails)
    {
        this.thumbnails = thumbnails;
    }
}
