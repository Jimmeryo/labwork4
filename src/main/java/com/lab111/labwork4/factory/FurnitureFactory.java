package com.lab111.labwork4.factory;

import com.lab111.labwork4.furniture.chair.Chair;
import com.lab111.labwork4.furniture.table.Table;
import com.lab111.labwork4.furniture.sofa.Sofa;
import com.lab111.labwork4.furniture.bookshelf.Bookshelf;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
    Bookshelf createBookshelf();
}