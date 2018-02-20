package com.example.redoyahmed.ezyperl.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by redoy.ahmed on 20-Feb-2018.
 */

public class PlaylistResponse
{
    private String etag;

    private Items[] items;

    private PageInfo pageInfo;

    private String nextPageToken;

    private String kind;

    public String getEtag ()
    {
        return etag;
    }

    public void setEtag (String etag)
    {
        this.etag = etag;
    }

    public Items[] getItems ()
    {
        return items;
    }

    public void setItems (Items[] items)
    {
        this.items = items;
    }

    public PageInfo getPageInfo ()
    {
        return pageInfo;
    }

    public void setPageInfo (PageInfo pageInfo)
    {
        this.pageInfo = pageInfo;
    }

    public String getNextPageToken ()
    {
        return nextPageToken;
    }

    public void setNextPageToken (String nextPageToken)
    {
        this.nextPageToken = nextPageToken;
    }

    public String getKind ()
    {
        return kind;
    }

    public void setKind (String kind)
    {
        this.kind = kind;
    }
}