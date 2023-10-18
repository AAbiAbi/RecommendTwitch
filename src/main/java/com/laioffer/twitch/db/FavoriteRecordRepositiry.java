package com.laioffer.twitch.db;

import com.laioffer.twitch.db.entity.ItemEntity;

import java.util.List;

public interface FavoriteRecordRepositiry {
    List<FavoriteRecordRepositiry> findAllByUserId(Long userId);

}
