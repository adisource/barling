package com.example.barberbooking.Interface;

import com.example.barberbooking.Model.Banner;

import java.util.List;

public interface ILookBookLoadListener {
    void onLookbookLoadSuccess(List<Banner> banners);
    void onLookbookLoadFailed(String message);
}
