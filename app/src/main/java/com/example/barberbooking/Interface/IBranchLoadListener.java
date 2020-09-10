package com.example.barberbooking.Interface;

import com.example.barberbooking.Model.Salon;

import java.util.List;

public interface IBranchLoadListener {
    void onBranchLoadSuccess (List<Salon> areaNameList);
    void onBranchLoadFailed (String message);
}
