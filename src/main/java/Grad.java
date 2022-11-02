public enum Grad {
    BIHAC("037"), ORASJE("031"), TUZLA("035"), ZENICA("032"), GORAZDE("038"), TRAVNIK("030"), MOSTAR("036"), SIROKIBRIJEG("039"), SARAJEVO("033"), BRCKO("049"), MRKONJICGRAD("050"), BANJALUKA("051"), PRIJEDOR("052"), DOBOJ("053"), SAMAC("054"), BIJELJINA("055"), ZVORNIK("056"), PALE("057"), FOCA("058"), TREBINJE("059");
    protected String pozivni;

    private Grad(String pozivni) {
        this.pozivni = pozivni;
    }
}
