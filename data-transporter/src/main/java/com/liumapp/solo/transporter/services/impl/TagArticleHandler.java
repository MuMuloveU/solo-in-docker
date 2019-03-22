package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.services.HandDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * file TagArticleHandler.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class TagArticleHandler implements HandDataService {

    @Autowired
    private JsonFileContents jsonFileContents;

    @Override
    public void handle() {
        JSONArray tagArticles = jsonFileContents.getTagArticle();
        for (Iterator iterator = tagArticles.iterator(); iterator.hasNext();) {
            JSONObject tagArticle = (JSONObject) iterator.next();
        }
    }

}