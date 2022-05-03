package com.webApplication;

import com.tema.ITema;

public interface IWebApplication {
    void setUrl(String url);
    String getUrl();
    void setTema(ITema tema);
    ITema getTema();

}
