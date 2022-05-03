package com.tema;

public class temaLight implements ITema{
    private String corPrincipal="Light";

    public  temaLight(){}

    @Override
    public void setCorPrincipal(String cor) {
        this.corPrincipal=cor;
    }

    @Override
    public String getCorPrincipal() {
        return this.corPrincipal;
    }
}
