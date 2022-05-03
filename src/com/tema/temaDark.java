package com.tema;

public class temaDark implements ITema{
    private String corPrincipal = "Dark";

    public temaDark(){     }

    @Override
    public void setCorPrincipal(String cor) {
        this.corPrincipal=cor;
    }

    @Override
    public String getCorPrincipal() {
        return this.corPrincipal;
    }
}
