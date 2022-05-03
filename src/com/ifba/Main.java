package com.ifba;

import com.tema.*;
import com.webApplication.*;

public class Main {

    public static void main(String[] args) {
	    // criando um blog com tema dark
        Blog blogDark = new Blog(new temaDark());

        // Criando um News Site com tema light
        News newsLight = new News(new temaLight());

        // Criando um Store inicialmente com tema light
        Store store = new Store(new temaLight());

        blogDark.printBlog();
        newsLight.printNews();
        store.printStore(); //Store com tema ligth

        //mudando o tema do Store
        store.setTema(new temaDark());
        store.printStore(); //Store com tema dark

    }
}
