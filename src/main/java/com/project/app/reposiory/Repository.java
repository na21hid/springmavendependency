package com.project.app.reposiory;

import com.project.app.model.Human;

public interface Repository {

        Human read(int id);
        void write(Human human);
        void printall();
}
