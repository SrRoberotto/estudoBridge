package com.webApplication;

import com.tema.ITema;

public class Blog implements IWebApplication{
    protected ITema tema;
    private String url = "http://www.blog.com/";

    public Blog (ITema tema){
        this.tema = tema;
    }

    public void printBlog(){
        System.out.println("---- Blog ----");
        System.out.println("Url do blog: "+ url);
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
