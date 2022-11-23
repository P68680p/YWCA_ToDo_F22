package com.example.ywca_todo_f22;

import android.app.Application;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyApp extends Application {
    static int saveCode = 1;  //if save
    static int cancelCode = 0;   //without saving

    //**** for testing
    private ArrayList<ToDo> listOfToDos;
//****

    public ArrayList<ToDo> getList() {
        //**** for testing
        if (listOfToDos == null) {
            listOfToDos = new ArrayList<>(0);
// ****           listOfToDos.add(new ToDo("Fix the door", "Nov 20, 2022", false));
// ****           listOfToDos.add(new ToDo("Finish assignment", "Nov 23, 2022", false));
// ****           listOfToDos.add(new ToDo("walk the dog", "Nov 18, 2022", true));
        }
        //****

        return listOfToDos;
    }

    public void addNewToDo(ToDo toadd) {
        listOfToDos.add(toadd);
    }

}
