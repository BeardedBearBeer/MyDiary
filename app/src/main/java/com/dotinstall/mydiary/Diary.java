package com.dotinstall.mydiary;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by macworker on 2018/01/03.
 */

public class Diary extends RealmObject {
    @PrimaryKey
    public long id;         // 日記一つ一つのID（プライマリキー）
    public String title;    // タイトル
    public String bodyText; // 日記の内容
    public String date;     // 日記の日付
    public byte[] image;    // 画像
}
