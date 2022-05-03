package com.webApplication;

import com.tema.ITema;

public class News implements IWebApplication{
    protected ITema tema;
    private String url = "http://www.news.com/";

    public News(ITema tema){
        this.tema = tema;
    }

    public void printNews(){
        System.out.println("---- News Site ----");
        System.out.println("Url do jornal: "+ url);
        System.out.println("Cor principal: " + tema.getCorPrincipal() + "\n");
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public void setTema(ITema tema) {
        this.tema = tema;
    }

    @Override
    public ITema getTema() {
        return tema;
    }
}
