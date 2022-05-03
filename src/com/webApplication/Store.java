package com.webApplication;

import com.tema.ITema;

public class Store implements IWebApplication{
    protected ITema tema;
    private String url = "http://www.store.com/";

    public Store(ITema tema){
        this.tema = tema;
    }

    public void printStore(){
        System.out.println("---- Store ----");
        System.out.println("Url da loja: "+ url);
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
