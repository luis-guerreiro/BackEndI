package Aula6_IntegradoraII;

public class Ip {

    private int[] numeroIp = new int[4];

    public Ip(int n1, int n2, int n3, int n4){
        this.numeroIp[0] = n1;
        this.numeroIp[1] = n2;
        this.numeroIp[2] = n3;
        this.numeroIp[3] = n4;

    }

    @Override
    public String toString(){
        return "IP ["+this.numeroIp[0]+"."+
                this.numeroIp[1]+"."+
                this.numeroIp[2]+"."+
                this.numeroIp[3]+" ]";
    }

    public String getPais(){
        String pais="";
        if(numeroIp[0]<=49){
            pais = "ARG";
        }
        if((numeroIp[0]>=50 && numeroIp[0]<=99)){
            pais = "BRA";
        }
        if((numeroIp[0]>=100 && numeroIp[0]<=149)){
            pais = "COL";
        }
        if(numeroIp[0]>=150 && numeroIp[0]<=255){
            pais = "não existe";
        }
        return pais;
    }
}
