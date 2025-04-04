package com.greenAcademy.example.service.impl;

import com.greenAcademy.example.model.Category;
import com.greenAcademy.example.service.CategoryService;

public class CatergorySevervice implements CategoryService {
    private Category[] categories;
    private int index = 0;

    public CatergorySevervice() {

       categories = new Category[3];

    }

}
